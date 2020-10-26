/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.VendingMachineContents;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachineDAOFileImp implements VendingMachineDAO {
    
    
    
    // map to store the item details (name, cost, etc.)
    // may need to make a second map; one for items themselves (below) and one for the funds in machine
    private Map <BigDecimal, VendingMachineContents> vmMoney = new HashMap<>();   
    private Map <String, VendingMachineContents> itemsAvailable = new HashMap<>();
            
    @Override
    public VendingMachineContents insertFunds(BigDecimal usrFunds, VendingMachineContents vmBank) 
            throws VendingMachineDAOException 
    {
        VendingMachineContents newFunds = vmMoney.put(usrFunds, vmBank);
        return newFunds;  
    }

    
    @Override
    public VendingMachineContents makePurchase(String itemName, VendingMachineContents itemCount) 
            throws VendingMachineDAOException 
    {
        VendingMachineContents newPurchase = itemsAvailable.put(itemName, itemCount);
        return newPurchase;
    }
    
    
    @Override
    public List<VendingMachineContents> getAllItems() 
            throws VendingMachineDAOException 
    {        
        return new ArrayList<> (itemsAvailable.values());        
    }
    
    
    
}
