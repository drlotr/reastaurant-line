
public class Order {
	private String name;
	private String option;
	
	public Order(String name, String optionNumber) {
		this.name = name;
		this.option = optionNumber;
	}
	//1 = fries
	//2 = pizza
	//3 = burger
	//4 = everything
	public String getName() {
		return this.name;
	}
	public String getOption() {
		return this.option;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public int getPrepTime() { // in minutes. returns 1 = 1 minute = 1 iteration of loop.
		if(option.equals("fries")) {
			return 3; // 3 minutes
		} else if(option.equals("pizza")) {
			return 5; // 5 minutes
		} else if(option.equals("burger")) {
			return 10; //10 minutes
		} else {
			return 15; // option 4, 15 minutes;
		}
	}

}
