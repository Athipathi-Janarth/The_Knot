/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import javax.swing.JPanel;
import ui.FoodAdmin.mainPanelFoodAdmin;

/**
 *
 * @author vikashsingh
 */
public class FoodAdminRole extends Role{

    @Override
    public JPanel createWorkArea() {
       return new mainPanelFoodAdmin();
       
    }

    
    
}
