import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[] itemName = {"Rose Milk", "Cocktail", "Peak Milk"};
        double[] itemPrices = {110, 35, 90};
        boolean[] itemAvailable = {true, false, true};

//        add items to the Array using Scanner class/object
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Are You Adding An Item?: Y or N"); // hint the user
            String userInput = in.next();

            if (userInput.equalsIgnoreCase("n")) break;
            System.out.println("Enter Item Name: ");
            String name = in.next();

            System.out.println("Enter Item Price: ");
            double price = in.nextDouble();

            System.out.println("Enter Item Status: ");
            boolean status = in.nextBoolean(); //true / false

           //add captured item: name, price, status,(availability) to Arrays
            itemName = Arrays.copyOf(itemName, itemName.length+1);
            // {"Rose Milk", "Cocktail", "Peak Milk", " "}
            itemName[itemName.length-1] = name;
            System.out.println(Arrays.toString(itemName));

            //add captured item: name, price, status,(availability) to Arrays
            itemPrices = Arrays.copyOf(itemPrices, itemPrices.length+1);
            // {"Rose Milk", "Cocktail", "Peak Milk", " "}
            itemPrices[itemPrices.length-1] = price;
            System.out.println(Arrays.toString(itemPrices));

            //add captured item: name, price, status,(availability) to Arrays
            itemAvailable = Arrays.copyOf(itemAvailable, itemAvailable.length+1);
            // {"Rose Milk", "Cocktail", "Peak Milk", " "}
            itemAvailable[itemAvailable.length-1] = status;
            System.out.println(Arrays.toString(itemAvailable));


        } while (true);

//        Print the item one-by-one
        for (int i = 0; i < itemName.length; i++) {

            String checkAvailability = null;
            if (itemAvailable[i]) {
                checkAvailability = ("Available");
            } else {
                checkAvailability = ("Out Of Stock");
            }

            System.out.println(itemName[i] + " " + itemPrices[i]+ " " + checkAvailability);

        }

        for (int i = 0; i < itemName.length; i++) {
            System.out.println("Enter The Item Name:___");
            String searchTerm = in.nextLine();

            if(itemName[i].equalsIgnoreCase(searchTerm)) {
                System.out.println(itemName[i]+ "\t" +itemPrices[i]+ "\t" +itemAvailable[i]);
            } else {
                System.out.println("Item Not Found.");
            }
        }
    }
}