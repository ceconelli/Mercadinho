/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exceptions.ProducerDAOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Producer;

/**
 *
 * @author Isaac
 */
public class ProducerDAO implements ProducerDAOInterface{
    boolean bRet=false;
    PreparedStatement pstm;
    @Override
    public boolean insert(Producer producer) throws ProducerDAOException {
    try{
			pstm=ConnectionFactory.getConnection().prepareStatement("INSERT INTO producer (idProducer,nameProducer,CPFProducer,cashProducer) values (null,?,?,?)");
                        pstm.setString(1,producer.getName());
			pstm.setString(2, producer.getCpf());
			pstm.setDouble(3, producer.getCash());
                        pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
	}catch(Exception e){
			throw new ProducerDAOException(e.getMessage());
	}
	return bRet;    
    }    

    @Override
    public boolean update(Producer producer) throws ProducerDAOException {
                try{
                        pstm=ConnectionFactory.getConnection().prepareStatement("UPDATE producer SET  nameProducer=?, CPFProducer=?, cashProducer=? WHERE idProducer=?");
                        pstm.setString(1,producer.getName());
                        pstm.setString(2, producer.getCpf());
                        pstm.setDouble(3, producer.getCash());
                        pstm.setInt(4, producer.getId());
			pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
		}catch(Exception e){
			throw new ProducerDAOException(e.getMessage());
		}	
                return bRet;    }    

    @Override
    public boolean delete(Producer producer) throws ProducerDAOException {
          try{
			pstm=ConnectionFactory.getConnection().prepareStatement("delete from producer where idProducer=?");
                        pstm.setInt(1,producer.getId());
                        pstm.execute();
			ConnectionFactory.closeConnection(pstm);
			bRet=true;
	}catch(Exception e){
			throw new ProducerDAOException(e.getMessage());
	}
	return bRet;        
    }
    @Override
    public boolean update(int idProducer) throws ProducerDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int idProducer) throws ProducerDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producer> retriveAll() throws ProducerDAOException {
        ArrayList<Producer> arRet = new ArrayList<Producer>();
                        try{
                                pstm=ConnectionFactory.getConnection().prepareStatement("SELECT * FROM producer");
                                ResultSet rs=pstm.executeQuery();
                                while(rs.next()){
                                        arRet.add(new Producer(rs.getInt("idProducer"),
                                                    rs.getString("nameProducer"),
                                                    rs.getString("CPFProducer"),
                                                    rs.getInt("cashProducer")
                                                      ));
                                }
                                ConnectionFactory.closeConnection(pstm,rs);
                        }catch(Exception e){
                                throw new ProducerDAOException(e.getMessage());
                        }
                        return arRet;    }

    @Override
    public ArrayList<Producer> retriveByWhere(String criteria) throws ProducerDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producer retriveByID(int id) throws ProducerDAOException {
        Producer arRet = new Producer(); 
		try{
                                pstm=ConnectionFactory.getConnection().prepareStatement("SELECT * FROM producer where idProducer=?");
                                pstm.setInt(1,id);
                                ResultSet rs=pstm.executeQuery();
                                rs.next();
                                arRet = new Producer(rs.getInt("idProducer"),
                                                    rs.getString("nameProducer"),
                                                    rs.getString("CPFProducer"),
                                                    rs.getInt("cashProducer"));
                                
                                ConnectionFactory.closeConnection(pstm,rs);
                        }catch(Exception e){
                                throw new ProducerDAOException(e.getMessage());
                        }
                       return arRet;    }
    
}
