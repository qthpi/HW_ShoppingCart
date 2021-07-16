import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User userDetails  = User.inputDetails();
        welcome();

        ArrayList<Item> cart = new ArrayList<Item>();
        ArrayList<Double> prices = new ArrayList<Double>();
        boolean keepShopping = true;

        while (keepShopping) {
            keepShopping = order(keepShopping, cart, prices);
        }

        printReceipt(cart, prices, userDetails);
    }

    public static void welcome(){
        ArrayList<String> menu = new ArrayList<String>();
        System.out.println("Welcome to my flower shop! \n\tHere are the available flowers for today:");
        menu.add("Rose for 10.50 each");
        menu.add("Peony for 65.75 each");
        menu.add("Cotton for 34.99 each");
        System.out.println("\t"+menu);
    }

    public static boolean order(boolean keepShopping, ArrayList<Item> cart, ArrayList<Double> prices){
        //item scan and total
        MyScanner.itemScan(cart, prices);

        //checkout
        System.out.println("Would you like to check out? (Yes/No)");
        keepShopping = checkOut(keepShopping);
        return keepShopping;
    }

    public static boolean checkOut(boolean keepShopping){
        String ans = MyScanner.scan();

        if (ans.equalsIgnoreCase("Yes")){
            System.out.println("Checking Out!");
            keepShopping = false;
        }
        else if (ans.equalsIgnoreCase("No")){
            System.out.println("Okay, let's add more items to your cart!");
            keepShopping = true;
        }
//        else{ //fix me later
//            System.out.println("Please input either Yes or No.");
//            System.out.println("Would you like to check out? (Yes/No)");
//            ans = true;
//        }
        return keepShopping;
    }

    public static void printReceipt(ArrayList<Item> cart, ArrayList<Double> prices, User userDetails){

        Iterator itr= cart.iterator();
        System.out.println("ITEM LIST");
        while(itr.hasNext()){
            Item it=(Item)itr.next();
            System.out.println("\t" + it.itemName + "\t" + it.itemCount + "\t" + it.itemPrice + "\t" + it.itemTotal + "\t");
        }

        //test lang
        double totalVal = myCalc.calcTotal(prices);
        System.out.println("\tTOTAL VALUE: " + totalVal);

        System.out.println("\nDELIVERY DETAILS:");
        System.out.println("\tName:" + userDetails.name + "\tAddress:" + userDetails.address + "\tContact:" + userDetails.contact);
        System.out.println("Thank you for buying!");
        return;
    }
}
