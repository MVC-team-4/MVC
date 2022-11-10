package mainPage.model;

public class Sale {
	
	String goods_code;
	String goods_name;
	int the_number;
	String order_date;
	String price;
	String kind;
	
	
	//생성자
	public Sale() {
		
	}
	public Sale(String kind, String goods_code, String goods_name,int the_number,
			String order_date, String price) {
		super();
		this.kind = kind;
		this.goods_code = goods_code;
		this.goods_name = goods_name;
		this.the_number = the_number;
		this.order_date = order_date;
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
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
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	@Override
	public String toString() {
		return "Sale [goods_code=" + goods_code + ", the_number=" + the_number + ", order_date=" + order_date
				+ ", price=" + price + "]";
	}
	
	//getter, setter
	
	
	
	
	
}