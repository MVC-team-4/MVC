package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";
	Connection con = null;

	//DB연결
	private void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Sale> orderlist(){
	      
	      ArrayList<Sale> list = new ArrayList<>();
	      dbCon();
	      String sql = " select goods_code, goods_name, goods_stock, kind"
	            + " from goods_list ";
	         
	      
	      try {
	         PreparedStatement pst = con.prepareStatement(sql);
	         ResultSet rs = pst.executeQuery();
	         
	         while(rs.next()) {
	            String goods_code = rs.getString(1);
	            String goods_name = rs.getString(2);
	            int goods_stock = Integer.parseInt(rs.getString(3));
	            String kind = rs.getString(4);
	            
	            Sale s = new Sale();
	            s.setGoods_code(goods_code);
	            s.setGoods_name(goods_name);
	            s.setThe_number(goods_stock);
	            s.setKind(kind);
	            
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
}
