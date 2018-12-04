package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust_info")
public class Customer {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	private String custName;
	private int custAge;
	private String custAddress;
	private double custBal;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public double getCustBal() {
		return custBal;
	}
	public void setCustBal(double custBal) {
		this.custBal = custBal;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + ", custAddress="
				+ custAddress + ", custBal=" + custBal + "]";
	}
	public Customer(int custId, String custName, int custAge, String custAddress, double custBal) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
		this.custAddress = custAddress;
		this.custBal = custBal;
	}
}