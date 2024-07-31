package stockEvent;

public class StockTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockMarket sm=new StockMarket();
		MobileApp ma=new MobileApp("Tom");
		WebApp wa=new WebApp("Ram");
		sm.register(ma);
		sm.register(wa);
		sm.setStockPrice(100);
		sm.deRegister(ma);
		sm.setStockPrice(200);
	}

}
