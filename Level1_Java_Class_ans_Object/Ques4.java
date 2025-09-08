class Item {
    String itemCode;
    String itemName;
    double price;

  
    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }


    double totalCost(int quantity) {
        return price * quantity;
    }
}

public class Inventory {
    public static void main(String[] args) {
        Item item = new Item("I101", "Laptop", 750.00);
        item.displayDetails();
        System.out.println("Total Cost for 3 items: $" + item.totalCost(3));
    }
}
