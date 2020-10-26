/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.VendingMachineContents;
import java.math.BigDecimal;
import java.util.List;

public interface VendingMachineDAO {
    
    // corresponds to number 1
    VendingMachineContents insertFunds(BigDecimal usrFunds, VendingMachineContents vmBank)
            throws VendingMachineDAOException;
    
    // corresponds to number 2 in switch cases 
    VendingMachineContents makePurchase(String itemName, VendingMachineContents itemCount) 
            throws VendingMachineDAOException;
    
    // corresponds to number 3 in switch cases --> lists all available items in vending machine
    List<VendingMachineContents> getAllItems() 
            throws VendingMachineDAOException;
    
    
    
}
