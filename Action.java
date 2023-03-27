package telaDeLoginBD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Action {
	
	public static void ActionButton() {

		ActionListener actionLogar = new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				BancoDados.BDLogar();

				if(GUITelaLogin.textField.getText().equals(GUITelaLogin.login) && GUITelaLogin.passwordField.getText().equals(GUITelaLogin.resultSenha)) {
					GUITelaLogin.labelSuccess.setText("Bem Vindo!");
				} else {
					GUITelaLogin.labelSuccess.setText("Login ou Senha Inválidos!");
				}

			}
		};
		
		ActionListener actionTelaNovaConta = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				GUITelaCadastro.GUI();
				GUITelaCadastro.frame.setVisible(true);
		
			}
		};
		
		GUITelaLogin.button.addActionListener(actionLogar);
		GUITelaLogin.criar.addActionListener(actionTelaNovaConta);
		
	}
	
	public static void ActionButton2() {
		
		ActionListener actionCriar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				BancoDados.BDCriar();
				JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
				GUITelaCadastro.frame.setVisible(false);
				
			}
			
		};
		
		GUITelaCadastro.criarConta.addActionListener(actionCriar);
	}

}
