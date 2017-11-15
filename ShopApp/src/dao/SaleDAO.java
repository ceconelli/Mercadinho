package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Sale;
import exceptions.EstadoDAOException;
import exceptions.SaleDAOException;
import java.sql.Date;

public class SaleDAO implements saleDAOInterface{
    boolean bRet=false;
    PreparedStatement pstm;

    @Override
    public boolean insert(Sale sale) throws SaleDAOException {
        try{
			pstm=ConnectionFactory.getConnection().prepareStatement("INSERT INTO sale (idSale,amountSale,solatSale) values (null,?,?)");
			pstm.setDouble(1,sale.getAmount());
			pstm.setDate(2, (Date) sale.getSoldAt());
			pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
	}catch(Exception e){
			throw new SaleDAOException(e.getMessage());
	}
	return bRet;    }

    @Override
    public boolean update(Sale sale) throws SaleDAOException {
		return bRet;
    }

    @Override
    public boolean delete(Sale sale) throws SaleDAOException {
		return bRet;
    }

    @Override
    public boolean update(int idSale) throws SaleDAOException {
		return bRet;
    }

    @Override
    public boolean delete(int idSale) throws SaleDAOException {
		return bRet;
    }

    @Override
    public ArrayList<Sale> retriveAll() throws SaleDAOException {
		return null;
    }

    @Override
    public ArrayList<Sale> retriveByWhere(String criteria) throws SaleDAOException {
		return null;
    }

    @Override
    public Sale retriveByID(int id) throws SaleDAOException {
		return null;
    }

 
	

	
}
