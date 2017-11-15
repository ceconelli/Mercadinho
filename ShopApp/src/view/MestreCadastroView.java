package view;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MestreCadastroView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public JButton btnAdd;
	public JButton btnDel;
	public JButton btnSearch;
	
	public MestreCadastroView(String titulo,int left,int top,int width,int height){
		super(titulo);
		setBounds(left,top,width,height);
		setLayout(null);
		
		btnAdd = new JButton("Salvar");
		btnSearch =new JButton("Pesquisar");
		btnDel = new JButton("Excluir");
		
		btnAdd.setBounds(15, 15, 100, 50);
		btnDel.setBounds(150,15, 100,50);
		btnSearch.setBounds(290,15, 100,50);
		add(btnDel);
		add(btnAdd);
		add(btnSearch);
		
		btnAdd.setActionCommand("SALVAR");
		btnDel.setActionCommand("EXCLUIR");
		btnSearch.setActionCommand("PESQUISAR");
		
		
	}

}
