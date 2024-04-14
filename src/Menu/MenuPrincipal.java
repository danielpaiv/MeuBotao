package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame  {
    private JPanel panelMenuPricipal;
    private JPanel painelLogin;
    private JButton cadastroButton;
    private JButton consultaButton;

    public MenuPrincipal() {

        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {// Abre o a tela de cadastro quando o botão é clicado
                CadastroCliente menu = new CadastroCliente();
                menu.setVisible(true);
                //dispose();
            }
        });

        consultaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TabelaDespesa tabelaDespesa = new TabelaDespesa();
                tabelaDespesa.setVisible(true);

            }
        });

        // Inicialização dos componentes do menu principal
        JPanel panelMenuPrincipal = new JPanel();

        // Adiciona os botões ao painel
        panelMenuPrincipal.add(panelMenuPricipal);

        // Adiciona o painel ao JFrame
        this.add(panelMenuPrincipal);

        // Configurações da janela
        this.setTitle("Menu Pricipal");
        this.setSize(800, 650);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centraliza a janela
    }
}
