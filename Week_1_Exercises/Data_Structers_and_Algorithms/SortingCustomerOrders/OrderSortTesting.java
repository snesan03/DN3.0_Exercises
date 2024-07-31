package orderSort;

import java.util.Arrays;

public class OrderSortTesting {
	public static void main(String[] args) {
		Order[] orders = {
	            new Order("O001", "Alice", 250.75),
	            new Order("O002", "Bob", 150.50),
	            new Order("O003", "Charlie", 325.00),
	            new Order("O004", "David", 210.30),
	            new Order("O005", "Eve", 480.40)
	        };
		OrderSorting.quickSort(orders,0,orders.length);
		System.out.println(Arrays.toString(orders));
	}
	
	
}
