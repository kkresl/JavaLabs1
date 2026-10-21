import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    //metoda dodawania produkta do koszyka
    // Product - typ danych, ktory otrzymujemy, product - jak bedziemy nazywac konkretny produkt
    public void addProduct(Product product){
        items.add(product);
    }

    //zwraca wszystkie towary w koszyku
    public List<Product> getItems() {
        return items;
    }

    //metoda obliczająca cenę
    public double getTotalPrice() {
        double total = 0;
        for (Product item : items){
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
