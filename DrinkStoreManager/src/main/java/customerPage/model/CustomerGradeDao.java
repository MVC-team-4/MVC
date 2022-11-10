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
				grade.setVvip(rs.getString(2));
				grade.setVip(rs.getString(3));
				grade.setGold(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grade;
	}
	
	//등급 기준 수정
	public void updateGrade(CustomerGrade grade) {
		dbCon();
		String sql = "UPDATE grade_info SET vvip=?, vip=?, gold=? WHERE no=1";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, grade.getVvip());
			pst.setString(2, grade.getVip());
			pst.setString(3, grade.getGold());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
