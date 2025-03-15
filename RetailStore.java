
import java.util.ArrayList;
class RetailStore {
    private ArrayList<Product> products;
    
    public RetailStore() {
        products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void removeProduct(String name) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
    }
    
    public void updateProduct(String name, double price, int quantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                product.setPrice(price);
                product.setQuantity(quantity);
                break;
            }
        }
    }
    
    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }
}
