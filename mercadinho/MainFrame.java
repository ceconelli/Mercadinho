/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mercadinho;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gceconelli
 */
public class MainFrame extends javax.swing.JFrame {

    /** Creates new form MainFrame */
    List<Producer> prod;
    DefaultListModel cart;
    DefaultTableModel tableModel;
    DefaultListModel model;
    DefaultComboBoxModel producersModel;
    
    public MainFrame(List<Producer> producers) {
        initComponents();
        
        this.cart = new DefaultListModel();
        Producer[] pd = new Producer[producers.size()];
        this.model = new DefaultListModel();
        this.tableModel = new DefaultTableModel(); 
        int i = 0;
        
        for(Producer p:producers){
            System.out.println(p.getCpf());
//            model.addElement(p);
            pd[i] = p;
            i++;
        }
        
        producersModel = new DefaultComboBoxModel(pd);
        
        this.cb_Producer.setModel(producersModel);
        this.cb_Producer_produtos.setModel(producersModel);
        this.cb_producers_Produtores.setModel(producersModel);
        
        
        tableModel.addColumn("Produto"); 
        tableModel.addColumn("Quantidade");
        tableModel.addColumn("Preço");
        tableModel.addColumn("Codigo");
        
        this.table_products.setModel(tableModel);
        prod = producers;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_ProducerID = new javax.swing.JTextField();
        cb_Producer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cb_product = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        label_availableAmount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        label_price = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        js_amountToBuy = new javax.swing.JSpinner();
        btn_addtocart = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_chart = new javax.swing.JList<>();
        btn_buy = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        btn_addProducer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_sales = new javax.swing.JList<>();
        btn_removeProducer = new javax.swing.JButton();
        cb_producers_Produtores = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        cb_Producer_produtos = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_products = new javax.swing.JTable();
        btn_removeProduct = new javax.swing.JButton();
        btn_addProduct = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 400));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setLabelFor(tf_ProducerID);
        jLabel1.setText("Código do Produtor");

        tf_ProducerID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_ProducerIDFocusLost(evt);
            }
        });
        tf_ProducerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_ProducerIDKeyTyped(evt);
            }
        });

        cb_Producer.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ProducerItemStateChanged(evt);
            }
        });
        cb_Producer.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_ProducerPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setLabelFor(cb_Producer);
        jLabel2.setText("Produtor");

        cb_product.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_productItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setLabelFor(cb_product);
        jLabel3.setText("Produto");

        label_availableAmount.setForeground(new java.awt.Color(252, 240, 240));
        label_availableAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label_availableAmount.setVerifyInputWhenFocusTarget(false);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Quantidade disponível");

        label_price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Preço");

        btn_addtocart.setText("Add to Cart");
        btn_addtocart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_addtocartMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Quantidade");

        jScrollPane3.setViewportView(list_chart);

        btn_buy.setText("Finalizar Compra");
        btn_buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_buyMouseReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Carrinho");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_buy))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_ProducerID, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cb_Producer, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_product, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(label_availableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(js_amountToBuy, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_addtocart))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ProducerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_Producer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_availableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label_price, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(js_amountToBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_addtocart)))))
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buy)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Vendas", jPanel2);

        jLabel4.setText("Produtores");

        jLabel8.setText("Nome:");

        jLabel9.setText("Código:");

        btn_addProducer.setText("Add Produtor");

        jScrollPane2.setViewportView(list_sales);

        btn_removeProducer.setText("Remover Produtor");
        btn_removeProducer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_removeProducerMouseReleased(evt);
            }
        });

        cb_producers_Produtores.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_producers_ProdutoresPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_addProducer, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cb_producers_Produtores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tf_id)
                        .addComponent(btn_removeProducer, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cb_producers_Produtores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addComponent(btn_addProducer)
                        .addGap(17, 17, 17)
                        .addComponent(btn_removeProducer)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );

        jTabbedPane2.addTab("Produtores", jPanel5);

        cb_Producer_produtos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_Producer_produtosItemStateChanged(evt);
            }
        });
        cb_Producer_produtos.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cb_Producer_produtosPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel10.setText("Produtor");

        table_products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(table_products);

        btn_removeProduct.setText("Remover Produto");
        btn_removeProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_removeProductMouseReleased(evt);
            }
        });

        btn_addProduct.setText("Adicionar Produto");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_removeProduct))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cb_Producer_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addProduct)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Producer_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addProduct))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_removeProduct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Produtos", jPanel8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Vendas", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Saldo", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gerenciar", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_ProducerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ProducerItemStateChanged
        // TODO add your handling code here:
//        System.out.println("ola");
//        Producer p = (Producer) this.cb_Producer.getSelectedItem();
        System.out.println("caralho");
        Producer p = (Producer)this.cb_Producer.getSelectedItem();
        Product[] products = new Product[p.getProducts().size()];
        int i = 0;
        for(Product a:p.getProducts()){
            products[i] = a;
            i++;
        }
        this.cb_product.setModel(new DefaultComboBoxModel(products));
        
    }//GEN-LAST:event_cb_ProducerItemStateChanged

    private void cb_ProducerPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_ProducerPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        Producer p = (Producer)this.cb_Producer.getSelectedItem();
        System.out.println(p.getCpf());
        this.tf_ProducerID.setText(p.getId());
        Product[] products = new Product[p.getProducts().size()];
        int i = 0;
        for(Product a:p.getProducts()){
            products[i] = a;
            i++;
        }
        this.cb_product.setModel(new DefaultComboBoxModel(products));
    }//GEN-LAST:event_cb_ProducerPopupMenuWillBecomeInvisible

    private void tf_ProducerIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_ProducerIDFocusLost
        // TODO add your handling code here:
//        System.out.println("oi");
        for(Producer p:this.prod){
            if(p.getId().equals(this.tf_ProducerID.getText())){
                this.cb_Producer.setSelectedItem(p);
            }
        }
    }//GEN-LAST:event_tf_ProducerIDFocusLost

    private void cb_productItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_productItemStateChanged
        // TODO add your handling code here:
        Product p = (Product)this.cb_product.getSelectedItem();
        this.label_availableAmount.setText(""+p.getAmount());
        this.label_price.setText(""+p.getPrice());
        System.out.println("entrou");
    }//GEN-LAST:event_cb_productItemStateChanged

    private void tf_ProducerIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_ProducerIDKeyTyped
        // TODO add your handling code here:
        
//        System.out.println(""+evt.getKeyCode());
//        System.out.println(KeyEvent.VK_ENTER);
       
    }//GEN-LAST:event_tf_ProducerIDKeyTyped

    private void btn_addtocartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addtocartMouseReleased
        // TODO add your handling code here:
        Product p = (Product)this.cb_product.getSelectedItem();
        if(p != null && Double.parseDouble(this.js_amountToBuy.getValue().toString()) != 0){
            cart.addElement(p);
            this.list_chart.setModel(cart);
        }
            
    }//GEN-LAST:event_btn_addtocartMouseReleased

    private void btn_buyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buyMouseReleased
        // TODO add your handling code here:
        Producer producer = (Producer)this.cb_Producer.getSelectedItem();
        for(int i=0;i<this.cart.getSize();i++){
            producer.addSale(new Sale(((Product)this.cart.elementAt(i)),Double.parseDouble(this.js_amountToBuy.getValue().toString()),new Date()));
        }
        this.cart.removeAllElements();
        
    }//GEN-LAST:event_btn_buyMouseReleased

    private void cb_Producer_produtosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_Producer_produtosItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cb_Producer_produtosItemStateChanged

    private void cb_Producer_produtosPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_Producer_produtosPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        Producer p = (Producer)this.cb_Producer_produtos.getSelectedItem();
        for(int i=0;i<this.tableModel.getRowCount();i++){
            this.tableModel.removeRow(i);
        }
        for(Product product:p.getProducts()){
            this.tableModel.addRow(new Object[]{product.getName(),product.getAmount(),product.getPrice(),product.getId()});
        }
        
        
        
    }//GEN-LAST:event_cb_Producer_produtosPopupMenuWillBecomeInvisible

    private void btn_removeProductMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeProductMouseReleased
        // TODO add your handling code here:
        Producer p = (Producer)this.cb_Producer_produtos.getSelectedItem();
        p.getProducts().remove(this.table_products.getSelectedRow());
        this.tableModel.removeRow(this.table_products.getSelectedRow());
                
    }//GEN-LAST:event_btn_removeProductMouseReleased

    private void btn_removeProducerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeProducerMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_removeProducerMouseReleased

    private void cb_producers_ProdutoresPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cb_producers_ProdutoresPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        Producer p = (Producer)this.cb_producers_Produtores.getSelectedItem();
        this.tf_name.setText(p.getName());
        this.tf_id.setText(p.getId());
        for(Sale s:p.getSales()){
            this.model.addElement(s);
        }
        this.list_sales.setModel(model);
    }//GEN-LAST:event_cb_producers_ProdutoresPopupMenuWillBecomeInvisible
    
    private Object[] getObjs(List<Object> list){
        Object[] objs = new Object[list.size()];
        int i = 0;
        for(Object it:list){
            objs[i] = it;
            i++;
        }
        
        return objs;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        List<Producer> producers = new ArrayList();
        //TODO - colocar parada para não poder adicionar dois produtores com o msm cpf
        producers.add(new Producer("Doao","1","1"));
        producers.add(new Producer("Pedro","12","2"));
        producers.add(new Producer("Jesus","123","3"));
        producers.add(new Producer("Judas","1234","4"));
        producers.add(new Producer("Tadeu","12","5"));
        producers.add(new Producer("Caio","12","6"));
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(producers).setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addProducer;
    private javax.swing.JButton btn_addProduct;
    private javax.swing.JButton btn_addtocart;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_removeProducer;
    private javax.swing.JButton btn_removeProduct;
    private javax.swing.JComboBox<String> cb_Producer;
    private javax.swing.JComboBox<String> cb_Producer_produtos;
    private javax.swing.JComboBox<String> cb_producers_Produtores;
    private javax.swing.JComboBox<String> cb_product;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JSpinner js_amountToBuy;
    private javax.swing.JLabel label_availableAmount;
    private javax.swing.JLabel label_price;
    private javax.swing.JList<String> list_chart;
    private javax.swing.JList<String> list_sales;
    private javax.swing.JTable table_products;
    private javax.swing.JTextField tf_ProducerID;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables

}
