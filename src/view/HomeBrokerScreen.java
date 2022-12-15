/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.AccountController;
import control.AssetController;
import control.OrderController;
import control.RelatesController;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JOptionPane;
import model.entities.Asset;
import model.entities.Order;
import model.entities.RelatesAccountAsset;
import model.enums.StateOrder;
import model.enums.TypeOrder;

/**
 *
 * @author pedro
 */
public final class HomeBrokerScreen extends javax.swing.JFrame {

    void listItems() {
        List<Asset> assets = AssetController.read();

        for (Asset asset : assets) {

            idComboBox.addItem(String.valueOf(asset.getId()));
        }
    }

    /**
     * Creates new form HomeBrokerScreen
     */
    public HomeBrokerScreen() {
        initComponents();

        amountField.setText("$ " + AccountController.current.getAmount());

        listItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        orderBookButton = new javax.swing.JButton();
        myAssetsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        amountField.setEditable(false);

        jLabel1.setText("Amount");

        jLabel2.setText("HomeBroker");

        buyButton.setText("Buy");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        sellButton.setText("Sell");
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        zeroButton.setText("Zero");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Order");

        orderBookButton.setText("Order Book");

        myAssetsButton.setText("My Assets");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Asset");

        idComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idComboBoxItemStateChanged(evt);
            }
        });

        jLabel5.setText("Price Asset");

        priceField.setEditable(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/rivellino.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(46, 46, 46)
                                                    .addComponent(jLabel1)))
                                            .addGap(74, 74, 74))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(buyButton)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(sellButton))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addGap(145, 145, 145)
                                                    .addComponent(jLabel3)))
                                            .addGap(129, 129, 129)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(orderBookButton)
                                        .addGap(139, 139, 139)
                                        .addComponent(myAssetsButton)))
                                .addContainerGap(28, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(zeroButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(23, 23, 23))
                                            .addComponent(idComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel5)
                                                .addGap(22, 22, 22)))))
                                .addGap(56, 56, 56))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buyButton)
                            .addComponent(sellButton)
                            .addComponent(zeroButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderBookButton)
                    .addComponent(myAssetsButton)
                    .addComponent(backButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed

        Long asset = Long.valueOf(idComboBox.getSelectedItem().toString());
        Long idRelated = RelatesController.requestId(AccountController.current.getId(), asset);

        BigDecimal value = new BigDecimal(JOptionPane.showInputDialog("Value :"));
        Integer quantity = Integer.valueOf(JOptionPane.showInputDialog("Quantity :"));
        BigDecimal totalValue = value.multiply(new BigDecimal(quantity));

        if (RelatesController.searchPerId(idRelated).getQuantity() >= quantity) {

            Order order = new Order();
            order.setAccount(AccountController.current.getId());
            order.setTicker(idComboBox.getSelectedItem().toString());
            order.setType(TypeOrder.SELL);
            order.setState(StateOrder.OPEN);
            order.setValue(value);
            order.setQuantity(quantity);
            order.setTotalValue(totalValue);
            order.setStart(LocalDateTime.now());

            if (OrderController.create(order)
                    && AccountController.fee(BigDecimal.TEN)
                    && RelatesController.subAmount(idRelated, quantity)) {
                JOptionPane.showMessageDialog(this, "Created Sucess!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed !");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Quantity Insuficient !");
        }

    }//GEN-LAST:event_sellButtonActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed

        BigDecimal value = new BigDecimal(JOptionPane.showInputDialog("Value :"));
        Integer quantity = Integer.valueOf(JOptionPane.showInputDialog("Quantity :"));
        BigDecimal totalValue = value.multiply(new BigDecimal(quantity));

        if (AccountController.hasBalance(totalValue.add(BigDecimal.TEN))) {
            Order order = new Order();
            order.setAccount(AccountController.current.getId());
            order.setTicker(idComboBox.getSelectedItem().toString());
            order.setType(TypeOrder.BUY);
            order.setState(StateOrder.OPEN);
            order.setValue(value);
            order.setQuantity(quantity);
            order.setTotalValue(totalValue);
            order.setStart(LocalDateTime.now());

            if (OrderController.create(order)
                    && AccountController.fee(BigDecimal.TEN)) {
                JOptionPane.showMessageDialog(this, "Created Sucess!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed !");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Balance Insufficient !");
        }

    }//GEN-LAST:event_buyButtonActionPerformed

    private void idComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idComboBoxItemStateChanged
        // need assets
        priceField.setText(AssetController.search(Long.valueOf(idComboBox.getSelectedItem().toString())).getInitialPrice().toString());
    }//GEN-LAST:event_idComboBoxItemStateChanged

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed

        if (AccountController.addOrderZero()) {

            Long asset = Long.valueOf(idComboBox.getSelectedItem().toString());

            Integer quantity = Integer.valueOf(JOptionPane.showInputDialog("Quantity :"));
            BigDecimal totalValue = new BigDecimal(priceField.getText()).multiply(new BigDecimal(quantity));

            if (AccountController.hasBalance(totalValue.add(BigDecimal.TEN)) && AssetController.hasAmount(asset, quantity)) {

                Long idRelates = RelatesController.requestId(AccountController.current.getId(), asset);

                if (idRelates != null) {
                    if (RelatesController.addAmount(idRelates, quantity)
                            && AccountController.withdraw(totalValue)
                            && AssetController.subAmount(asset, quantity)) {
                        JOptionPane.showMessageDialog(this, "Sucess !");
                    }
                } else {
                    RelatesAccountAsset related = new RelatesAccountAsset();
                    related.setAccount(AccountController.current.getId());
                    related.setAsset(asset);
                    related.setQuantity(quantity);

                    related.setStart(LocalDateTime.now());

                    if (RelatesController.create(related)
                            && AccountController.fee(BigDecimal.TEN)
                            && AccountController.withdraw(totalValue)
                            && AssetController.subAmount(asset, quantity)) {

                        JOptionPane.showMessageDialog(this, "Sucess !");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "Balance Insufficient !");
            }

        } else {
            zeroButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Max of Order Zero Solicited !");
        }


    }//GEN-LAST:event_zeroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeBrokerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeBrokerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeBrokerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeBrokerScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeBrokerScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton buyButton;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton myAssetsButton;
    private javax.swing.JButton orderBookButton;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton sellButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
