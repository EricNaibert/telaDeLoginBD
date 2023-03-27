package telaDeLoginBD;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUITelaCadastro {
	
	static JFrame frame;
	static JPanel panel;
	static JTextField textField;
	static JPasswordField passwordField;
	static JLabel labelLogin;
	static JLabel labelSenha;
	static JLabel labelTitulo;
	static JLabel labelSuccess;
	static String login;
	static JButton criarConta;
	static String resultSenha;
	
	public static void GUI() {

		frame = new JFrame();
		frame.pack();
		frame.setTitle("Cadastro");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(2, 2, 495, 395);
		frame.add(panel);

		labelTitulo = new JLabel();
		labelTitulo.setText("Página de Cadastro");
		labelTitulo.setFont(new Font("Arial", 1 , 20));
		labelTitulo.setBounds(170, 90, 200, 21);
		panel.add(labelTitulo);

		labelLogin = new JLabel();
		labelLogin.setText("Login");
		labelLogin.setBounds(120, 130, 100, 20);
		panel.add(labelLogin);

		textField = new JTextField();
		textField.setBounds(180, 130, 150, 25);
		panel.add(textField);

		labelSenha = new JLabel();
		labelSenha.setText("Senha");
		labelSenha.setBounds(120, 165, 100, 20);
		panel.add(labelSenha);

		passwordField = new JPasswordField();
		passwordField.setBounds(180, 165, 150, 25);
		panel.add(passwordField);

		criarConta = new JButton();
		criarConta.setText("Criar Conta");
		criarConta.setBounds(180, 200, 150, 25);
		panel.add(criarConta);
		
		Action.ActionButton2();
		
	}

}
