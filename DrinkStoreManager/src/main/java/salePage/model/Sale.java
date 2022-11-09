package salePage.model;

public class Sale {
	
	String order_number;
	String id;
	String sale_code;
	String goods_code;
	int the_number;
	String order_date;
	String price;
	String sumprice;
	
	
	//생성자
	public Sale() {}
	public Sale(String order_number, String id, String sale_code, String goods_code, int the_number,
			String order_date, String price, String sumprice) {
		super();
		this.order_number = order_number;
		this.id = id;
		this.sale_code = sale_code;
		this.goods_code = goods_code;
		this.the_number = the_number;
		this.order_date = order_date;
		this.price = price;
		this.sumprice = sumprice;
	}
	
	//getter, setter
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSale_code() {
		return sale_code;
	}
	public void setSale_code(String sale_code) {
		this.sale_code = sale_code;
	}
	public String getGoods_code() {
		return goods_code;
	}
	public void setGoods_code(String goods_code) {
		this.goods_code = goods_code;
	}
	public int getThe_number() {
		return the_number;
	}
	public void setThe_number(int the_number) {
		this.the_number = the_number;
	}
	public String getOrder_date() {
		return order_date;
	}
	public String getSubOrder_date() {
		String date = getOrder_date();
		String a = date.substring(0, 10);
		return a;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSumPrice() {
		return sumprice;
	}
	public void setSumPrice(String sumprice) {
		this.sumprice = sumprice;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Sale [order_number=" + order_number + ", id=" + id + ", sale_code=" + sale_code + ", goods_code="
				+ goods_code + ", the_number=" + the_number + ", order_date=" + order_date + "]";
	}
	
	
	
	
	
}

