/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.ui;
//import com.sg.vendingmachine

import com.sg.vendingmachine.dto.VendingMachineContents;
import java.util.List;


public class VendingMachineView {
    private UserIO io;
    
    // constructor 
    public VendingMachineView(UserIO io){
        this.io = io;
    }
    
    public int printMenuAndGetSelection() {
        io.print("<--- Vending Machine --->");
        io.print("1. Insert Funds");
        io.print("2. Select Item");
        io.print("3. Available Items Remaining in Machine");
        io.print("4. Exit");
        
        return io.readInt("Please select from the above choices", 1, 4);
    }
    
    // inserting funds
    
    
    // selecting item
    public void displayItemSelection (VendingMachineContents items) {
        
            io.print(items.getA1() + "     " + items.getA2() + "     " + items.getA3());
        
        io.readString("Please hit enter to continueee");
    }
    
    // available items in machine ==> "3. Available Items Remaining in Machine"
    public void displayItemsList (VendingMachineContents items) {
        if (items != null)
        {
            io.print(
                    items.getA1() + " -- Remaining: " + items.getCountCoke(),
                    items.getA2() + " -- Remaining: " + items.getCountSprite(),
                    items.getA3() + " -- Remaining: " + items.getCountDrPepper());                   
        }                   
        
        io.readString("Please hit enter --> ");
    }
    
    public void displayItemListBanner() {
        io.print("Here's what we have available: \n");
    }
    
    // exit
    public void displayExitBanner(){
        io.print("Goodbye friend...");
    }
    
    
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command my friend...");
    }
    
    public void displayErrorMessage (String errorMsg) {
        io.print("<--- ERROR --->");
        io.print(errorMsg);
    }
    
    
    
    
    
}
