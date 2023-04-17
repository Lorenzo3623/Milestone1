import java.util.ArrayList;
import java.util.List;

//Store Front Class
public class StoreFront {

   //Declare instance variables
   private List<SalableProduct> products;
   private double purchaseAmount;
   
   //Constructor
   public StoreFront(){
       products = new ArrayList<SalableProduct>();
       purchaseAmount = 0.00;
   }

   //Method to add a produduct
   public void addProduct(SalableProduct product){
       products.add(product);
   }
   
   //Method to remove a product
   public void removeProduct(SalableProduct product){
       products.remove(product);
   }
   
   //Method to initialize purchase amount
   public void initState(){
       purchaseAmount = 0.00;
   }
   
   //Method to purchase a SalableProduct
   public void purchaseProduct(SalableProduct product){
       purchaseAmount += product.getPrice();
       product.setQuantity(product.getQuantity() - 1);
   }
   
   //Method to cancel the purchase of a SalableProduct
   public void cancelPurchase(SalableProduct product){
       purchaseAmount -= product.getPrice();
       product.setQuantity(product.getQuantity() + 1);
   }
   
   //Method to get the total purchase amount
   public double getPurchaseAmount(){
       return purchaseAmount;
   }
   
   //Method to print out the list of products
   public void printProducts(){
       for(SalableProduct product : products){
           System.out.println(product.toString());
       }
   }
   
} 