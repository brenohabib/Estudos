package org.Arquitetura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Layer {
    public static class Cliente {
        private String nome;
        private String email;

        public Cliente(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Cliente: " + nome + " (Email: " + email + ")";
        }
    }

    public static class ClienteRepositorio {
        private List<Cliente> clientes;

        public ClienteRepositorio() {
            this.clientes = new ArrayList<>();
        }

        public void salvar(Cliente cliente) {
            clientes.add(cliente);
        }

        public List<Cliente> listarTodos() {
            return new ArrayList<>(clientes);
        }
    }

    public static class ClienteServico {
        private ClienteRepositorio repositorio;

        public ClienteServico() {
            this.repositorio = new ClienteRepositorio();
        }

        public boolean cadastrarCliente(String nome, String email) {
            if (nome == null || nome.trim().isEmpty()) {
                return false;
            }

            if (!validarEmail(email)) {
                return false;
            }

            Cliente novoCliente = new Cliente(nome, email);
            repositorio.salvar(novoCliente);
            return true;
        }

        private boolean validarEmail(String email) {
            if (email == null || email.trim().isEmpty()) {
                return false;
            }
            return email.contains("@") && email.contains(".");
        }

        public List<Cliente> listarClientes() {
            return repositorio.listarTodos();
        }
    }

    public static class ClienteUI {
        private ClienteServico servico;
        private Scanner scanner;

        public ClienteUI() {
            this.servico = new ClienteServico();
            this.scanner = new Scanner(System.in);
        }

        public void iniciar() {
            while (true) {
                exibirMenu();
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarCliente();
                        break;
                    case 2:
                        listarClientes();
                        break;
                    case 3:
                        System.out.println("Saindo do sistema...");
                        return;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }

        private void exibirMenu() {
            System.out.println("\n======== Menu ========");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
        }

        private void cadastrarCliente() {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o email do cliente: ");
            String email = scanner.nextLine();

            boolean sucesso = servico.cadastrarCliente(nome, email);
            if (sucesso) {
                System.out.println("Cliente cadastrado com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar cliente. Verifique os dados e tente novamente!.");
            }
        }

        private void listarClientes() {
            System.out.println("\n=== Clientes Cadastrados ===");
            servico.listarClientes().forEach(System.out::println);
        }
    }

}
