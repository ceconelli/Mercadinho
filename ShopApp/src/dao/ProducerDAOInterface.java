package dao;

import java.util.ArrayList;

import exceptions.ProducerDAOException;
import model.Producer;

public interface ProducerDAOInterface {
	
	public boolean insert(Producer producer) throws ProducerDAOException;
	public boolean update(Producer producer)throws ProducerDAOException;
	public boolean delete(Producer producer) throws ProducerDAOException;

	public boolean update(int idProducer)throws ProducerDAOException;
	public boolean delete(int idProducer) throws ProducerDAOException;
	
	public ArrayList<Producer> retriveAll() throws ProducerDAOException;
	public ArrayList<Producer> retriveByWhere(String criteria) throws ProducerDAOException;
	public Producer retriveByID(int id) throws ProducerDAOException;
	

}
