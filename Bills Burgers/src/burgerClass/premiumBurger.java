package burgerClass;

import burgerConfig.burgerConfig;

public class premiumBurger extends superBurger {
	private int burgerType;
	private int additionalNumber;

	public premiumBurger(String clientName, int burgerType, int totalPrice, int additionalNumber) {
		super(clientName, burgerType, 0);
		this.additionalNumber = additionalNumber;
	}
	
	public String getBurgerType() {
		return "DELUXE BURGER";
	}
	
	public void findTotalprice() {
		totalPrice = burgerConfig.BUGERBASEPRICE + burgerConfig.ADDITIONALVEGETABLEPRICE * additionalNumber + burgerConfig.CHIPANDDRINKPRICE;
	}
}
