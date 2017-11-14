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
        producers.add(new Producer("Joao","123456","1"));
        producers.add(new Producer("Pedro","123456","2"));
        producers.add(new Producer("Jesus","123456","3"));
        producers.add(new Producer("Judas","123456","4"));
        producers.add(new Producer("Tadeu","123456","5"));
        producers.add(new Producer("Caio","123456","6"));
        
        new MainFrame(producers).setVisible(true);
    }
    
}
