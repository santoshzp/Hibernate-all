package com.santosh;

public class Product {
	private int id;
	private String ProductName;
	private double price;
	
	public Product() {
		super();
	}

	public Product(int id, String productName, double price) {
		super();
		this.id = id;
		ProductName = productName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ProductName == null) ? 0 : ProductName.hashCode());
		result = prime * result + id;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (ProductName == null) {
			if (other.ProductName != null)
				return false;
		} else if (!ProductName.equals(other.ProductName))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", ProductName=" + ProductName + ", price=" + price + "]";
	}
	
	
	
	
		

}
