package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Estado;

import dao.EstadoDAO;
import exceptions.EstadoDAOException;

import view.EstadoCadastroView;

public class EstadoController implements ActionListener{

	EstadoCadastroView visao;
	
	public EstadoController(EstadoCadastroView visao){
		this.visao=visao;
	}
	
	@Override
	public void actionPerformed(ActionEvent comando) {
		// TODO Auto-generated method stub
		if(comando.getActionCommand().equalsIgnoreCase("SALVAR")){
			try{
				
				EstadoDAO dao = new EstadoDAO();
				dao.insert(new Estado(0,visao.txtUF.getText(),visao.txtNome.getText()));
				JOptionPane.showMessageDialog(visao, "Estado inserido");
			}catch(EstadoDAOException e){
				JOptionPane.showMessageDialog(visao, "Erro em inserção de estado: "+e.getMessage());				
			}
		}else if(comando.getActionCommand().equals("PESQUISAR")){
			
			try{
				EstadoDAO dao = new EstadoDAO();
				ArrayList<Estado> array = dao.retriveAll();
				
				String dados="";
				for(int i=0;i<array.size();i++){
					dados+=array.get(i).toString()+"\n";
				}
				JOptionPane.showMessageDialog(this.visao, dados);
			}catch(Exception e){
				JOptionPane.showMessageDialog(this.visao, e.getMessage());
			}
		}
		
	}



}
