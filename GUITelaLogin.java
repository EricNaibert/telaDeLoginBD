package telaDeLoginBD;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;

public class GUITelaLogin {

	static JFrame frame;
	static JPanel panel;
	static JTextField textField;
	static JPasswordField passwordField;
	static JLabel labelLogin;
	static JLabel labelSenha;
	static JLabel labelTitulo;
	static JLabel labelSuccess;
	static JButton button;
	static String login;
	static JButton criar;
	static String resultSenha;

	public static void GUI() {

		frame = new JFrame();
		frame.pack();
		frame.setTitle("Login");
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(2, 2, 495, 395);
		frame.add(panel);

		labelTitulo = new JLabel();
		labelTitulo.setText("Página de Login");
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

		criar = new JButton();
		criar.setText("Criar Conta");
		criar.setBounds(180, 235, 150, 25);
		panel.add(criar);
		
		button = new JButton();
		button.setText("Logar");
		button.setBounds(180, 200, 150, 25);
		panel.add(button);
		
		Action.ActionButton();
		
		labelSuccess = new JLabel();
		labelSuccess.setBounds(180, 260, 150, 25);
		panel.add(labelSuccess);
		
		frame.setVisible(true);
	}

	
}
