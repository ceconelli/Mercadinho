/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Isaac
 */
public class Sale_Product {
    private int idSale;
    private int idProduct;
    void Sale_Product(){
        idSale=0;
        idProduct=0;
    }
    void Sale_Product(int idSale,int idProduct){
       this.idSale=idSale;
       this.idProduct=idProduct;
    }
    /**
     * @return the idSale
     */
    public int getIdSale() {
        return idSale;
    }

    /**
     * @param idSale the idSale to set
     */
    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    /**
     * @return the idProduct
     */
    public int getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    
}
