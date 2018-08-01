package burgerClass;

import burgerConfig.burgerConfig;

public class classicalBurger extends superBurger{
	private int burgerType;
	private int additionalNumber;
	
	public classicalBurger(String clientName, int burgerType, int totalPrice, int additionalNumber) {
		super(clientName, burgerType, 0);
		this.additionalNumber = additionalNumber;
	}
	
	public void setBurgerType(int burgerTyper) {
		this.burgerType = burgerTyper;
	}
	
	public String getBurgerType() {
		if (this.burgerType == burgerConfig.BASICBURGER) {
			return "CLASSICAL BURGER";
		}
		else if (this.burgerType == burgerConfig.COMBOTUNA) {
			return "COMBO TUNA";
		}
		else if (this.burgerType == burgerConfig.COMBOMEATBALL) {
			return "COMBO MEATBALL";
		}
		else {
			return "TYPE OF BURGER WAS NOT FOUND !!!";
		}
	}
	
	public void findTotalprice() {
		if (this.burgerType == burgerConfig.BASICBURGER) {
			totalPrice = burgerConfig.BUGERBASEPRICE + burgerConfig.ADDITIONALVEGETABLEPRICE * additionalNumber;
		}
		else if (this.burgerType == burgerConfig.COMBOTUNA) {
			totalPrice = burgerConfig.COMBOTUNAPRICE;
		}
		else if (this.burgerType == burgerConfig.COMBOMEATBALL) {
			totalPrice = burgerConfig.COMBOMEATBALLPRICE;
		}
		else {
			totalPrice = -1;
		}
	}
}
