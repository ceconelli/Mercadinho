package dao;

import java.sql.Connection;
import java.sql.DriverManager;import java.sql.ResultSet;
import java.sql.Statement;



public class ConnectionFactory {
	
	private static Connection conexao;
	
	public static Connection getConnection() throws Exception/*SQLException, ClassNotFoundException*/{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			ConnectionFactory.conexao= DriverManager.getConnection("jdbc:mysql://localhost/agenda?user=root&password=root");
		}catch(Exception e){
			throw new Exception("Erro ao conectar com o BD"+e.getMessage());
		}
		return ConnectionFactory.conexao;
		
	}
	
	public static void closeConnection() throws Exception{
		try{
			conexao.close();
		}catch(Exception e){
			throw new Exception("Erro ao fechar conexão com o BD"+e.getMessage());
		}	
	}
	
	public static void closeConnection(Statement stm, ResultSet rs) throws Exception{
		try{
			conexao.close();
			stm.close();
			rs.close();
		}catch(Exception e){
			throw new Exception("Erro ao fechar conexão com o BD"+e.getMessage());
		}
	}
	public static void closeConnection(Statement stm) throws Exception{
		try{
			conexao.close();
			stm.close();
		}catch(Exception e){
			throw new Exception("Erro ao fechar conexão com o BD"+e.getMessage());
		}
	}
}
