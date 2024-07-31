package orderSort;

public class OrderSorting {
	public static void bubbleSort(Order[] orders) {
		int n=orders.length;
		boolean sorted=true;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				double p1=orders[j].getTotalPrice();
				double p2=orders[j+1].getTotalPrice();
				if(p1>p2) {
					orders[j].setTotalPrice(p2);
					orders[j+1].setTotalPrice(p1);
					sorted=false;
				}
			}
			if(sorted)
				break;
		}
		
	}
	public static void quickSort(Order[] orders,int low,int high) {
		if(low<high) {
		int pivot=partition(orders,low,high);
		quickSort(orders,low,pivot-1);
		quickSort(orders, pivot+1, high);
		}
		
	}
	private static int partition(Order[] orders, int low, int high) {
		// TODO Auto-generated method stub
		double pivot=orders[high].getTotalPrice();
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			double cPrice=orders[j].getTotalPrice();
			if(cPrice<pivot) {
				i++;
				double iPrice=orders[i].getTotalPrice();
				
				orders[i].setTotalPrice(cPrice);
				orders[j].setTotalPrice(iPrice);
			}
		}
		orders[high].setTotalPrice(orders[i+1].getTotalPrice());
		orders[i+1].setTotalPrice(pivot);
		
		return i+1;
	}
}
