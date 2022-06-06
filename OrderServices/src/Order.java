import java.util.Date;
import java.util.List;

public class Order {
	private String totalAmount;
	private Date orderDate;
	private orderlineStatus orderStatus;
	private Address address;
	private List<Address>addresses;
	private List<Orderline>orderLines;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public orderlineStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(orderlineStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public List<Orderline> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<Orderline> orderLines) {
		this.orderLines = orderLines;
	}
	
	

}
