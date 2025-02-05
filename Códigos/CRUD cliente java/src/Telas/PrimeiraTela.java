package Telas;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrimeiraTela extends JFrame{
    private JPanel PrimeiraTela;
    private JButton prestadorDeServicoButton;
    private JButton administradorButton;
    private JButton clienteButton;
    private JTextField userField;
    private JTextField passwordField;
    private JButton logarButton;
    private JLabel perfilLabel;
    private JPanel profilePanel;
    private JPanel loginPanel;

    private final String[] usuariosDisponiveis = {"Administrador", "Cliente", "PrestadorServico"};
    private String usuarioSelecionado = "";

    public PrimeiraTela() {
        setup();

        administradorButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                hideProfilePanel();
                showLoginPanel();
                usuarioSelecionado = usuariosDisponiveis[0];
            }
        });
        clienteButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                hideProfilePanel();
                showLoginPanel();
                usuarioSelecionado = usuariosDisponiveis[1];
            }
        });
        prestadorDeServicoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                hideProfilePanel();
                showLoginPanel();
                usuarioSelecionado = usuariosDisponiveis[2];
            }
        });
        logarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                new TelaPrincipal(usuarioSelecionado);
            }
        });
    }
    private void setup() {
        setContentPane(PrimeiraTela);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        loginPanel.setVisible(false);
    }
    private void hideProfilePanel() {
        profilePanel.setVisible(false);
    }
    private void showProfilePanel() {
        profilePanel.setVisible(true);
    }
    private void hideLoginPanel() {
        loginPanel.setVisible(false);
    }
    private void showLoginPanel() {
        loginPanel.setVisible(true);
    }
}
