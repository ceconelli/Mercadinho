package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Estado;
import exceptions.EstadoDAOException;

public class EstadoDAO implements EstadoDAOInterface{

	boolean bRet=false;
	PreparedStatement pstm;
	
	public EstadoDAO() {}

	@Override
	public boolean insert(Estado estado) throws EstadoDAOException {
		try{
			pstm=ConnectionFactory.getConnection().prepareStatement("INSERT INTO estado (idEstado,nomeEstado, UF) values (null,?,?)");
			pstm.setString(1,estado.getNome());
			pstm.setString(2, estado.getUF());
			pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
		}catch(Exception e){
			throw new EstadoDAOException(e.getMessage());
		}
		return bRet;
	}

	@Override
	public boolean update(Estado estado) throws EstadoDAOException {
	
		return bRet;
	}

	@Override
	public boolean update(int idEstado) throws EstadoDAOException {
		
		return bRet;
	}

	@Override
	public boolean delete(int idEstado) throws EstadoDAOException {
		
		return bRet;
	}
	
	@Override
	public boolean delete(Estado estado) throws EstadoDAOException {
		
		return bRet;
	}

	@Override
	public ArrayList<Estado> retriveAll() throws EstadoDAOException {
		ArrayList<Estado> arRet = new ArrayList<Estado>();
		try{
			pstm=ConnectionFactory.getConnection().prepareStatement("SELECT * FROM estado");
			ResultSet rs=pstm.executeQuery();
			while(rs.next()){
				arRet.add(new Estado(rs.getInt("idEstado"),
									rs.getString("UF"),
									 rs.getString("NomeEstado")
									 	));
			}
			ConnectionFactory.closeConnection(pstm,rs);
		}catch(Exception e){
			throw new EstadoDAOException(e.getMessage());
		}
		return arRet;
	}

	@Override
	public ArrayList<Estado> retriveByWhere(String criteria)
			throws EstadoDAOException {
		ArrayList<Estado> arRet = new ArrayList<Estado>();
		try{
		}catch(Exception e){
			throw new EstadoDAOException(e.getMessage());
		}
		return arRet;
	}

	@Override
	public Estado retriveByID(int id) throws EstadoDAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
