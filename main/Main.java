package main;
import utils.*;
import config.*;
import menu.*;

public class Main{
    public static void main(String[] args){
        String boot = "open";
        Login refLogin = new Login();
        Sub_Menus refMenu = new Sub_Menus();
        ListsObjects list = new ListsObjects();

        while(boot.equals("open")){
            switch (refMenu.menuLogin()) {
                case 1:
                int answerLogin;
                answerLogin = refLogin.login(list);
                if(answerLogin != 0){
                    String answerMenu = "open";
                    while(!answerMenu.equals("Exit")){
                    switch (answerLogin) {
                        case 1:
                            switch(refMenu.menuAdmin()){
                                case 1:
                                    CreateNewProduct.createNewProduct(list);
                                    break;
                                case 2: 
                                    CreateNewUser.createNewUser(list);
                                    break;
                                case 3:
                                    Report.reportOrder(list);
                                    break;
                                case 4:
                                    Report.reportProduct(list);
                                    break;
                                case 5:
                                    answerMenu = "Exit";
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2:
                            switch(refMenu.menuCostumer()){
                                case 1:
                                    //StartNewOrder.startNewOrder(list, refLogin.getUser());
                                    switch(refMenu.menuStartNewOrder()){
                                        case 1:
                                            AddProduct.addProduct(list, refLogin.getUser());
                                            break;
                                        case 2:
                                            ViewShoppingCart.viewShoppingCart(list, refLogin.getUser());
                                            break;
                                        case 3:
                                            FinishOrder.finishOrder(list, refLogin.getUser());
                                            break;
                                        default:
                                            break;
                                    }
                                    break;
                                case 2:
                                    answerMenu = "Exit";
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                }
                    break;
            
                case 2:
                    list.save();
                    System.out.println("\nSaindo do sistema!!!");
                    boot = "exit";
                    break;
            }
            
        }
    }
    

}