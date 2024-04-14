package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JFrame{
    private JTextField textFieldNome;
    private JTextField textFieldSobreNome;
    private JTextField textFieldTelefone;
    private JPanel panelCadastroCliente;
    private JTextField textFieldEndeco;
    private JButton buttonSalvar;
    private JButton menuPricipal;



    public CadastroCliente(){
        menuPricipal.addActionListener(new ActionListener() {//Volta para o menu inicial quando o batão é clicado
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal menuPrincipal = new MenuPrincipal();
                menuPrincipal.setVisible(true);
                dispose();
            }
        }) ;

        JPanel panelcadastroCliente = new JPanel();

        panelcadastroCliente.add(panelCadastroCliente);

        this.add(panelCadastroCliente);



        // Configurações da janela
        this.setTitle("Cadastro");
        this.setSize(800, 650);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centraliza a janela



    }



}
