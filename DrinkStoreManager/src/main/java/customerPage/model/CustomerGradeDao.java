package customerPage.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerGradeDao {
	
	//
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	//String password="oracle";
	String password="1234";
	Connection con = null;

	//
	public void dbCon() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//등급 테이블 조회
	public CustomerGrade selectGrade() {
		CustomerGrade grade = new CustomerGrade();
		dbCon();
		String sql = "SELECT * FROM grade_info";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				grade.setVvip(rs.getString(1));
				grade.setVip(rs.getString(2));
				grade.setGold(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grade;
	}

}
