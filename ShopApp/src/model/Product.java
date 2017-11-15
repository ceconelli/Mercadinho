package model;

import java.util.Date;

/**
 *
 * @author gceconelli
 */
public class Product {

    /**
     * @return the idProducer
     */
    public int getIdProducer() {
        return idProducer;
    }

    /**
     * @param idProducer the idProducer to set
     */
    public void setIdProducer(int idProducer) {
        this.idProducer = idProducer;
    }
    
    private int id;
    private String name;
    private double amount;
    private double price;
    private int idProducer;
    
    public Product(int id,String name, double amount,double price,int idProducer){
        this.id=id;
        this.name = name;
        this.amount = amount;
        this.price= price;
        this.idProducer=idProducer;
    }
    public Product(String name, double amount,double price,int idProducer){
        this.id=0;
        this.name = name;
        this.amount = amount;
        this.price= price;
        this.idProducer=idProducer;
    }
     public Product(){
        this.id=0;
        this.name = "";
        this.amount = 0;
        this.price= 0;
        this.idProducer=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void increaseAmount(double amount){
        this.setAmount(this.amount + amount);
    }
    
    public boolean sell(double amount){
       if(this.amount >= amount){
           this.setAmount(this.amount - amount);
           return true;
       }
       return false;
    }
    
}
