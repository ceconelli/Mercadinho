package mercadinho;

import java.util.Date;

/**
 *
 * @author gceconelli
 */
public class Product {
    
    private String name;
    private String id;
    private double amount;
    private double price;
    
    public Product(String name, double amount){
        this.name = name;
        this.amount = amount;
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
    
    public String getId(){
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
