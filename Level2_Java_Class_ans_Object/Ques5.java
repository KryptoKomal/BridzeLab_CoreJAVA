class CartItem {
    String itemName;
    double price;
    int quantity;

   
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

   
    void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

   
    double totalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    java.util.ArrayList<CartItem> items = new java.util.ArrayList<>();

 
    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

   
    void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

  
    void displayTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.totalCost();
        }
        System.out.println("Total cost of cart: $" + total);
    }
}

public class ShoppingCartSimulation {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        CartItem item1 = new CartItem("Laptop", 750, 1);
        CartItem item2 = new CartItem("Mouse", 25, 2);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayTotal();

        cart.removeItem("Mouse");
        cart.displayTotal();
    }
}
