package burgerClass;

import burgerConfig.burgerConfig;

public class healthyBurger extends superBurger{
	public int burgerType;
	public int additionalNumber;

	public healthyBurger(String clientName, int burgerType, int totalPrice, int additionalNumber) {
		super(clientName, burgerType, 0);
		this.additionalNumber = additionalNumber;
	}
	
	public String getBurgerType() {
		return "HEALTHY BURGER";
	}
	
	public void findTotalprice() {
		totalPrice = burgerConfig.HEALTHYBURGERBASEPRICE + burgerConfig.ADDITIONALVEGETABLEPRICE * additionalNumber;
	}
}
