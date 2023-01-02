package inheritance1;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		IndividualCustomer ferhat = new IndividualCustomer();
		ferhat.customerNumber="1453";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber="99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers= {engin,ferhat,sendikaCustomer,hepsiBurada};
		IndividualCustomer[] ic = {engin,ferhat};
		
		customerManager.addMultiple(customers);
		
	}

}
