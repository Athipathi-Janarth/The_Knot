/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.StylistPanel;

import Business.EcoSystem;
import Employee.Employee;
import Model.MenuItem.BakeryMenuItem;
import Model.MenuItem.DecorMenuItem;
import Model.MenuItem.StylistMenuItem;
import Model.Menus.DecorMenu;
import Model.Menus.StylistMenu;
import Models.Organization.Stylist;
import Models.Organization.Organization;
import Models.Organization.Stylist;
import Network.Network;
import ui.SystemAdmin.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author athipathi
 */
public class stylistItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form networkPanel
     */
   EcoSystem system;
   Organization org;
   Employee employee;
   Stylist stylist;
   public String photoPath;
    public stylistItemsPanel(EcoSystem system,Employee employee) {
        initComponents();
        adminPanelCard.setBackground(new Color(0,0,0,90));
        this.system=system;
        this.employee=employee;
        photo.setSize(125, 145);
        adminPanelCard.setBackground(new Color(0,0,0,90));
        stylist = getStylist(employee.getOrgId());
        ItemsTable.getColumn("Image").setCellRenderer(new CellRenderer());
        populateTable(stylist.getMenu());
    }
     private Stylist getStylist(long orgId){
       Network network = system.retriveNetwork(employee.getNetworkname());
        Stylist currentStylist=null;
        ArrayList<Stylist> stylist = network.getStylistDirectory().getStylistDirectory();
       
        for(int i=0; i < stylist.size();i++){         
            if(stylist.get(i).getId() == orgId ){
                System.out.println("Stylist found");
                currentStylist= stylist.get(i);
            }
        }
       return currentStylist;
    }
      public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(125, 145, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public ImageIcon ResizeImageTable(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
        btnCreateCake = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        cakeImg = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        uploadImage = new javax.swing.JButton();
        photo1 = new javax.swing.JLabel();
        adminBackgroundImg = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(977, 630));
        setLayout(null);

        ItemsTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Event Type", "Package", "Theme", "Price", "Image", "Menu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
            ItemsTable.getColumnModel().getColumn(5).setMinWidth(0);
            ItemsTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            ItemsTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        btnCreateCake.setText("Add Item");
        btnCreateCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCakeActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Event Type");

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Package");

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Theme");

        jTextField3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");

        jTextField4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        ImageLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ImageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ImageLabel.setText("Image");

        photo.setSize(new java.awt.Dimension(145, 128));
        photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photoMouseClicked(evt);
            }
        });

        uploadImage.setText("Upload Image");
        uploadImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadImageMouseClicked(evt);
            }
        });

        photo1.setSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(133, 133, 133)
                                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(ImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uploadImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cakeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(photo1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(btnCreateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadImage))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(cakeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addComponent(ImageLabel)
                                .addGap(4, 4, 4)
                                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(photo1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCreateCake, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
        );

        photo1.setVisible(false);

        add(adminPanelCard);
        adminPanelCard.setBounds(0, 0, 1090, 630);

        adminBackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/weddingcake.jpeg"))); // NOI18N
        add(adminBackgroundImg);
        adminBackgroundImg.setBounds(0, 0, 1090, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoMouseClicked
        
    }//GEN-LAST:event_photoMouseClicked

    private void btnCreateCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCakeActionPerformed
        // TODO add your handling code here:
        String name = jTextField2.getText().trim();
        String eventType = jTextField1.getText().trim();
        String Theme =  jTextField3.getText().trim();
        float price = Float.valueOf(jTextField4.getText().trim());
        stylist.getMenu().addStylistMenuItem(new StylistMenuItem(eventType, Theme,photoPath, name,stylist.getMenu().getMenuItemId(),price));
        populateTable(stylist.getMenu());
        resetForm();
    }//GEN-LAST:event_btnCreateCakeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRowIndex = ItemsTable.getSelectedRow();
        
        if(selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Select a item to delete it.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();
        StylistMenuItem menuitem = (StylistMenuItem) model.getValueAt(selectedRowIndex, 5);
        stylist.getMenu().getStylistMenu().remove(menuitem);
        resetForm();
        populateTable(stylist.getMenu());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void ItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsTableMouseClicked
        int selectedRowIndex = ItemsTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();
        StylistMenuItem menuitem = (StylistMenuItem) model.getValueAt(selectedRowIndex, 5); 
        jTextField2.setText(menuitem.getItemName());

        jTextField4.setText(Float.toString(menuitem.getPrice()));
        jTextField1.setText(menuitem.getEventType());
        jTextField3.setText(menuitem.getTheme());
                                  
    }//GEN-LAST:event_ItemsTableMouseClicked

    private void uploadImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadImageMouseClicked
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            photoPath = path;
            photo.setIcon(ResizeImage(path));
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_uploadImageMouseClicked
     private void resetForm() {
       jTextField4.setText("");
       jTextField3.setText("");
       jTextField2.setText("");
       jTextField1.setText("");
       photo.setIcon(null);
    }
     private void populateTable(StylistMenu menu){        
        DefaultTableModel model = (DefaultTableModel) ItemsTable.getModel();
        model.setRowCount(0);
        for(int i=0;i< menu.getStylistMenu().size();i++){
            StylistMenuItem menuItem = menu.getStylistMenu().get(i); 
            javax.swing.JLabel photo2;
            photo2=new JLabel();
            photo2.setIcon(ResizeImageTable(menuItem.getPhoto()));
            model.addRow(new Object[]{
             menuItem.getEventType(),
              menuItem.getItemName(),
              menuItem.getTheme(),
              menuItem.getPrice(),
              photo2,
              menuItem
            });
        }
    }
     class CellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {

            TableColumn tb = ItemsTable.getColumn("Image");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);

            ItemsTable.setRowHeight(60);

            return (Component) value;
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JLabel adminBackgroundImg;
    private javax.swing.JPanel adminPanelCard;
    private javax.swing.JButton btnCreateCake;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel cakeImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel photo1;
    private javax.swing.JButton uploadImage;
    // End of variables declaration//GEN-END:variables
}
