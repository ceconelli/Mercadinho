package mercadinho;

import java.util.Date;

/**
 *
 * @author gceconelli
 */
public class Sale {
    private Product product;
    private double amount;
    private Date soldAt;

    public Sale(Product product, double amount, Date soldAt) {
        this.product = product;
        this.amount = amount;
        this.soldAt = soldAt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

    @Override
    public String toString() {
        return "Sale{" + "product=" + product + ", amount=" + amount + ", soldAt=" + soldAt + '}';
    }
    
    

}
