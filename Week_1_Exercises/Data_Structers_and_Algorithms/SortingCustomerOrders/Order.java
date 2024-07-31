package orderSort;

public class Order {
	String orderId;
	String orderName;
	double totalPrice;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Order(String orderId, String orderName, double totalPrice) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.totalPrice = totalPrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", totalPrice=" + totalPrice + "]";
	}
	
	
}
