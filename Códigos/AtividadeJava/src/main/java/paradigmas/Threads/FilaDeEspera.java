package paradigmas.Threads;

import java.util.concurrent.*;

class Cliente implements Runnable {
    private final int id;
    private final Servidor servidor;

    public Cliente(int id, Servidor servidor) {
        this.id = id;
        this.servidor = servidor;
    }

    @Override
    public void run() {
        try {
            servidor.atenderCliente(id);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Servidor {
    private final Semaphore semaforo;

    public Servidor(int numeroDeServidores) {
        this.semaforo = new Semaphore(numeroDeServidores);
    }

    public void atenderCliente(int id) throws InterruptedException {
        semaforo.acquire();
        System.out.println("Cliente " + id + " está sendo atendido pelo servidor " + Thread.currentThread().getName());
        Thread.sleep(2000);
        System.out.println("Cliente " + id + " foi atendido pelo servidor " + Thread.currentThread().getName());
        semaforo.release();
    }
}

public class FilaDeEspera {
    public static void main(String[] args) {
        final int NUMERO_DE_CLIENTES = 10;
        final int NUMERO_DE_SERVIDORES = 3;

        Servidor servidor = new Servidor(NUMERO_DE_SERVIDORES);

        for (int i = 0; i < NUMERO_DE_CLIENTES; i++) {
            Thread cliente = new Thread(new Cliente(i + 1, servidor));
            cliente.start();
        }
    }
}
