import java.util.ArrayList;

public class Grocery {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGrocery(String item)
    {
        if(item != null) {
            groceryList.add(item);
            System.out.println("Item is added to grocery list");
        }
    }

    public void modifyGrocery(String olditem, String newitem) {
        int position = findGrocery(olditem);
        if (position >= 0 && newitem != null) {
            groceryList.set(position, newitem);
            System.out.println("Item is modified in the list");
        } else {
            System.out.println("Item to be replaced doesn't exist in the list");
        }
    }

    public String searchGrocery(String itemSearched)
    {  int position = findGrocery(itemSearched);
        if( position >= 0 )
        {
            return groceryList.get(position);
        }
        return null;
    }

    private int findGrocery(String itemSearched)
    {  if( groceryList.contains(itemSearched))
         { return groceryList.indexOf(itemSearched);
         }
       return -1;
    }


    public void printGrocery()
    {
        for ( int i=0; i< groceryList.size();i++) {
            System.out.println(" Item at position " + (i+1) + " is : " + groceryList.get(i));
        }
    }
    
}



