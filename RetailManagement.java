import java.util.Scanner;
public class RetailManagement {
    public static void main(String[] args) {
        RetailStore store = new RetailStore();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nRetail Store Management");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    store.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeName = scanner.nextLine();
                    store.removeProduct(removeName);
                    break;
                case 3:
                    System.out.print("Enter product name to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    store.updateProduct(updateName, newPrice, newQuantity);
                    break;
                case 4:
                    store.displayProducts();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

/*Retail Store Management
1. Add Product
2. Remove Product
3. Update Product
4. Display Products
5. Exit
Choose an option: 1
Enter product name: apple
Enter product price: 200
Enter product quantity: 5

Retail Store Management
1. Add Product
2. Remove Product
3. Update Product
4. Display Products
5. Exit
Choose an option: 4
Product: apple, Price:$200.0, Quantity: 5

Retail Store Management
1. Add Product
2. Remove Product
3. Update Product
4. Display Products
5. Exit
Choose an option: 1
Enter product name: orange
Enter product price: 45
Enter product quantity: 7

Retail Store Management
1. Add Product
2. Remove Product
3. Update Product
4. Display Products
5. Exit
Choose an option: 4
Product: apple, Price:$200.0, Quantity: 5
Product: orange, Price:$45.0, Quantity: 7 */