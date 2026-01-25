import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {

    private HashMap<String, GroceryItem> groceryList = new HashMap<>();

    public static void main(String [] args){

        GroceryListManager manager = new GroceryListManager();

        //testers to see that the manager works correctly
        manager.addItem("bananas", 1.30, 8, "Fruits");
        manager.addItem("oranges",0.90,8,"Fruits");
        manager.addItem("eggs",0.2, 12, "Dairy");
        manager.addItem("bread",0.5, 4, "Bakery");
        manager.addItem("bananas",1.30, 8, "Fruits");

        manager.displayList();
        manager.displayByCategory("Fruits");

        manager.checkItem("bananas");

        manager.removeItem("eggs");
        manager.updateQuantity("bread", 8);
        manager.displayAvailableItems();
        manager.displayList();

        manager.calculateTotalCost();


    }

    //method to add items to the list
    public void addItem(String item, double price, int quantity, String category){
        if(!groceryList.containsKey(item)){
            groceryList.put(item, new GroceryItem(price, quantity, category));
            System.out.println("Added \"" + item + "\" to the list.");
        }else{
            System.out.println("Could not add \"" + item + "\", already on the list.");
        }
    }

    //method to remove items from the list
    public void removeItem(String item){
        if(groceryList.containsKey(item)){
            groceryList.remove(item);
            System.out.println("Removed \"" + item + "\" from the list");
        }
    }

    //method to print out list for the user
    public void displayList(){
        if(!groceryList.isEmpty()){
            System.out.println("\nDisplaying grocery list:");
            for(Map.Entry<String, GroceryItem> entry : groceryList.entrySet()){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }else{
            System.out.println("No items on the list.");
        }
    }

    //method to display all items in chosen category
    public void displayByCategory(String category){
        System.out.println("\nItems in category \"" + category + "\":");

        boolean found = false;
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()){
            GroceryItem item = entry.getValue();
            if (item.getCategory().equalsIgnoreCase(category)){
                System.out.println(entry.getKey() + ": " + item);
                found = true;
            }
        }
        if(!found){
            System.out.println("No items found in this category.");
        }
    }

    //method to show all the available items with quantity more than 0
    public void displayAvailableItems(){
        System.out.println("\nAvailable items (quantity > 0):");
        boolean foundAny = false;

        for(Map.Entry<String, GroceryItem> entry : groceryList.entrySet()){
            GroceryItem item = entry.getValue();
            if (item.getQuantity() > 0){
                System.out.println(entry.getKey()+ ": " + item.getQuantity() + " pcs");
                foundAny = true;
            }
        }
        if (!foundAny){
            System.out.println("No items with positive quantity.");
        }
    }

    //method to check if an item is found on the list
    public void checkItem(String item){
        System.out.println("\nChecking for \""+ item + "\" on the list...");
        if(groceryList.containsKey(item)){
            System.out.println("Item \""+ item +"\" found on the grocery list.\n");
        }else{
            System.out.println("Item \"" + item + "\" not found.\n");
        }
    }

    //method to calculate total cost of items in the list
    public double calculateTotalCost(){
        double totalValue = 0;
        for (GroceryItem item : groceryList.values()){
            totalValue += item.getTotalCost();
        }
        System.out.println("Total cost of groceries on the list is "+totalValue + "\n");
        return totalValue;
    }

    //method to update quantity of item in the list
    public void updateQuantity(String item, int newQuantity){
        if (groceryList.containsKey(item)){
            GroceryItem groceryItem = groceryList.get(item);
            groceryItem.setQuantity(newQuantity);
            System.out.println("Updated quantity of \"" + item + "\" to " + newQuantity);
        }else{
            System.out.println("Item \"" + item + "\" not found on the list.");
        }
    }

    //stores all the info about the item in the list
    static class GroceryItem {
        private double price;
        private int quantity;
        private String category;

        //setters...
        public GroceryItem(double price, int quantity, String category) {
            this.price = price;
            this.quantity = quantity;
            this.category = category;
        }

        public void setQuantity(int quantity){
            this.quantity = quantity;
        }

        //getters...
        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getCategory() {
            return category;
        }

        public double getTotalCost() {
            return price * quantity;
        }

        //to clean up printing
        @Override
        public String toString() {
            return category + " - " + quantity + " pcs @ " + price + "€ each";
        }
    }
}


