import java.util.ArrayList;
import java.util.Scanner;

public class ShopGro{

    private static Scanner scanner = new Scanner(System.in);
    public static Grocery gc = new Grocery();

    public static void main(String[] args) {


        boolean quit = false;
        int option;



        printOptions();


        while (!quit)
        {   System.out.print("Enter the option now :  ");
            option = scanner.nextInt();
            scanner.nextLine();
            //scanner.nextLine();

            switch(option) {

                case 1:
                    printOptions();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    searchItem();
                    break;
                case 5:
                    printList();
                    break;
                case 6:
                    quit = true;
                    break;

            }

        }

    }

    public static void printOptions()
    {
        System.out.println("You can do the following : ");
        System.out.println("\tPress 1 to see the options ");
        System.out.println("\tPress 2 to add item to grocery list ");
        System.out.println("\tPress 3 to modify item to grocery list ");
        System.out.println("\tPress 4 to search item to grocery list ");
        System.out.println("\tPress 5 to show the items in the grocery list ");
        System.out.println("\tPress 6 to exit the program ");

    }


    private static void addItem()
    {
        String item = null;
        System.out.print("\nEnter the item that is to be added : ");
        item = scanner.nextLine();
        gc.addGrocery(item);
    }

    private static void modifyItem()
    {
        String oldItem = null , newItem = null;
        System.out.print("\nEnter the old item that is to be replaced : ");
        oldItem = scanner.nextLine();

        System.out.print("\nEnter the new item : ");
        newItem = scanner.nextLine();

        gc.modifyGrocery(oldItem,newItem);

    }

    private static void searchItem()
    {
        String item = null;
        System.out.println("Enter the item that is to be searched : ");
        item = scanner.nextLine();
        if(gc.searchGrocery(item) != null) {
          System.out.println("Item exists in the list ");
        }
        else
            System.out.println("Item doesn't exist in the list");
    }

    private static void printList()
    {
        System.out.println("The grocery list is as follows : ");
        gc.printGrocery();

    }

}
