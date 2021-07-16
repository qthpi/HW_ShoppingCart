import java.util.ArrayList;
import java.util.Scanner;

public class MyScanner {

    public static void itemScan(ArrayList<Item> cart, ArrayList<Double> prices){
        //scan values
        System.out.println("What is your order?");
        String itemName = scan();
        System.out.println("How many would of that would you like to order?");
        int itemCount = Integer.parseInt(scan());
        System.out.println("How much is the item per piece?");
        double itemPrice = Double.parseDouble(scan());

        //place scanned values to item
        Item it = new Item(itemName, itemCount, itemPrice);

        //add item to cart
        cart.add(it);
        prices.add(it.itemTotal);

        //return total value
        return;
    }

    public static String scan(){
        System.out.println("\t Input:");
        Scanner scanInput = new Scanner(System.in); //Create a scanner object and naming it scanInput
        String valueOfInput = scanInput.nextLine();  // Read user input
        String[] inputArray = valueOfInput.split(" ")  ; //we want to split inputs and use space " " as dividers (regex) and assign these splitted values into an array
        return inputArray[0];
    }


    public static void showScan(String[] inputArray) {
//        System.out.println(inputArray[0] + "\t"  + inputArray[1] + "\t" + inputArray[2]);
        for(String i: inputArray) {
            System.out.println(i);
        }
    }

}
