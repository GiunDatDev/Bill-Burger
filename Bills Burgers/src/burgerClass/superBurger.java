package burgerClass;

public class superBurger {
	protected String clientName;
	protected int burgerType;
	protected int totalPrice;
	
	public superBurger() {
		
	}
	
	public superBurger(String clientName, int burgerType, int totalPrice) {
		super();
		this.clientName = clientName;
		this.burgerType = burgerType;
		this.totalPrice = totalPrice;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public void setBurgerType(int burgerType) {
		
	}
	
	public String getBurgerType() {
		return "TYPE OF BURGER HAS NOT BEEN SETUP YET !!!";
	}
	
	public void findTotalprice() {
		
	}
	
	public void showInfo() {
		System.out.println("\n");
		System.out.println("==== Client name: " + clientName + " ====");
		System.out.println(">>> Type of buger: " + getBurgerType());
		System.out.println(">>> Total price: " + totalPrice +" $");
		System.out.println("\n");
	}
}
