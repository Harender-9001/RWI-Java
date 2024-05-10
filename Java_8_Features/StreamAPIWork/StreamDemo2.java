package Java_8_Features.StreamAPIWork;

import java.util.ArrayList;

import java.util.List;

class Product {
    int pId;
    String pName;
    String pBrand;
    public Product(int pId, String pName, String pBrand) {
        super();
        this.pId = pId;
        this.pName = pName;
        this.pBrand = pBrand;
    }

}
public class StreamDemo2 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Desktop", "Dell"));
        productList.add(new Product(2, "Laptop", "HP"));
        productList.add(new Product(3, "Desktop", "HP"));
        productList.add(new Product(4, "EarPhone", "Apple"));
        productList.add(new Product(5, "Smart Watch", "Apple"));
        productList.add(new Product(6, "EarPhone", "Sony"));
        productList.add(new Product(7, "Laptop", "Apple"));
        productList.add(new Product(8, "Desktop", "Dell"));
        productList.add(new Product(9, "EarPhone", "JBL"));
        productList.add(new Product(5, "Smart Watch", "Samsung"));

        List<String> requiredData = productList.stream()
                .filter(product -> product.pBrand.equals("Apple"))
                .map(product -> product.pName).toList();
        System.out.println("List of product name whose brand is 'Apple' :" + "\n" + requiredData);


    }
}
