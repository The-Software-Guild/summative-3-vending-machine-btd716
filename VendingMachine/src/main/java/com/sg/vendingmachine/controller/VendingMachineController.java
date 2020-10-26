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
    
    // controller constructor
    public VendingMachineController (VendingMachineDAO dao, VendingMachineView view) {
        this.dao = dao;
        this.view = view;
    }
    
    // main part of program ==> the switch cases
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
                        insertFunds();
                        break;
                    case 2:
                        selectItem();
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
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    
    // choice 1
    private void insertFunds() throws VendingMachineDAOException {
        view.displayInsertionBanner();
        VendingMachineContents newTransaction = view.displayFundsInsertion();
        dao.insertFunds(newTransaction.getUsrFunds(), newTransaction);
        view.displayInsertionSuccessBanner();
    }
    
    
    // choice 2
    private int getSelectionMenu() {
        return view.displayItemSelection();
    }
    
    private void selectItem() throws VendingMachineDAOException {
        view.displayItemSelectionBanner();
        
        boolean keepGoing = true;
        int itemSelect = 0;
        while (keepGoing) {
            itemSelect = getSelectionMenu();
            
            switch(itemSelect)
            {
                case 1:
                    System.out.println("Coke costs $0.75");
                    break;
                case 2:
                    System.out.println("Sprite costs $0.75");
                    break;
                case 3:
                    System.out.println("Dr Pepper costs $0.75");
                    break;
                case 4:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }
        }
        /*
        VendingMachineContents newSelection = view.displayItemSelection();
        dao.makePurchase(newSelection.getItemName(), newSelection);
        view.displayItemSelectionSuccessBanner();
         */        
    }    
    
    
    // choice 3
    private void displayItemsList() throws VendingMachineDAOException {
        view.displayItemListBanner();
        List<VendingMachineContents> itemsList = dao.getAllItems();
        view.displayItemsList(itemsList);
    }
    
    
    
    
    
    
    
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }
    
    
    
    
    
    
}
