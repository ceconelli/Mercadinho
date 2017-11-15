package dao;

import java.util.ArrayList;

import exceptions.EstadoDAOException;
import model.Estado;

public interface EstadoDAOInterface {
	
	public boolean insert(Estado estado) throws EstadoDAOException;
	public boolean update(Estado estado)throws EstadoDAOException;
	public boolean delete(Estado estado) throws EstadoDAOException;

	public boolean update(int idEstado)throws EstadoDAOException;
	public boolean delete(int idEstado) throws EstadoDAOException;
	
	public ArrayList<Estado> retriveAll() throws EstadoDAOException;
	public ArrayList<Estado> retriveByWhere(String criteria) throws EstadoDAOException;
	public Estado retriveByID(int id) throws EstadoDAOException;
	

}
