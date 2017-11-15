/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gceconelli
 */
public class Mercadinho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Producer> producers = new ArrayList();
        //TODO - colocar parada para não poder adicionar dois produtores com o msm cpf
        producers.add(new Producer("Joao","1","1"));
        producers.add(new Producer("Pedro","12","2"));
        producers.add(new Producer("Jesus","123","3"));
        producers.add(new Producer("Judas","1234","4"));
        producers.add(new Producer("Tadeu","12345","5"));
        producers.add(new Producer("Caio","123456","6"));
        
        producers.get(2).addProduct(new Product("Macarrão",5,"1",5));
        producers.get(2).addProduct(new Product("Leite",5,"2",5));
        producers.get(2).addProduct(new Product("Vinagre",5,"3",5));
        producers.get(2).addProduct(new Product("Biscoito",5,"4",5));
        
        new MainFrame(producers).setVisible(true);
    }
    
}
