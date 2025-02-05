package Telas.Paineis;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Objects;

public class PainelUsuario extends JPanel {
    private JPanel mainPanel;
    private JTextField nomeField;
    private JTextField tipoField;
    private JTextField emailField;
    private JTextField senhaField;
    private JButton cadastrarButton;
    private JComboBox<String> comboBoxCadastrar;
    private JTextField telefoneField;
    private JTextField especialidadeField;
    private JPanel telefonePanel;
    private JPanel especialidadePanel;
    private JPanel senhaPanel;
    private JPanel tipoPanel;

    public PainelUsuario() {
        comboBoxCadastrar.addItem("Administrador");
        comboBoxCadastrar.addItem("Cliente");
        comboBoxCadastrar.addItem("Prestador de Serviço");

        add(mainPanel);

        setupListeners();

        updateVisibility("Administrador");
    }

    private void setupListeners() {
        cadastrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleCadastro();
            }
        });

        comboBoxCadastrar.addActionListener(e -> {
            String selectedItem = (String) comboBoxCadastrar.getSelectedItem();
            updateVisibility(selectedItem);
        });

        updateVisibility("Administrador");
    }

    private void updateVisibility(String selectedItem) {
        if (Objects.equals(selectedItem, "Administrador")) {
            tipoPanel.setVisible(true);
            senhaPanel.setVisible(true);
            telefonePanel.setVisible(false);
            especialidadePanel.setVisible(false);
        } else if (Objects.equals(selectedItem, "Cliente")) {
            tipoPanel.setVisible(false);
            senhaPanel.setVisible(false);
            telefonePanel.setVisible(true);
            especialidadePanel.setVisible(false);
        } else if (Objects.equals(selectedItem, "Prestador de Serviço")) {
            tipoPanel.setVisible(false);
            senhaPanel.setVisible(false);
            telefonePanel.setVisible(false);
            especialidadePanel.setVisible(true);
        }
        revalidate();
        repaint();
    }

    private void handleCadastro() {
        try {
            String selectedItem = (String) comboBoxCadastrar.getSelectedItem();
            boolean success = false;

            if (Objects.equals(selectedItem, "Administrador")) {
                success = cadastrarAdministrador();
            } else if (Objects.equals(selectedItem, "Cliente")) {
                success = cadastrarCliente();
            } else if (Objects.equals(selectedItem, "Prestador de Serviço")) {
                success = cadastrarPrestador();
            }

            if (success) {
                JOptionPane.showMessageDialog(this,
                        "Cadastro de " + selectedItem.toLowerCase() + " realizado com sucesso!");
                limparCampos();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao realizar cadastro: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean cadastrarAdministrador() throws IOException {
        if (nomeField.getText().isEmpty() || tipoField.getText().isEmpty() ||
                emailField.getText().isEmpty() || senhaField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return false;
        }
        saveToCSV("src/files_csv/AdministradorCSV.csv",
                new String[]{nomeField.getText(), tipoField.getText(),
                        emailField.getText(), senhaField.getText()});
        return true;
    }

    private boolean cadastrarCliente() throws IOException {
        if (nomeField.getText().isEmpty() || emailField.getText().isEmpty() ||
                telefoneField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return false;
        }
        saveToCSV("src/files_csv/ClienteCSV.csv",
                new String[]{nomeField.getText(), emailField.getText(),
                        telefoneField.getText()});
        return true;
    }

    private boolean cadastrarPrestador() throws IOException {
        if (nomeField.getText().isEmpty() || emailField.getText().isEmpty() ||
                especialidadeField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
            return false;
        }
        saveToCSV("src/files_csv/PrestadoDeServicoCSV.csv",
                new String[]{nomeField.getText(), emailField.getText(),
                        especialidadeField.getText()});
        return true;
    }

    private void saveToCSV(String path, String[] dados) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            int id = countLines(path) + 1;
            StringBuilder linha = new StringBuilder(String.valueOf(id));
            for (String dado : dados) {
                linha.append(",").append(dado);
            }
            printWriter.println(linha);
        }
    }

    private int countLines(String path) {
        int lines = -1;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.readLine() != null) lines++;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado, iniciando com ID 1.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private void limparCampos() {
        nomeField.setText("");
        tipoField.setText("");
        emailField.setText("");
        senhaField.setText("");
        telefoneField.setText("");
        especialidadeField.setText("");
    }
}