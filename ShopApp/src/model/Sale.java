package model;

import java.util.Date;

/**
 *
 * @author gceconelli
 */
public class Sale {
    private int id;
    private double amount;
    private Date soldAt;
    public Sale() {
        this.id=0;
        this.amount = 0;
        this.soldAt = null;
    }
  
    public Sale(int id, double amount, Date soldAt) {
        this.id=id;
        this.amount = amount;
        this.soldAt = soldAt;
    }
    public Sale( double amount, Date soldAt) {
        this.id=0;
        this.amount = amount;
        this.soldAt = soldAt;
    }
  
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getSoldAt() {
        return soldAt;
    }

    public void setSoldAt(Date soldAt) {
        this.soldAt = soldAt;
    }
    
    

}
