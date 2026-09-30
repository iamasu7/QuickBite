import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int findItemsIndexByName(String[] names, String query) {
        // look-up / search for item name
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(query)) {
                return i;
            }
        }
        // done searching
        return -1;
    }

    public static void printMenu(String[] itemName, double[] itemPrices, boolean[] itemAvailable) {
        for (int i = 0; i < itemName.length; i++) {

            String checkAvailability = null;
            if (itemAvailable[i]) {
                checkAvailability = ("Available");
            } else {
                checkAvailability = ("Out Of Stock");
            }

            System.out.println(itemName[i] + " " + itemPrices[i] + " " + checkAvailability);
        }
    }

    public static void findItemIndexByName (Scanner in, String[] itemName, double[] itemPrices, boolean[] itemAvailable) {
        String searchTerm = in.nextLine();
        boolean found = false;

        for (int i = 0; i < itemName.length; i++) {
            if(searchTerm.equalsIgnoreCase(itemName[i])) {
                System.out.println(itemName[i]+ "\t" +itemPrices[i]+ "\t" +itemAvailable[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item Not Found.");
        }
    }

    public static void addToArray (Scanner in, String[] itemName, double[] itemPrices, boolean[] itemAvailable) {
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
    }

    static void main(String[] args) {
        String[] itemName = {"Rose Milk", "Cocktail", "Peak Milk"};
        double[] itemPrices = {110, 35, 90};
        boolean[] itemAvailable = {true, false, true};

//        add items to the Array using Scanner class/object
        Scanner in = new Scanner(System.in);

       addToArray(in, itemName, itemPrices, itemAvailable);

//        Print the item one-by-one
        printMenu(itemName, itemPrices, itemAvailable);

        System.out.println("Enter The Item Name:___");
        in.nextLine();

        findItemIndexByName(in, itemName, itemPrices, itemAvailable);

//      Linear search by item name
        int index = findItemsIndexByName(itemName, "COCKTAIL");
        System.out.println(index);

//      item is not found
        if (index == -1 ) {
            System.out.println("Item Not Found!");
        } else {
            System.out.println("Item Is At Index: " +index+ " - " +itemName);
        }
    }
}