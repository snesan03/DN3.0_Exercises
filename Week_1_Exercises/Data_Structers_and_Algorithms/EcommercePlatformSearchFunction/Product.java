package productsearch;

public class Product {
	String productId;
	String productName;
	String category;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category + "]";
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product(String productId, String productName, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		
	}
	
}
