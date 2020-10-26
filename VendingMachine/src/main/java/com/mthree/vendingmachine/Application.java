/*
    Badon Delmotte
    10/23/20
 */
package com.mthree.vendingmachine;

import com.sg.vendingmachine.controller.VendingMachineController;
import com.sg.vendingmachine.dao.VendingMachineDAO;
import com.sg.vendingmachine.dao.VendingMachineDAOFileImp;
import com.sg.vendingmachine.ui.UserIO;
import com.sg.vendingmachine.ui.UserIOConsoleImp;
import com.sg.vendingmachine.ui.VendingMachineView;

public class Application {
    
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImp();
        VendingMachineView myView = new VendingMachineView(myIo);
        VendingMachineDAO myDAO = new VendingMachineDAOFileImp();
        VendingMachineController controller = new VendingMachineController(myDAO, myView);
        controller.run();
    }
}
