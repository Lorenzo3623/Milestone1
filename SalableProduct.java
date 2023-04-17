 
//Class for Salable Product 
public class SalableProduct {

   //Declare instance variables
   private String name;
   private String description;
   private double price;
   private int quantity;
   
   //Constructor
   public SalableProduct(String name, String description, double price, int quantity){
       this.name = name;
       this.description = description;
       this.price = price;
       this.quantity = quantity;
   }
   
   //Getters and Setters
   public String getName(){
       return name;
   }
   
   public void setName(String name){
       this.name = name;
   }
   
   public String getDescription(){
       return description;
   }
   
   public void setDescription(String description){
       this.description = description;
   }
   
   public double getPrice(){
       return price;
   }
   
   public void setPrice(double price){
       this.price = price;
   }
   
   public int getQuantity(){
       return quantity;
   }
   
   public void setQuantity(int quantity){
       this.quantity = quantity;
   }
   
   //Override the toString method to print out the Salable Product 
   public String toString(){
       return "Product Name: " + name + " | Description: " + description + " | Price: " + price + " | Quantity: " + quantity;
   }

}