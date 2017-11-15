import javax.swing.JFrame;

import view.EstadoCadastroView;


public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstadoCadastroView estado = new EstadoCadastroView("Estado",100,100,500,500);
		estado.setVisible(true);
		estado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
