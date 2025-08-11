/*5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.*/
import java.util.ArrayList;
public class Assignment6{
    public static void main(String[] args) {
          Store value=new Store();
          value.setStoreDetails("SIVAM ","SURANDAI");
          value.displayStoreDetails();
          System.out.println("-------------------------------");
         
          Product pvalue1=new Product(1,"shirt",200.00,10);
          Product pvalue2=new Product(2,"car",200.00,10);
          Product pvalue3=new Product(3,"coffee",200.00,10);
          Product pvalue4=new Product(4,"watch",200.00,10);
         
          value.addProduct(pvalue1);
          value.addProduct(pvalue2);
          value.addProduct(pvalue3);
          value.addProduct(pvalue4);
          
          value.displayAllProduct();

    }
}
class Store{
    static String storeName;
    static String storeLocation;
    private ArrayList <Product> set=new ArrayList<>();                      //Get the object.
    static void setStoreDetails(String name,String location){
        storeName=name;
        storeLocation=location;
    }
    static void displayStoreDetails(){
        System.out.println("StoreName:"+storeName+"\n"+"StoreLocation:"+storeLocation);
    }
    void addProduct(Product product){
            set.add(product);
    }
    void displayAllProduct(){
       for(Product x:set){
        x.displayProduct();
        System.out.println("----------------------------");
       }
    }

}
class Product{
    int productID;
    String name;
    double price;
    int quantity;

    Product(int productID,String name,double price,int quantity) {
        this.productID=productID;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    void displayProduct(){
        System.out.println("ProductID:"+productID+"\n"+"Name:"+name+"\n"+"Prince:"+price+"\n"+"Quantity:"+quantity+"\n");
    }

}
/* OUTPUT:
StoreName:SIVAM 
StoreLocation:SURANDAI
-------------------------------
ProductID:1
Name:shirt
Prince:200.0
Quantity:10

----------------------------
ProductID:2
Name:car
Prince:200.0
Quantity:10

----------------------------
ProductID:3
Name:coffee
Prince:200.0
Quantity:10

----------------------------
ProductID:4
Name:watch
Prince:200.0
Quantity:10

----------------------------
*/