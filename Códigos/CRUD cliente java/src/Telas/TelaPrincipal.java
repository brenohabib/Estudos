package Telas;

import Components.ImagePanel;
import Telas.Paineis.PainelAmbiente;
import Telas.Paineis.PainelEquipamento;
import Telas.Paineis.PainelOrdemServico;
import Telas.Paineis.PainelUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaPrincipal extends JFrame {
    private JPanel PainelPrincipal;
    private JPanel contentPanel;
    private JPanel sidePanel;
    private JPanel imagem_canto;
    private JPanel logo;
    private JButton usuarioButton;
    private JButton ambienteButton;
    private JButton ordemDeServicoButton;
    private JButton equipamentoButton;
    private JButton relatorioButton;

    private String user;

    public TelaPrincipal(String user) {
        this.user = user;
        setupFrame();
        setupListeners();

        if (user.equals("Cliente")) {
            esconderBotoesParaCliente();
        }
    }

    private void createUIComponents() {
        logo = new ImagePanel("src/images/logo_manutrack_sem_fundo_branca.png");
        imagem_canto = new ImagePanel("src/images/testeimg.png");
    }

    private void setupFrame() {
        setContentPane(PainelPrincipal);
        setTitle("Manutrack");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void setupListeners() {
        MouseAdapter buttonHover = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(Color.decode("#63a8a8"));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setBackground(Color.decode("#0E1426"));
            }
        };

        usuarioButton.addMouseListener(buttonHover);
        ambienteButton.addMouseListener(buttonHover);
        ordemDeServicoButton.addMouseListener(buttonHover);
        equipamentoButton.addMouseListener(buttonHover);
        relatorioButton.addMouseListener(buttonHover);

        usuarioButton.addActionListener(e -> updateContent(new PainelUsuario()));
        ambienteButton.addActionListener(e -> updateContent(new PainelAmbiente()));
        ordemDeServicoButton.addActionListener(e -> updateContent(new PainelOrdemServico(user)));
        equipamentoButton.addActionListener(e -> updateContent(new PainelEquipamento()));
        relatorioButton.addActionListener(e -> updateContent(null));
    }

    private void esconderBotoesParaCliente() {
        usuarioButton.setVisible(false);
        ambienteButton.setVisible(false);
        equipamentoButton.setVisible(false);
        relatorioButton.setVisible(false);
    }

    private void updateContent(JPanel newPanel) {
        contentPanel.removeAll();
        contentPanel.add(newPanel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
