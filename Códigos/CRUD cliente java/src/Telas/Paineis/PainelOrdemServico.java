package Telas.Paineis;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PainelOrdemServico extends JPanel {
    private JButton solicitarButton;
    private JPanel mainPanel;
    private JTextField IDField;
    private JTable OSTable;
    private JTextField DescricaoField;
    private JComboBox<String> prioridadeCB;
    private JComboBox<String> statusCB;
    private JTextField dataCriacaoField;
    private JTextField dataConclusaoField;
    private JTextField prestadorField;

    private final String caminhoTabelaServico = "src/files_csv/tabela_servico.csv";
    private boolean isEditMode = false;
    private int selectedRowIndex = -1;
    private final String userRole;

    public PainelOrdemServico(String user) {
        this.userRole = user;
        add(mainPanel);
        configurarComboBoxes();
        configurarPermissoes(user);
        atualizarCamposInativos();
        listarOrdensDeServico();

        OSTable.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && (userRole.equals("PrestadorServico") || userRole.equals("Administrador"))) {
                selectedRowIndex = OSTable.getSelectedRow();
                if (selectedRowIndex != -1) {
                    carregarDadosOrdemSelecionada();
                }
            }
        });

        solicitarButton.addActionListener(e -> {
            if (isEditMode) {
                try {
                    editarOrdemServico();
                    listarOrdensDeServico();
                    resetarModoEdicao();
                } catch (IOException ex) {
                    System.out.println("Erro ao editar ordem de serviço: " + ex.getMessage());
                }
            } else {
                try {
                    adicionarNovaOrdem();
                    listarOrdensDeServico();
                    atualizarCamposInativos();
                } catch (IOException ex) {
                    System.out.println("Erro ao gerar ordem de serviço: " + ex.getMessage());
                }
            }
        });
    }

    private void configurarComboBoxes() {
        prioridadeCB.addItem("Baixa");
        prioridadeCB.addItem("Média");
        prioridadeCB.addItem("Alta");

        statusCB.addItem("Agendada");
        statusCB.addItem("Em andamento");
        statusCB.addItem("Concluída");
    }

    private void configurarPermissoes(String user) {
        boolean isCliente = user.equals("Cliente");
        boolean isPrestador = user.equals("PrestadorServico");
        boolean isAdmin = user.equals("Administrador");

        DescricaoField.setEditable(isCliente || isPrestador || isAdmin);
        prioridadeCB.setEnabled(isPrestador || isAdmin);
        statusCB.setEnabled(isPrestador || isAdmin);
        dataConclusaoField.setEditable(isPrestador || isAdmin);
        prestadorField.setEditable(isAdmin);
        dataCriacaoField.setEditable(isAdmin);
    }

    private int gerarID() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(caminhoTabelaServico));
        String linha;
        int maxID = 0;
        while ((linha = reader.readLine()) != null) {
            String[] campos = linha.split(",");
            if (!campos[0].equals("ID")) {
                int idAtual = Integer.parseInt(campos[0]);
                if (idAtual > maxID) {
                    maxID = idAtual;
                }
            }
        }
        reader.close();
        return maxID + 1;
    }

    private String getDataAtual() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.now().format(formatter);
    }

    private void adicionarAoCSV(String descricao, String prioridade, String status, String prestadorServico) throws IOException {
        FileWriter fw = new FileWriter(caminhoTabelaServico, true);
        BufferedWriter writer = new BufferedWriter(fw);

        int novoID = gerarID();
        String dataCriacao = getDataAtual();

        writer.write(novoID + "," + descricao + "," + prioridade + "," + status + "," + dataCriacao + "," + "Não Finalizada" + "," + prestadorServico);
        writer.newLine();
        writer.close();
    }

    private void adicionarNovaOrdem() throws IOException {
        String descricao = DescricaoField.getText();
        String prioridade = (String) prioridadeCB.getSelectedItem();
        String status = (String) statusCB.getSelectedItem();
        String prestador = prestadorField.getText();

        adicionarAoCSV(descricao, prioridade, status, prestador);
        limparCampos();
    }

    private void limparCampos() {
        DescricaoField.setText("");
        prioridadeCB.setSelectedIndex(0);
        statusCB.setSelectedIndex(0);
        prestadorField.setText("");
    }

    private void listarOrdensDeServico() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descrição", "Prioridade", "Status", "Criação", "Conclusão", "Prestador"}, 0);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(caminhoTabelaServico));
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.startsWith("ID")) {
                    String[] dados = linha.split(",");
                    model.addRow(dados);
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        OSTable.setModel(model);
    }

    private void carregarDadosOrdemSelecionada() {
        DefaultTableModel model = (DefaultTableModel) OSTable.getModel();

        IDField.setText(getCampoSeguro(model, selectedRowIndex, 0));
        DescricaoField.setText(getCampoSeguro(model, selectedRowIndex, 1));
        prioridadeCB.setSelectedItem(getCampoSeguro(model, selectedRowIndex, 2));
        statusCB.setSelectedItem(getCampoSeguro(model, selectedRowIndex, 3));
        dataCriacaoField.setText(getCampoSeguro(model, selectedRowIndex, 4));
        dataConclusaoField.setText(getCampoSeguro(model, selectedRowIndex, 5));
        prestadorField.setText(getCampoSeguro(model, selectedRowIndex, 6));

        solicitarButton.setText("Editar Ordem de Serviço");
        isEditMode = true;
    }

    private String getCampoSeguro(DefaultTableModel model, int rowIndex, int columnIndex) {
        Object value = model.getValueAt(rowIndex, columnIndex);
        return (value != null) ? value.toString() : "";
    }

    private void editarOrdemServico() throws IOException {
        DefaultTableModel model = (DefaultTableModel) OSTable.getModel();

        model.setValueAt(DescricaoField.getText(), selectedRowIndex, 1);
        model.setValueAt(prioridadeCB.getSelectedItem(), selectedRowIndex, 2);
        model.setValueAt(statusCB.getSelectedItem(), selectedRowIndex, 3);
        model.setValueAt(dataCriacaoField.getText(), selectedRowIndex, 4);
        model.setValueAt(dataConclusaoField.getText(), selectedRowIndex, 5);
        model.setValueAt(prestadorField.getText(), selectedRowIndex, 6);

        salvarEdicoesCSV(model);
    }

    private void salvarEdicoesCSV(DefaultTableModel model) throws IOException {
        List<String> todasLinhas = getTodasLinhasCSV();

        if (selectedRowIndex >= 0 && selectedRowIndex < todasLinhas.size() - 1) {
            StringBuilder novaLinha = new StringBuilder();
            for (int j = 0; j < model.getColumnCount(); j++) {
                Object valor = model.getValueAt(selectedRowIndex, j);
                novaLinha.append(valor != null ? valor.toString() : "");
                if (j < model.getColumnCount() - 1) {
                    novaLinha.append(",");
                }
            }
            todasLinhas.set(selectedRowIndex + 1, novaLinha.toString());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoTabelaServico))) {
            for (String linha : todasLinhas) {
                writer.write(linha);
                writer.newLine();
            }
        }
    }

    private List<String> getTodasLinhasCSV() throws IOException {
        List<String> todasLinhas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoTabelaServico))) {
            String linha;
            String cabecalho = reader.readLine();
            if (cabecalho != null) {
                todasLinhas.add(cabecalho);
            }
            while ((linha = reader.readLine()) != null) {
                todasLinhas.add(linha);
            }
        }
        return todasLinhas;
    }

    private void resetarModoEdicao() {
        limparCampos();
        solicitarButton.setText("Solicitar");
        isEditMode = false;
        selectedRowIndex = -1;
        atualizarCamposInativos();
    }

    private void atualizarCamposInativos() {
        try {
            IDField.setText(String.valueOf(gerarID()));
            dataCriacaoField.setText(getDataAtual());
            dataConclusaoField.setText("OS ainda sendo gerada");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
