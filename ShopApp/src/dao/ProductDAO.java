/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exceptions.ProducerDAOException;
import exceptions.ProductDAOException;
import exceptions.SaleDAOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Product;
import model.Sale;

/**
 *
 * @author Isaac
 */
public class ProductDAO implements ProductDAOInterface2{
    boolean bRet=false;
    PreparedStatement pstm;
    public ProductDAO(){}
    
    @Override
    public boolean insert(Product product) throws ProductDAOException {
        try{
			pstm=ConnectionFactory.getConnection().prepareStatement("INSERT INTO product (idProduct,nameProduct,amountProduct,priceProduct,Producer_idProducer) values (null,?,?,?,?)");
			pstm.setString (1,product.getName());
                        pstm.setDouble (2,product.getAmount());
			pstm.setDouble(3,product.getPrice());
                        pstm.setInt(4,product.getIdProducer());
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
        ArrayList<Product> arRet = new ArrayList<Product>();
        try {
            pstm = ConnectionFactory.getConnection().prepareStatement("SELECT * FROM product");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                arRet.add(new Product(rs.getInt("idProduct"),
                        rs.getString("nameProduct"),
                        rs.getInt("amountProduct"),
                        rs.getInt("priceProduct"),
                        rs.getInt("Producer_idProducer")
                        
                ));
            }
            ConnectionFactory.closeConnection(pstm, rs);
        } catch (Exception e) {
            throw new ProductDAOException(e.getMessage());
        }
        return arRet;
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
