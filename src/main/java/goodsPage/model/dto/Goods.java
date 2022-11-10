package goodsPage.model.dto;

public class Goods {
	
	String goods_code;
	String goods_name;
	String kind;
	String goods_price;
	String goods_stock;
	
	public Goods() {
	}

	public Goods(String goods_code, String goods_name, String kind, String goods_price, String goods_stock) {
		this.goods_code = goods_code;
		this.goods_name = goods_name;
		this.kind = kind;
		this.goods_price = goods_price;
		this.goods_stock = goods_stock;
	}

	public String getGoods_code() {
		return goods_code;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public String getKind() {
		return kind;
	}

	public String getGoods_price() {
		return goods_price;
	}

	public String getGoods_stock() {
		return goods_stock;
	}

	public void setGoods_code(String goods_code) {
		this.goods_code = goods_code;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}

	public void setGoods_stock(String goods_stock) {
		this.goods_stock = goods_stock;
	}

	@Override
	public String toString() {
		return "Goods [goods_code=" + goods_code + ", goods_name=" + goods_name + ", kind=" + kind + ", goods_price="
				+ goods_price + ", goods_stock=" + goods_stock + "]";
	}
	

}
