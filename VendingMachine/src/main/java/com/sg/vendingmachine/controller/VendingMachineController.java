/*
    Badon Delmotte
    10/23/20
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.dao.VendingMachineDAO;
import com.sg.vendingmachine.dao.VendingMachineDAOException;
import com.sg.vendingmachine.ui.VendingMachineView;
import com.sg.vendingmachine.dto.VendingMachineContents;
import java.util.List;

public class VendingMachineController {
    
    private VendingMachineView view;
    private VendingMachineDAO dao;
    
    public VendingMachineController (VendingMachineDAO dao, VendingMachineView view) {
        this.dao = dao;
        this.view = view;
    }
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing)
            {
                menuSelection = getMenuSelection();
                
                switch(menuSelection)
                {
                    case 1:
                        // insertFunds();
                        break;
                    case 2:
                        // selectItem();
                        break;
                    case 3:
                        displayItemsList();
                        break;
                    case 4:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        } 
        catch (VendingMachineDAOException e)
        {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private void insertFunds() throws VendingMachineDAOException {
        
    }
    
    private void selectItem() throws VendingMachineDAOException {
        view.displayItemSelection(items);
    }
    
    private void displayItemsList() throws VendingMachineDAOException {
        view.displayItemListBanner();
        List<VendingMachineContents> itemsList = dao.getAllItems();
        view.displayItemsList(itemsList);
    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
    
    
    
    
    
    
}
