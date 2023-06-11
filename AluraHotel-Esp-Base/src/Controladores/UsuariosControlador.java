package Controladores;


import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

import modelo.Usuarios;
import views.Login;
import views.MenuUsuario;

public class UsuariosControlador implements ActionListener{

	private Login vista;
	
	public UsuariosControlador(Login vista) {
		this.vista = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombre = vista.getNombre();
		String contraseña = vista.getContraseña();
		
		if(Usuarios.validarUsuario(nombre, contraseña)) {
			MenuUsuario menu = new MenuUsuario();
			menu.setVisible(true);
			vista.dispose();
			
		}else {
			JOptionPane.showMessageDialog(vista, "Usuario o contraseña no validos");
		}
		}
}
