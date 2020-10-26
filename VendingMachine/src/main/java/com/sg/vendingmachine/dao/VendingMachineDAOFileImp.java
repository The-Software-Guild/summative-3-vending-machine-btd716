/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.VendingMachineContents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachineDAOFileImp implements VendingMachineDAO {

    private final Map<String, VendingMachineContents> itemsAvailable = new HashMap<>();
    @Override
    public List<VendingMachineContents> getAllItems() throws VendingMachineDAOException {
        
        return new ArrayList<VendingMachineContents> (itemsAvailable.values());
        
    }
    
}
