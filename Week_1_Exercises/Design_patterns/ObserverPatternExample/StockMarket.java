package stockEvent;
import java.util.*;

public class StockMarket implements Stock{
	private List<Observer> observers;
	private double stockPrice;
	public double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
		notifyClients();
	}
	public StockMarket() {
		super();
		observers=new ArrayList<>();
		
	}
	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}
	@Override
	public void deRegister(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}
	@Override
	public void notifyClients() {
		// TODO Auto-generated method stub
		for (Observer ob:observers) {
			ob.update(stockPrice);
		}
	}
	
	
}
