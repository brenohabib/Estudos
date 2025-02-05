package Telas.Paineis;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;

public class PainelAmbiente extends JPanel {
    private JPanel mainPanel;
    private JTextField nomeField;
    private JTextField enderecoField;
    private JButton cadastrarButton;

    public PainelAmbiente() {
        add(mainPanel);

        setupListeners();
    }

    private void setupListeners() {
        cadastrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    saveToCSVAmbiente("src/files_csv/AmbienteCSV.csv", nomeField.getText(), enderecoField.getText());
                    nomeField.setText("");
                    enderecoField.setText("");

                    JOptionPane.showMessageDialog(mainPanel, "Cadastro de ambiente realizado com sucesso!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(mainPanel, "Erro ao cadastrar ambiente", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private void saveToCSVAmbiente(String path, String name, String localizacao) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            int id = CountLines(path) + 1;
            printWriter.printf("%d,%s,%s%n", id, name, localizacao);
        }
    }

    private int CountLines(String path) {
        int lines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (br.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
