import java.util.ArrayList;
import java.util.List;

class Product{
    public String name;
    public double  price;
    
    public Product(String name,Double price){
        this.name=name;
        this.price=price;
    }
}
class ShoppingCart{
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getProducts(){
        return products;
    }
    public double calculateTotal(){
        double total =0;
        for(Product p : products){
            total += p.price;
        }
        return total;
    }
}
class ShoppingCartPrinter {
    private ShoppingCart cart;
    public ShoppingCartPrinter(ShoppingCart cart){
        this.cart = cart;
    }
    public void printInvoice(){
        System.out.println("Shopping cart invoice!");
        for(Product p : cart.getProducts()){
            System.out.println(p.name+" "+p.price);
        }
        System.out.println("Total rs:- "+ cart.calculateTotal());
    }
}
class shoppingCartStorage {
    private ShoppingCart cart;
    public shoppingCartStorage(ShoppingCart cart){
        this.cart = cart;
    }
    public void saveToDatabase(){
        System.out.println("Saving to DB........");
    }
}
public class SRPfollowed {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("laptop",500000.0));
        cart.addProduct(new Product("monitor", 60000.0));
        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoice();
        shoppingCartStorage db = new shoppingCartStorage(cart);
        db.saveToDatabase();
    }
}
