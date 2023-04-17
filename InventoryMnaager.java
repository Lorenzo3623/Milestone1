
public class InventoryMnaager {

	    public static void main(String[] args) {
	        
	        // Create products
	        SalableProduct product1 = new SalableProduct("Product1", "Item 1", 10.99, 5);
	        SalableProduct product2 = new SalableProduct("Product2", "Item 2", 15.99, 10);
	        SalableProduct product3 = new SalableProduct("Product3", "Item 3", 5.99, 3);
	        
	        // Create a store front
	        StoreFront storeFront = new StoreFront();
	        
	        // Add products to the store front
	        storeFront.addProduct(product1);
	        storeFront.addProduct(product2);
	        storeFront.addProduct(product3);
	        
	        // Print out the initial list of products
	        System.out.println("Initial Products:");
	        storeFront.printProducts();
	        
	        // Purchase a product
	        System.out.println("\nPurchase Product");
	        storeFront.purchaseProduct(product1);
	        
	        // Print out the updated list of products and total cost
	        System.out.println("\nUpdated Products ");
	        storeFront.printProducts();
	        System.out.println("Total Amount $" + storeFront.getPurchaseAmount());
	        
	        // Cancel the purchase of a product
	        System.out.println("Cancel Purchase of Product1 ");
	        storeFront.cancelPurchase(product1);
	        
	        // Print out the updated list of products 
	        System.out.println("\n Updated Products ");
	        storeFront.printProducts();
	        System.out.println("Total Purchase Amount: $" + storeFront.getPurchaseAmount());
	        
	        // Remove a product from the store
	        System.out.println("\nRemove Product2...");
	        storeFront.removeProduct(product2);
	        
	        // Print out the updated list 
	        System.out.println("\nUpdated Products:");
	        storeFront.printProducts();
	    }
}