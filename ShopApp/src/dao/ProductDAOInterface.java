package dao;

import java.util.ArrayList;

import exceptions.ProductDAOException;
import exceptions.ProductDAOException;
import model.Product;

public interface ProductDAOInterface {
	
	public boolean insert(Product product) throws ProductDAOException;
	public boolean update(Product product)throws ProductDAOException;
	public boolean delete(Product product) throws ProductDAOException;

	public boolean update(int idProduct)throws ProductDAOException;
	public boolean delete(int idProduct) throws ProductDAOException;
	
	public ArrayList<Product> retriveAll() throws ProductDAOException;
	public ArrayList<Product> retriveByWhere(String criteria) throws ProductDAOException;
	public Product retriveByID(int id) throws ProductDAOException;
	

}
