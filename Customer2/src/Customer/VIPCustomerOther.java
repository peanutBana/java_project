package Customer;

public class VIPCustomerOther extends Customer{
	private int agentID;		//상담원 아이디
	double saleRatio;
	
	public VIPCustomerOther(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}	
	
	@Override
	public int calcPrice(int price) {
		return price - (int)(price * saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + ", 담당 상담원 아이디: " + agentID;
	}

	public int getAgentID() {
		return agentID;
	}
	
}
