/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CatererPanel;

import Business.EcoSystem;
import Employee.Employee;
import Model.MenuItem.CateringMenuItem;
import Model.MenuItem.CateringMenuItem;
import Model.Menus.CateringMenu;
import Models.Organization.Catering;
import Models.Organization.Organization;
import Network.Network;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author athipathi
 */
public class catererItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form networkPanel
     */
    EcoSystem system;
    Organization org;
    Employee employee;
    Catering catering;
    public String photoPath;

    public catererItemsPanel(EcoSystem system, Employee employee) {
        initComponents();
        this.system = system;
        this.employee = employee;
        adminPanelCard.setBackground(new Color(0, 0, 0, 90));
        
        System.out.println("Employee Id " + employee.getOrgId());
        catering = getCatering(employee.getOrgId());
        System.out.println("Catering is " + catering.getMenu());
        populateTable(catering.getMenu());
    }

    private Catering getCatering(long orgId) {
        Network network = system.retriveNetwork(employee.getNetworkname());
        Catering currentCatering = null;
        ArrayList<Catering> bakeries = network.getCateringDirectory().getCateringList();
        System.out.println("bakeries size " + bakeries.size());

        for (int i = 0; i < bakeries.size(); i++) {
            System.out.println("catering id " + bakeries.get(i).getId());
            if (bakeries.get(i).getId() == orgId) {
                System.out.println("catering found");
                currentCatering = bakeries.get(i);
                System.out.println(currentCatering.getName());
            }
        }

        return currentCatering;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanelCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        createFood = new javax.swing.JButton();
        deleteFood = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cuisine = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        cakeImg = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        adminBackgroundImg = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(977, 630));
        setLayout(null);

        ItemsTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cuisine", "Price", "menuItem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemsTable);
        if (ItemsTable.getColumnModel().getColumnCount() > 0) {
            ItemsTable.getColumnModel().getColumn(2).setMinWidth(0);
            ItemsTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            ItemsTable.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        createFood.setText("Add Item");
        createFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFoodActionPerformed(evt);
            }
        });

        deleteFood.setText("Delete");
        deleteFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFoodActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cuisine");

        cuisine.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");

        price.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(adminPanelCardLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cuisine, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(adminPanelCardLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(createFood, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(deleteFood, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cakeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(cakeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createFood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteFood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cuisine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        add(adminPanelCard);
        adminPanelCard.setBounds(0, 0, 1090, 630);

        adminBackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/foodAdminBg.png"))); // NOI18N
        add(adminBackgroundImg);
        adminBackgroundImg.setBounds(0, 0, 1090, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void createFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFoodActionPerformed
        if (validateForm()){
            String name = cuisine.getText().trim();
            float priceValue = Float.valueOf(price.getText().trim());
            System.out.println(employee.getOrgId());
            System.out.println(catering);
            catering.getMenu().addCateringMenuItem(new CateringMenuItem(name, catering.getMenu().getMenuItemId(), priceValue));
            populateTable(catering.getMenu());
            resetForm();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please enter all the details");
        }
    }//GEN-LAST:event_createFoodActionPerformed

    private void deleteFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFoodActionPerformed
        int selectedRowIndex = ItemsTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Select a item to delete it.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();
        CateringMenuItem menuitem = (CateringMenuItem) model.getValueAt(selectedRowIndex, 2);
        catering.getMenu().getCateringMenu().remove(menuitem);
        resetForm();
        populateTable(catering.getMenu());        // TODO add your handling code here:
    }//GEN-LAST:event_deleteFoodActionPerformed

    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked
        int selectedRowIndex = ItemsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();
        CateringMenuItem menuitem = (CateringMenuItem) model.getValueAt(selectedRowIndex, 2);
        System.out.println(menuitem.getId());
        cuisine.setText(menuitem.getItemName());
        price.setText(Float.toString(menuitem.getPrice()));        // TODO add your handling code here:
    }//GEN-LAST:event_ItemsTableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       int selectedRowIndex = ItemsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();
        CateringMenuItem menuitem = (CateringMenuItem) model.getValueAt(selectedRowIndex, 2); 
        String name = cuisine.getText().trim();
        float priceValue = Float.valueOf(price.getText().trim());
        System.out.println(employee.getOrgId());
        catering.getMenu().updateMenuItem(new CateringMenuItem(name,menuitem.getId(),priceValue));
        populateTable(catering.getMenu());
        resetForm();        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void resetForm() {
        cuisine.setText("");
        price.setText("");
    }
    
    public boolean validateForm(){
        boolean valid = true;
        
        if(cuisine.getText().isEmpty() || price.getText().isEmpty()){
            valid = false;
        }
        return valid;
    }
    private void populateTable(CateringMenu menu) {
        System.out.print("Catering menu ");
        System.out.print(menu);
        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < menu.getCateringMenu().size(); i++) {
            CateringMenuItem menuItem = menu.getCateringMenu().get(i);
            model.addRow(new Object[]{
                menuItem.getItemName(),
                menuItem.getPrice(),
                menuItem
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ItemsTable;
    private javax.swing.JLabel adminBackgroundImg;
    private javax.swing.JPanel adminPanelCard;
    private javax.swing.JLabel cakeImg;
    private javax.swing.JButton createFood;
    private javax.swing.JTextField cuisine;
    private javax.swing.JButton deleteFood;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
