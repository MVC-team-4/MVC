package mainPage.model;

public class NewSale {
	
	String sale_code;
	String kind;
	String goods_name;
	String the_number;
	
	public NewSale() {
		// TODO Auto-generated constructor stub
	}

	public NewSale(String sale_code, String kind, String goods_name, String the_number) {
		super();
		this.sale_code = sale_code;
		this.kind = kind;
		this.goods_name = goods_name;
		this.the_number = the_number;
	}

	public String getSale_code() {
		return sale_code;
	}

	public void setSale_code(String sale_code) {
		this.sale_code = sale_code;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getThe_number() {
		return the_number;
	}

	public void setThe_number(String the_number) {
		this.the_number = the_number;
	}

	@Override
	public String toString() {
		return "Sale [sale_code=" + sale_code + ", kind=" + kind + ", goods_name=" + goods_name + ", the_number="
				+ the_number + "]";
	}
	
	
	
	
	
	
}