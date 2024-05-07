package paradigmas.Threads;

import java.util.concurrent.*;
import Menu.*;

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
        Menu menu = new Menu("Ordem e Progresso", 100);
        menu.start();
        menu.text("Digite o número de clientes", 3);
        String numeroClientes = menu.input();
        menu.text("Digite o número de servidores", 3);
        String numeroServidores = menu.input();

        Servidor servidor = new Servidor(Integer.parseInt(numeroServidores));

        System.out.print("\033[H");
        System.out.print("\033[0J");
        for (int i = 0; i < Integer.parseInt(numeroClientes); i++) {
            Thread cliente = new Thread(new Cliente(i + 1, servidor));
            cliente.start();
        }
    }
}
