package telaDeLoginBD;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class GUI {

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
	static String resultSenha;

	public GUI() {

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

		button = new JButton();
		button.setText("Logar");
		button.setBounds(180, 200, 150, 25);
		ActionButton();
		panel.add(button);

		labelSuccess = new JLabel();
		labelSuccess.setBounds(180, 250, 150, 25);
		panel.add(labelSuccess);
	}

	public void ActionButton() {

		ActionListener action = new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				BD();

				if(textField.getText().equals(login) && passwordField.getText().equals(resultSenha)) {
					labelSuccess.setText("Bem Vindo!");
				} else {
					labelSuccess.setText("Login ou Senha Inválidos!");
				}

			}
		};
		button.addActionListener(action);
	}

	public static void BD() {
		final String usuario = "postgres";
		final String senha = "password";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String select = "SELECT * FROM cadastros";
		final String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão realizada com sucesso!");

			Statement sentensa = conexao.createStatement();
			ResultSet resultSet = sentensa.executeQuery(select);

			while(resultSet.next()) {
				login = resultSet.getString("logins");
				resultSenha = resultSet.getString("senhas");
			}

		}catch (Exception e) {
			System.out.println("Erro na conexão com o banco de dados!");
		}
	}

	public static void main(String[]args) {
		new GUI();
		frame.setVisible(true);

	}

}
