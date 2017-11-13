package mercadinho;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    
    private String name;
    private String cpf;
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
        this.products.add(p);
    }
    
    public Product removeProduct(Product p){
        if(!this.products.isEmpty()){
            return this.products.remove(this.products.indexOf(p));
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
    
    public void addSale(Sale s){
        this.sales.add(s);
    }
    
    public Sale removeSale(Sale s){
        if(!this.sales.isEmpty())
            return this.sales.remove(this.sales.indexOf(s));
        return null;
    }
    
    public void sell(Product p,double amount){
        Product pd = this.searchProduct(p);
        if(pd != null){
            if(pd.sell(amount))
                this.cash += pd.getPrice() * amount;
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void sell(){
        
    }
    
}
