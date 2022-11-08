package goodsPage.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import goodsPage.model.dto.Goods;

public class GoodsDao {
	
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
			//연결 테스트
			if(con != null) System.out.println("\nConnection ok");
			else System.out.println("\nConnection fail");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//
	
	//테이블에 상품 등록
	public void insertGoods(Goods goods) {
		//디비 연결
		dbCon();
		String sql = "INSERT INTO goods_list VALUES(?,?,?,?,9999)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, goods.getGoods_code());
			pst.setString(2, goods.getGoods_name());
			pst.setString(3, goods.getKind());
			pst.setString(4, goods.getGoods_price());
			
			pst.executeUpdate();

			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//
	
	
	//상품 테이블 조회
	public ArrayList<Goods> selectGoods(){
		ArrayList<Goods> list = new ArrayList<>();
		dbCon();
		String sql ="SELECT * FROM goods_list";
		try {
			Statement st  = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while( rs.next()) {

				String goods_code = rs.getString(1);
				String goods_name = rs.getString(2);
				String kind = rs.getString(3);
				//int goods_price = Integer.parseInt(rs.getString(4));
				//int goods_stock = Integer.parseInt(rs.getString(5));
				String goods_price = rs.getString(4);
				String goods_stock = rs.getString(5);

				Goods g = new Goods();
				g.setGoods_code(goods_code);
				g.setGoods_name(goods_name);
				g.setKind(kind);
				g.setGoods_price(goods_price);
				g.setGoods_stock(goods_stock);

				list.add(g);
			}

			rs.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;		
	}//
	
	//물품코드로 하나의 상품정보 조회
	public Goods selectOneGoods(String update_code){
		dbCon();
		Goods g =null;
		String sql ="SELECT * FROM goods_list WHERE goods_code = ?" ;
		try {
			PreparedStatement pst  = con.prepareStatement(sql);
			pst.setString(1, update_code);
			ResultSet rs = pst.executeQuery();

			if(rs.next()) {
				String goods_name = rs.getString(2);
				String kind = rs.getString(3);
				//int goods_price = Integer.parseInt(rs.getString(4));
				//int goods_stock = Integer.parseInt(rs.getString(5));
				String goods_price = rs.getString(4);
				String goods_stock = rs.getString(5);
				g = new Goods();
				g.setGoods_code(update_code);
				g.setGoods_name(goods_name);
				g.setKind(kind);
				g.setGoods_price(goods_price);
				g.setGoods_stock(goods_stock);
			}

			rs.close();
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return g;		
	}//
	
	//상품 데이터 수정
	public void updateGoods(Goods updateGoods){
		dbCon();
		String sql ="UPDATE goods_list SET goods_name = ?, kind = ?, goods_price = ?, goods_stock = ? WHERE goods_code = ?" ;
		try {
			PreparedStatement pst  = con.prepareStatement(sql);
			pst.setString(1, updateGoods.getGoods_name());
			pst.setString(2, updateGoods.getKind());
			pst.setString(3, updateGoods.getGoods_price());
			pst.setString(4, updateGoods.getGoods_stock());
			pst.setString(5, updateGoods.getGoods_code());
			pst.executeUpdate();

			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}//
	
	//상품 데이터 삭제
	public void deleteGoods(String delete_code) {
		dbCon();
		String sql = "DELETE FROM goods_list WHERE goods_code=? ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, delete_code);
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//콘솔 테스트
	public static void main(String[] args) {
		GoodsDao dao = new GoodsDao();
		dao.dbCon();
		System.out.println(dao.selectOneGoods("00000001"));
	}

}
