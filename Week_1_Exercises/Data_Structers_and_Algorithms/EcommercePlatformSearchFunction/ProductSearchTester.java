package productsearch;

public class ProductSearchTester {
	public static void main(String[] args) {
		 Product[] products = {
		            new Product("P001", "Apple iPhone 13", "Smartphones"),
		            new Product("P002", "Samsung Galaxy S21", "Smartphones"),
		            new Product("P003", "Sony WH-1000XM4 Headphones", "Accessories"),
		            new Product("P004", "Dell XPS 13", "Laptops"),
		            new Product("P005", "Apple Watch Series 6", "Wearables"),
		            new Product("P006", "Amazon Echo Dot", "Smart Home"),
		            new Product("P007", "Google Nest Hub", "Smart Home"),
		            new Product("P008", "Microsoft Surface Pro 7", "Tablets")
		        };

		        Product[] sortedProducts = {
		            new Product("P005", "Apple Watch Series 6", "Wearables"),
		            new Product("P001", "Apple iPhone 13", "Smartphones"),
		            new Product("P004", "Dell XPS 13", "Laptops"),
		            new Product("P007", "Google Nest Hub", "Smart Home"),
		            new Product("P002", "Samsung Galaxy S21", "Smartphones"),
		            new Product("P006", "Amazon Echo Dot", "Smart Home"),
		            new Product("P003", "Sony WH-1000XM4 Headphones", "Accessories"),
		            new Product("P008", "Microsoft Surface Pro 7", "Tablets")
		        };

		      
		        Product result = ProductSearch.linearSearch(products, "Dell XPS 13");
		        System.out.println(result != null ? "Found: " + result : "Product not found");

		        
		        result = ProductSearch.binarySearch(sortedProducts, "Dell XPS 13");
		        System.out.println(result != null ? "Found: " + result : "Product not found");
	}
}	
