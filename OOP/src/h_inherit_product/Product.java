package h_inherit_product;
import java.util.ArrayList;
public class Product {

    String count;
    String description;
    String producer;
    String price;

    Product() {
    }

    Product(String description, String producer, String price) {
        this.description = description;
        this.producer = producer;
        this.price = price;
    }

    public void showInfo() {
    }
    
}