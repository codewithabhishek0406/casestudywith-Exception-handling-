import java.util.ArrayList;

/*
 * Case Study 2: Shopping Cart
 * ---------------------------------------------
 * An online shopping application maintains products selected by a customer.
 * Operations:
 *   1. Add products.
 *   2. Remove products.
 *   3. Check whether a product is in the cart.
 *   4. Display all products.
 */
public class CaseStudy2_ShoppingCart {

    private ArrayList<String> cart;

    public CaseStudy2_ShoppingCart() {
        cart = new ArrayList<>();
    }

    // 1. Add a product
    public void addProduct(String product) {
        cart.add(product);
        System.out.println(product + " added to the cart.");
    }

    // 2. Remove a product
    public void removeProduct(String product) {
        if (cart.remove(product)) {
            System.out.println(product + " removed from the cart.");
        } else {
            System.out.println(product + " is not in the cart.");
        }
    }

    // 3. Check whether a product is in the cart
    public void checkProduct(String product) {
        if (cart.contains(product)) {
            System.out.println(product + " is available in the cart.");
        } else {
            System.out.println(product + " is NOT available in the cart.");
        }
    }

    // 4. Display all products
    public void displayCart() {
        System.out.println("\n--- Shopping Cart ---");
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }
        System.out.println("Total items in cart: " + cart.size());
    }

    public static void main(String[] args) {
        CaseStudy2_ShoppingCart shoppingCart = new CaseStudy2_ShoppingCart();

        // 1. Add products
        shoppingCart.addProduct("Laptop");
        shoppingCart.addProduct("Mouse");
        shoppingCart.addProduct("Keyboard");
        shoppingCart.addProduct("Headphones");

        // 4. Display cart
        shoppingCart.displayCart();

        // 3. Check product
        shoppingCart.checkProduct("Mouse");
        shoppingCart.checkProduct("Monitor");

        // 2. Remove product
        shoppingCart.removeProduct("Keyboard");
        shoppingCart.displayCart();
    }
}
