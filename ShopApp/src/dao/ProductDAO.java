/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exceptions.ProducerDAOException;
import exceptions.ProductDAOException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author Isaac
 */
public class ProductDAO implements ProductDAOInterface{
    boolean bRet=false;
    PreparedStatement pstm;
    @Override
    public boolean insert(Product product) throws ProductDAOException {
        try{
			pstm=ConnectionFactory.getConnection().prepareStatement("INSERT INTO product (idProduct,nameProduct,amountProduct,priceProduct,idProducer) values (null,?,?,?)");
			pstm.setString(1,product.getName());
			pstm.setDouble (0,product.getAmount());
			pstm.setDouble(0,product.getPrice());
                        pstm.setInt(0,product.getIdProducer());
                        pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
	}catch(Exception e){
			throw new ProductDAOException(e.getMessage());
	}
	return bRet;     }

    @Override
    public boolean update(Product product) throws ProductDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Product product) throws ProductDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(int idProduct) throws ProductDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int idProduct) throws ProductDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> retriveAll() throws ProductDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> retriveByWhere(String criteria) throws ProductDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product retriveByID(int id) throws ProductDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
