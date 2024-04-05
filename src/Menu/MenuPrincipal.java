package Menu;

import javax.swing.*;
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
            public void actionPerformed(ActionEvent e) {
                // Abre o MenuPrincipal quando o botão é clicado
                CadastroCliente menu = new CadastroCliente();
                menu.setVisible(true);
            }
        });
        // Inicialização dos componentes do menu principal
        JPanel panelMenuPrincipal = new JPanel();
//        cadastroButton = new JButton("Cadastro");
//        consultaButton = new JButton("Consulta");

        // Adiciona os botões ao painel
        panelMenuPrincipal.add(panelMenuPricipal);

        //panelMenuPrincipal.add(painelLogin);
        //panelMenuPrincipal.add(consultaButton);

        // Adiciona o painel ao JFrame
        this.add(panelMenuPrincipal);

        // Configurações da janela
        this.setSize(800, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centraliza a janela
    }
}
