/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class VendingMachineContents {
    
    private String itemName; // name of each item
        //itemName = ("Coke   " + "\nSprite   " + "Dr Pepper   ");
    private BigDecimal itemCost; // the cost of each item --> to remain constant
    private int itemCount; // the count of items within the machine --> to change after every transaction
    private BigDecimal vmBank; // the total amount of money in the vending machine "bank"
    private BigDecimal usrFunds; // the amount of funds inserted by the user
 
    
    public VendingMachineContents(String itemName){
        this.itemName = itemName;
    }
    
    public VendingMachineContents(BigDecimal usrFunds) {
        this.usrFunds = usrFunds;
    }
    
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
   
    public BigDecimal getVmBank() {
        return vmBank;
    }

    public void setVmBank(BigDecimal vmBank) {
        this.vmBank = vmBank;
    }

    public BigDecimal getUsrFunds() {
        return usrFunds;
    }

    public void setUsrFunds(BigDecimal usrFunds) {
        this.usrFunds = usrFunds;
    }

    
    
    
    /*
    Map <String, Integer> vmContents = new HashMap<>();
        vmContents.put("Coke", 0.75);
        vmContents.put("Sprite", 0.75);
        vmContents.put("Dr Pepper", 0.75);
    */
    
    // what constructor do I write???
    
    /*
    // the variables of items in the vending machine
    private String a1 = "coke",
                a2 = "sprite",
                a3 = "dr pepper";
    
    // price of items
    public double p1 = .75,
                p2 = .75,
                p3 = .75;
    
    // the amount of items (quantity of each) in the machine from the start
    public int countCoke = 10,
                countSprite = 15,
                countDrPepper = 7;
    */

    
    
    
}
