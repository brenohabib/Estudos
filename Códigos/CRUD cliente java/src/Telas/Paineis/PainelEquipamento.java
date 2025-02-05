package Telas.Paineis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.Objects;

public class PainelEquipamento extends JPanel {
    private JPanel mainPanel;
    private JTextField nomeField;
    private JTextField fabricanteField;
    private JButton cadastrarButton;
    private JComboBox<String> comboBoxStatus;
    private JTextField dataInstalacaoField;

    public PainelEquipamento() {
        add(mainPanel);

        setupUI();
        setupListeners();
    }

    private void setupUI() {
        comboBoxStatus.addItem("Disponível");
        comboBoxStatus.addItem("Em uso");
        comboBoxStatus.addItem("Em manutenção");
        comboBoxStatus.addItem("Inativo");
    }

    private void setupListeners() {
        cadastrarButton.addActionListener(e -> {
            if (Objects.equals(comboBoxStatus.getSelectedItem(), "Em uso") && dataInstalacaoField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(mainPanel, "Coloque a data de instalação", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                saveToCSVEquipamento("src/files_csv/EquipamentosCSV.csv",
                        nomeField.getText(),
                        fabricanteField.getText(),
                        dataInstalacaoField.getText(),
                        (String) comboBoxStatus.getSelectedItem());

                nomeField.setText("");
                fabricanteField.setText("");
                dataInstalacaoField.setText("");

                JOptionPane.showMessageDialog(mainPanel, "Cadastro de equipamento realizado com sucesso!");
            }
        });
    }

    private void saveToCSVEquipamento(String path, String nome, String fabricante, String dataInstalacao, String status) {
        try (FileWriter fileWriter = new FileWriter(path, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            int id = getNextId(path);
            printWriter.printf("%d,%s,%s,%s,%s%n", id, nome, fabricante, dataInstalacao, status);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getNextId(String path) {
        int id = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] fields = linha.split(",");
                id = Integer.parseInt(fields[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return id + 1;
    }
}
