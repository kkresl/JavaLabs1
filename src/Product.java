public class Product {
    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product(String name, String category, double price, int quantity){
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name; }
    //zmienia nazwe produktu po stworzeniu

    public String getCategory() {return category;}
    public void getCategory(String category) {this.category = category; }

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price; }

    public int getQuantity() {return quantity;}
    public void SetQuantity(int quantity) {this.quantity = quantity; }
}
