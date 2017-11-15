package dao;

import java.util.ArrayList;

import exceptions.SaleDAOException;
import exceptions.SaleDAOException;
import model.Sale;

public interface saleDAOInterface {
	
	public boolean insert(Sale sale) throws SaleDAOException;
	public boolean update(Sale sale)throws SaleDAOException;
	public boolean delete(Sale sale) throws SaleDAOException;

	public boolean update(int idSale)throws SaleDAOException;
	public boolean delete(int idSale) throws SaleDAOException;
	
	public ArrayList<Sale> retriveAll() throws SaleDAOException;
	public ArrayList<Sale> retriveByWhere(String criteria) throws SaleDAOException;
	public Sale retriveByID(int id) throws SaleDAOException;
	

}
