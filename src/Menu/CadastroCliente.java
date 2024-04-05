package Menu;

import javax.swing.*;
import java.awt.*;

public class CadastroCliente extends JFrame{
    private JTextField textFieldNome;
    private JTextField textFieldSobreNome;
    private JTextField textFieldTelefone;
    private JPanel panelCadastroCliente;
    private JTextField textFieldEndeco;
    private JButton buttonSalvar;

    public CadastroCliente(JTextField textFieldNome, JTextField textFieldSobreNome, JTextField textFieldTelefone, JPanel panelCadastroCliente, JTextField textFieldEndeco) throws HeadlessException {
        this.textFieldNome = textFieldNome;
        this.textFieldSobreNome = textFieldSobreNome;
        this.textFieldTelefone = textFieldTelefone;
        this.panelCadastroCliente = panelCadastroCliente;
        this.textFieldEndeco = textFieldEndeco;
    }


    public JTextField getTextFieldNome() {
        return textFieldNome;
    }

    public void setTextFieldNome(JTextField textFieldNome) {
        this.textFieldNome = textFieldNome;
    }

    public JTextField getTextFieldSobreNome() {
        return textFieldSobreNome;
    }

    public void setTextFieldSobreNome(JTextField textFieldSobreNome) {
        this.textFieldSobreNome = textFieldSobreNome;
    }

    public JTextField getTextFieldTelefone() {
        return textFieldTelefone;
    }

    public void setTextFieldTelefone(JTextField textFieldTelefone) {
        this.textFieldTelefone = textFieldTelefone;
    }

    public JPanel getPanelCadastroCliente() {
        return panelCadastroCliente;
    }

    public void setPanelCadastroCliente(JPanel panelCadastroCliente) {
        this.panelCadastroCliente = panelCadastroCliente;
    }

    public JTextField getTextFieldEndeco() {
        return textFieldEndeco;
    }

    public void setTextFieldEndeco(JTextField textFieldEndeco) {
        this.textFieldEndeco = textFieldEndeco;
    }

    public JButton getButtonSalvar() {
        return buttonSalvar;
    }

    public void setButtonSalvar(JButton buttonSalvar) {
        this.buttonSalvar = buttonSalvar;
    }

    public CadastroCliente(){

        JPanel panelcadastroCliente = new JPanel();

        panelcadastroCliente.add(panelCadastroCliente);

        this.add(panelCadastroCliente);



        // Configurações da janela
        this.setSize(800, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centraliza a janela
    }
}
