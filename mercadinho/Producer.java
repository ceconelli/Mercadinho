package mercadinho;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producer {
    
    private String name;
    private String cpf;
    private String id;
    private List<Product> products;
    private List<Sale> sales;
    private List<Sale> purchases;
    private double cash;

    public Producer(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
        this.products = new ArrayList();
        this.sales = new ArrayList();
        this.purchases = new ArrayList();
        this.cash = 0;
    }
    
    public List getProducts(){
        return this.products;
    }
    
    public void addProduct(Product p){
        Product product = this.searchProduct(p);
        if(product == null)
            this.products.add(p);
        else
            product.increaseAmount(p.getAmount());
    }
    
    public Product removeProduct(Product p){
        Product product = this.searchProduct(p);
        if(product != null){
            this.products.remove(p);
            return p;
        }
        return null;
    }
    
    public Product searchProduct(Product p){
        for(Product pd:this.products){
            if(pd.getId() == p.getId())
                return pd;
        }
        return null;
    }
    
    public Sale searchSale(Sale s){
        for(Sale sale:this.sales){
            if(sale.equals(s))
                return sale;
        }
        return null;
    }
    
    public void addSale(Sale s){
        this.sales.add(s);
    }
    
//    public Sale removeSale(Sale s){
//        if(!this.sales.isEmpty())
//            return this.sales.remove(this.sales.indexOf(s));
//        return null;
//    }
    
    public Sale searchPurchase(Sale s){
        for(Sale sale:this.purchases){
            if(sale.equals(s))
                return sale;
        }
        return null;
    }
    
    public void addPurchase(Sale s){
        this.purchases.add(s);
    }
    
    public Sale removePurchase(Sale s){
        if(!this.purchases.isEmpty())
            return this.purchases.remove(this.purchases.indexOf(s));
        return null;
    }
    
    public void sell(Product p,double amount){
        Product pd = this.searchProduct(p);
        if(pd != null){
            if(pd.sell(amount)){
                this.cash += pd.getPrice() * amount;
                this.addSale(new Sale(p,amount,new Date()));
            }
                
        }
    }
    
    public void buy(Product p,double amount){
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    
    
}
