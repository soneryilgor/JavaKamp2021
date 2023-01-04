package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new FileLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1, "Engin", "Demirog");
		
		customerManager.add(engin);
		customerManager.delete(engin);
	}

}
