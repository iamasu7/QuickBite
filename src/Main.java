import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String[] itemName = {"Rose Milk", "Cocktail", "Peak Milk"};
        double[] itemPrices = {110, 35, 90};
        boolean[] itemAvailable = {true, false, true};

//        add items to the Array using Scanner class/object
        Scanner in = new Scanner(System.in);

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
    }
}