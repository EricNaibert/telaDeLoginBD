package telaDeLoginBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDados {
	
	
	public static void BDLogar() {
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
				GUITelaLogin.login = resultSet.getString("logins");
				GUITelaLogin.resultSenha = resultSet.getString("senhas");
			}

		}catch (Exception e) {
			System.out.println("Erro na conexão com o banco de dados!");
		}
	}
	
	public static void BDCriar() {
		
		final String givenEmail = GUITelaCadastro.textField.getText();
		@SuppressWarnings("deprecation")
		final String givenSenha = GUITelaCadastro.passwordField.getText();
		final String usuario = "postgres";
		final String senha = "password";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String create = "INSERT INTO cadastros(logins, senhas) VALUES ('" + givenEmail + "', '" + givenSenha + "');";
		final String driver = "org.postgresql.Driver";

		try {
			Class.forName(driver);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão realizada com sucesso!");

			Statement sentensa = conexao.createStatement();
			sentensa.executeQuery(create);
			


		}catch (Exception e) {
			System.out.println("Erro na conexão com o banco de dados!");
		}
	}

}
