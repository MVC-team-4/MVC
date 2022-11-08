package mvcprj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	public LoginDAO(){  
		
		
		 try{
			  String url = "jdbc:oracle:thin:@localhost:1521:xe";
		     String dbId = "system";
		     String dbPass = "1234";
			
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 conn = DriverManager.getConnection(url,dbId ,dbPass );
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	}
	
	public int login(String id, String pw) {
		String SQL = "SELECT pw FROM login WHERE ID =?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if(rs.getString(1).contentEquals(pw)) {
					return 1; // 로그인 성공
				}
				else {
					return 0; // 비밀번호 불일치 
				}
			}
			return -1;	// 아이디가 없음
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2; // 데이터베이스 오류
	}
}
