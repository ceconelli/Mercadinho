package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Sale;
import exceptions.EstadoDAOException;
import exceptions.ProductDAOException;
import exceptions.SaleDAOException;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Estado;

public class SaleDAO implements saleDAOInterface{
    boolean bRet=false;
    PreparedStatement pstm;
    public SaleDAO() {}
    
    @Override
    public boolean insert(Sale sale) throws SaleDAOException {
        try{
			pstm=ConnectionFactory.getConnection().prepareStatement("INSERT INTO sale (idSale,amountSale,soldatSale) values (null,?,?)");
			pstm.setDouble(1,sale.getAmount());
			pstm.setDate(2, sale.getSoldAt());
			pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
	}catch(Exception e){
			throw new SaleDAOException(e.getMessage());
	}
	return bRet;    }

    @Override
    public boolean update(Sale sale) throws SaleDAOException {
		try{
                        pstm=ConnectionFactory.getConnection().prepareStatement("UPDATE sale SET  amountSale=?, soldatSale=? WHERE idSale=?;");
				pstm.setDouble(1,sale.getAmount());
                        pstm.setDouble(1, sale.getAmount());
                        pstm.setDate(2, sale.getSoldAt());
                        pstm.setInt(3, sale.getId());
			pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
		}catch(Exception e){
			throw new SaleDAOException(e.getMessage());
		}	
                return bRet;
    }

    @Override
    public boolean delete(Sale sale) throws SaleDAOException {          
        try{
			pstm=ConnectionFactory.getConnection().prepareStatement("delete from sale where idSale=?");
                        pstm.setInt(1,sale.getId());
                        pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
	}catch(Exception e){
			throw new SaleDAOException(e.getMessage());
	}
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
        ArrayList<Sale> arRet = new ArrayList<Sale>();
                        try{
                                pstm=ConnectionFactory.getConnection().prepareStatement("SELECT * FROM sale");
                                ResultSet rs=pstm.executeQuery();
                                while(rs.next()){
                                        arRet.add(new Sale(rs.getInt("idSale"),
                                                    rs.getInt("amountSale"),
                                                    rs.getDate("soldatSale")
                                                      ));
                                }
                                ConnectionFactory.closeConnection(pstm,rs);
                        }catch(Exception e){
                                throw new SaleDAOException(e.getMessage());
                        }
                        return arRet;
    }

    @Override
    public ArrayList<Sale> retriveByWhere(String criteria) throws SaleDAOException {
		return null;
    }

    @Override
    public Sale retriveByID(int id) throws SaleDAOException {
                Sale arRet = new Sale(); 
		try{
                                pstm=ConnectionFactory.getConnection().prepareStatement("SELECT * FROM sale where idSale=?");
                                pstm.setInt(1,id);
                                ResultSet rs=pstm.executeQuery();
                                rs.next();
                                arRet = new Sale(rs.getInt("idSale"),
                                                    rs.getInt("amountSale"),
                                                    rs.getDate("soldatSale"));
                                
                                ConnectionFactory.closeConnection(pstm,rs);
                        }catch(Exception e){
                                throw new SaleDAOException(e.getMessage());
                        }
                       return arRet;
    }

 
	

	
}
