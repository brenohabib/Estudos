package atividade2.Aula14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Menu.*;

public class Arquivos {
    static Menu fileMenu = new Menu("Super arquivo 3000", 100);
    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            fileMenu.start();
            fileMenu.text("Escolha uma opção:", 1);
            fileMenu.text("1. Criar arquivo", 2, Alignment.LEFT);
            fileMenu.text("2. Verificar se arquivo existe", 3, Alignment.LEFT);
            fileMenu.text("3. Remover arquivo", 4, Alignment.LEFT);
            fileMenu.text("4. Ler conteúdo de arquivo", 5, Alignment.LEFT);
            fileMenu.text("5. Alterar arquivo", 6, Alignment.LEFT);
            fileMenu.text("6. Sair", 7, Alignment.LEFT);

            String opcao = fileMenu.input();

            switch (opcao) {
                case "1":
                    fileMenu.start();
                    fileMenu.text("Insira o nome do arquivo", 3);
                    String nomeArquivo = fileMenu.input();
                    criarArquivo(nomeArquivo);
                    break;
                case "2":
                    fileMenu.start();
                    fileMenu.text("Insira o nome do arquivo a ser verificado: ", 3);
                    String nomeArquivoVerificar = fileMenu.input();
                    verificarArquivo(nomeArquivoVerificar);
                    break;
                case "3":
                    fileMenu.start();
                    fileMenu.text("Insira o nome do arquivo a ser removido: ", 3);
                    String nomeArquivoRemover = fileMenu.input();
                    removerArquivo(nomeArquivoRemover);
                    break;
                case "4":
                    fileMenu.start();
                    fileMenu.text("Insira o nome do arquivo a ser lido: ", 3);
                    String nomeArquivoLer = fileMenu.input();
                    lerConteudoArquivo(nomeArquivoLer);
                    break;
                case "5":
                    fileMenu.start();
                    fileMenu.text("Insira o nome do arquivo a ser alterado", 3);
                    String nomeArquivoAlterar = fileMenu.input();

                    fileMenu.start();
                    fileMenu.text("Insira o conteudo do arquivo", 3);
                    String conteudoArquivoAlterar = fileMenu.input();
                    alterarConteudoArquivo(nomeArquivoAlterar, conteudoArquivoAlterar);
                    break;
                case "6":
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void criarArquivo(String nome) {
        try {
            File arquivo = new File(nome);
            if (arquivo.createNewFile()) {
                fileMenu.text("Arquivo criado: " + arquivo.getName(), 4);
            } else {
                fileMenu.text("O arquivo já existe.", 4);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }

    private static void verificarArquivo(String nome) {
        File arquivo = new File(nome);
        if (arquivo.exists()) {
            fileMenu.text("O arquivo " + nome + " existe.", 4);
        } else {
            fileMenu.text("O arquivo " + nome + " não existe.", 4);
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("Sleep não funcionou.");
            e.printStackTrace();
        }
    }

    private static void removerArquivo(String nome) {
        File arquivo = new File(nome);
        if (arquivo.delete()) {
            fileMenu.text("O arquivo " + nome + " foi removido.", 4);
        } else {
            fileMenu.text("O arquivo " + nome + " não pôde ser removido.", 4);
        }
    }

    private static void lerConteudoArquivo(String nome) {
        boolean reading = true;
        try {
            File arquivo = new File(nome);
            Scanner leitor = new Scanner(arquivo);
            String options = "";
            int lines = 2;
            while (reading) {
                fileMenu.start();
                while (leitor.hasNextLine() && lines <= 5) {
                    fileMenu.text(leitor.nextLine(), lines++);
                }
                fileMenu.text("next - 1", 6, Alignment.RIGHT);
                fileMenu.text("stop - 2", 7, Alignment.RIGHT);
                options = fileMenu.input();
                lines = 2;
                if (!leitor.hasNextLine() || options.equals("2")) {
                    break;
                }
            }

            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }

    private static void alterarConteudoArquivo(String nome, String conteudo) {
        removerArquivo(nome);
        File arquivo = new File(nome);
        try (FileWriter escritor = new FileWriter(arquivo)) {
            escritor.write(conteudo);
        } catch (IOException e) {
            System.out.println("Não foi possível escrever no arquivo. Verifique se digitou o nome correto.");
            e.printStackTrace();
        }
    }
}
