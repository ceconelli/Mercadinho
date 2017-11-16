import dao.EstadoDAO;
import dao.ProducerDAO;
import dao.ProductDAO;
import dao.SaleDAO;
import exceptions.SaleDAOException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import model.Estado;
import model.Producer;
import model.Product;
import model.Sale;

import view.EstadoCadastroView;


public class Run {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
                //EstadoCadastroView estado = new EstadoCadastroView("Estado",100,100,500,500);
	//	estado.setVisible(true);
          //  	estado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Producer pd = new Producer(1,"1anao","112",2);
                try{
                  //   EstadoDAO dao= new EstadoDAO();
                       ProducerDAO dao = new ProducerDAO();
                       dao.delete(pd);
                       System.out.println(dao.retriveByID(1).getName());
                       //e.insert(es);
              //      dao.insert(sale);
                }catch(Exception e){
                    System.out.println(e);
                }
        }

}
