package view;

import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.EstadoController;

public class EstadoCadastroView extends MestreCadastroView {

	private static final long serialVersionUID = 1L;

	public JTextField txtNome;
	public JTextField txtUF;
	
	public EstadoCadastroView(String titulo, int left, int top, int width, int height) {
		super(titulo, left, top, width, height);
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(15,90,50,20);
		add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(80, 90, 100,20);
		add(txtNome);
		
		JLabel lblUF= new JLabel("UF: ");
		lblUF.setBounds(15,130,50,20);
		add(lblUF);
		
		txtUF = new JTextField();
		txtUF.setBounds(80, 130, 100,20);
		add(txtUF);
		
		btnAdd.addActionListener(new EstadoController(this));
		btnDel.addActionListener(new EstadoController(this));
		btnSearch.addActionListener(new EstadoController(this));
		
	}

}
