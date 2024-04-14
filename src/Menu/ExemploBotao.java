package Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class ExemploBotao  extends JFrame{
    private JButton meuBotao;
    private JPanel menuPricipal;

    public static void main(String[] args) {

        // Criação da janela e adição do botão à janela
        JFrame frame = new JFrame();
        ExemploBotao exemplo = new ExemploBotao();
        frame.setTitle("Botão");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(exemplo.meuBotao);
        frame.setVisible(true);

    }
    

    public ExemploBotao() {
        // Criação do botão
        meuBotao = new JButton("Menu Pricipal");        // Adicionando o ActionListener ao botão
        meuBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {     // Abre o MenuPrincipal quando o botão é clicado
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                dispose();
            }
        });

    }


}

