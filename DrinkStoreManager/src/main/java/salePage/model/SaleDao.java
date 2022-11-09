package salePage.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SaleDao {

	//db연결정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	
	Connection con = null;
	
	public void dbCon() {
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			if( con != null) {
				System.out.println("연결성공");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Sale> selectSales(){
		
		ArrayList<Sale> list = new ArrayList<>();
		dbCon();
		String sql = " select s.order_number, o.id, s.sale_code, s.goods_code, s.tne_number, o.order_date "
				+ " from sale_list s "
				+ " join order_list o "
				+ " on s.order_number = o.order_number ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String order_number = rs.getString(1);
				String id = rs.getString(2);
				String sale_code = rs.getString(3);
				String goods_code = rs.getString(4);
				int tne_number = Integer.parseInt(rs.getString(5));
				String order_date = rs.getString(6);
				
				Sale s = new Sale();
				s.setOrder_number(order_number);
				s.setId(id);
				s.setSale_code(sale_code);
				s.setGoods_code(goods_code);
				s.setThe_number(tne_number);
				s.setOrder_date(order_date);
				list.add(s);
			}
			
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	public ArrayList<Sale> selectDateSale(String date){
		
		ArrayList<Sale> list = new ArrayList<>();
		dbCon();
		String sql = " select s.order_number, o.id, s.sale_code, s.goods_code, s.tne_number, o.order_date "
				+ " from sale_list s "
				+ " join order_list o "
				+ " on s.order_number = o.order_number "
				+ " where order_date = ? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, date );
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String order_number = rs.getString(1);
				String id = rs.getString(2);
				String sale_code = rs.getString(3);
				String goods_code = rs.getString(4);
				int tne_number = Integer.parseInt(rs.getString(5));
				String order_date = rs.getString(6);
				
				Sale s = new Sale();
				s.setOrder_number(order_number);
				s.setId(id);
				s.setSale_code(sale_code);
				s.setGoods_code(goods_code);
				s.setThe_number(tne_number);
				s.setOrder_date(order_date);
				list.add(s);
			}
			
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public ArrayList<Sale> selectCodeSale(String code){
		
		ArrayList<Sale> list = new ArrayList<>();
		dbCon();
		String sql = " select s.order_number, o.id, s.sale_code, s.goods_code, s.tne_number, o.order_date "
				+ " from sale_list s "
				+ " join order_list o "
				+ " on s.order_number = o.order_number "
				+ " where goods_code = ? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, code );
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String order_number = rs.getString(1);
				String id = rs.getString(2);
				String sale_code = rs.getString(3);
				String goods_code = rs.getString(4);
				int tne_number = Integer.parseInt(rs.getString(5));
				String order_date = rs.getString(6);
				
				Sale s = new Sale();
				s.setOrder_number(order_number);
				s.setId(id);
				s.setSale_code(sale_code);
				s.setGoods_code(goods_code);
				s.setThe_number(tne_number);
				s.setOrder_date(order_date);
				list.add(s);
			}
			
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
public ArrayList<Sale> selectNameSale(String name){
		
		ArrayList<Sale> list = new ArrayList<>();
		dbCon();
		String sql = " select s.order_number, o.id, s.sale_code, s.goods_code, s.tne_number, o.order_date "
				+ " from sale_list s "
				+ " join order_list o "
				+ " on s.order_number = o.order_number "
				+ " where id = ? ";
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, name );
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String order_number = rs.getString(1);
				String id = rs.getString(2);
				String sale_code = rs.getString(3);
				String goods_code = rs.getString(4);
				int tne_number = Integer.parseInt(rs.getString(5));
				String order_date = rs.getString(6);
				
				Sale s = new Sale();
				s.setOrder_number(order_number);
				s.setId(id);
				s.setSale_code(sale_code);
				s.setGoods_code(goods_code);
				s.setThe_number(tne_number);
				s.setOrder_date(order_date);
				list.add(s);
			}
			
			rs.close();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}


public ArrayList<Sale> selectPriceSale(String day){
	
	ArrayList<Sale> list = new ArrayList<>();
	dbCon();
	
	 
	String sql = " select o.order_date, s.order_number, s.goods_code, s.tne_number, "
			+ " to_char(g.goods_price, '99,999,999'), "
			+ " to_char((s.tne_number * g.goods_price), '99,999,999') as total_price "
			+ " from sale_list s "
			+ " join goods_list g "
			+ " on s.goods_code = g.goods_code "
			+ " join order_list o "
			+ " on s.order_number = o.order_number "
			+ " where order_date = ? "
			+ " order by s.order_number " ;
	
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, day );
		ResultSet rs = pst.executeQuery();
		
		
		while(rs.next()) {
			
			System.out.println("1");
			String order_date = rs.getString(1);
			String order_number = rs.getString(2);
			String goods_code = rs.getString(3);			
			int tne_number = Integer.parseInt(rs.getString(4));
			String price = rs.getString(5);
			String sumprice = rs.getString(6);
			
			Sale s = new Sale();
			s.setOrder_date(order_date);
			s.setOrder_number(order_number);
			s.setGoods_code(goods_code);
			s.setThe_number(tne_number);
			s.setPrice(price);
			s.setSumPrice(sumprice);
			
			list.add(s);
		}
		
		rs.close();
		pst.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return list;
}


public String selectTotalPrice(String day){
	
	dbCon();
	String total_price ="";
	String sql = " select to_char(sum(s.tne_number * g.goods_price), '99,999,999') as total_price "
			+ " from sale_list s "
			+ " join goods_list g "
			+ " on s.goods_code = g.goods_code "
			+ " join order_list o "
			+ " on s.order_number = o.order_number "
			+ " where order_date = ? ";
	
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, day );
		ResultSet rs = pst.executeQuery();
		
		
		if(rs.next()) {
			total_price = rs.getString(1);
			
	
		}
		
		rs.close();
		pst.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return total_price;
}

public String TotalPrice(){
	
	dbCon();
	String total_price ="";
	String sql = " select to_char(sum(s.tne_number * g.goods_price), '999,999,999') as total_price "
			+ " from sale_list s "
			+ " join goods_list g "
			+ " on s.goods_code = g.goods_code "
			+ " join order_list o "
			+ " on s.order_number = o.order_number ";
	
	try {
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		
		if(rs.next()) {
			total_price = rs.getString(1);
			
	
		}
		
		rs.close();
		pst.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return total_price;
}
	
}
