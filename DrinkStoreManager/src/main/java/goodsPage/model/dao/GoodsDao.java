package goodsPage.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	public void insertGoods(String[] goodsdata) {
		//디비 연결
		dbCon();
		String sql = "INSERT INTO goods_list VALUES(?,?,?,?,9999)";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			for (int i = 0; i < goodsdata.length; i++) {
				pst.setString(i+1, goodsdata[i]);
			}
			pst.executeUpdate();

			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//콘솔 테스트
	public static void main(String[] args) {
		GoodsDao dao = new GoodsDao();
		dao.dbCon();
	}

}
