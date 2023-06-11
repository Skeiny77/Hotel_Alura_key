package Controladores;

import DAO.ReservaDAO;
import modelo.Reserva;
import Factory.ConexionBase;
import java.sql.Connection;

public class ReservaControlador {
	
	private ReservaDAO reservaD;

	public ReservaControlador() {
		Connection con = new ConexionBase().conectarBase();
		this.reservaD = new ReservaDAO(con);
		}
	
	public void guardar(Reserva reserva) {
		this.reservaD.guardar(reserva);
	}

}
