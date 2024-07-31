package stockEvent;

public interface Stock {
	void register(Observer observer);
	void deRegister(Observer observer);
	void notifyClients();
}
