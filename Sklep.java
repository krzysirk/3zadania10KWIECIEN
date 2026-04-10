import java.util.ArrayList;
class Product {
	String name;
	public Product (String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class Sklep {
 public static void main(String[] args) {

 ArrayList<Product> products = new ArrayList<>();

 products.add(new Product("Pomidor"));
 products.add(new Product("Marchewka"));
 products.add(new Product("Kalarepa"));

 System.out.println("Lista produktów: " + products);
 }
}
