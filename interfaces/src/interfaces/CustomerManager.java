package interfaces;

public class CustomerManager {
	
	String ms = " Müşterisi eklendi";
	String md = " Müşterisi silindi";

	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + ms);
		
		Utils.runLoggers(loggers, customer.getFirstName());
		}
	
	
	public void delete(Customer customer) {
		System.out.println( customer.getFirstName() + md);
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
}
