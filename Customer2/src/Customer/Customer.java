package Customer;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	private void initCustomer() {	//Customer 초기 설정
	this.customerGrade = "SILVER";
	bonusRatio = 0.01;
		
	}
	
	//보너스 포인트 계산 & 가격 리턴
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio);	//보너스 비율 계산 후 보너스 포인트 적립
		return price;	//일반고객은 지불 금액 그대로를 리턴
	}
	
	//고객정보 보여주기
	public String showCustomerInfo() {
		return customerID + "님의 둥급: " + customerGrade + ", " + "보너스 포인트: " + bonusPoint + "점";
	}

	
	//getter, setter 메소드
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}
