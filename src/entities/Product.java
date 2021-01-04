package entities;


public class Product {

	private String name;
	protected Double price;
	private Integer quantity;
	private Double total;
	
	public Product() {
		
	}
	
	public Product(String name, Double price, Integer quantity) {
		//super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		total = price * quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return getName()
				+ ","
				+ getPrice()
				+ ","
				+ getQuantity();
	}
	
	public String toString2() {
		return  getName()
				+ ","
				+ getTotal();
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}