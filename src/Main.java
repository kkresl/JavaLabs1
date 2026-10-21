public class Main {
    public static void main(String[] args) {
        Product phone = new Product("iphone", "electronics", 50000.0, 1);
        Product headphones = new Product("headphones", "electronics", 299.9, 3);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(phone);
        cart.addProduct(headphones);

        System.out.println("Your order:");
        for (Product item : cart.getItems()) {
            System.out.println("- " + item.getName() + " / " + item.getCategory() + " / " +
                    item.getPrice() + " dollars / " + item.getQuantity() + " quantity");
        }

        double total = cart.getTotalPrice();
        System.out.println("Total order amount: " + total + " dollars");
    }
}