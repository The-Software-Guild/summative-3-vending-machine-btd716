/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.VendingMachineContents;
import java.util.List;

public interface VendingMachineDAO {
    
    List<VendingMachineContents> getAllItems() throws VendingMachineDAOException;
    
}
