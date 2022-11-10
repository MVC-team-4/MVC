package customerPage.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import customerPage.model.CustomerDao;

public class CustomerDao {
	
	//
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	//String password="oracle";
	String password="oracle";
	Connection con = null;

	//

	public void customercon() {
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	public ArrayList<Customer> customers(){
			
			//
			ArrayList<Customer> list = new ArrayList<>();
			customercon();
			String sql = " select * from customer_info ";
			try {
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery();
				
				while(rs.next()) {
					String id = rs.getString(1);
					String name = rs.getString(2);
					String address = rs.getString(3);
					String phone_num = rs.getString(4);
					//String grade = rs.getString(5);
					Customer customer = new Customer(id, name, address, phone_num);
					list.add(customer);
				}
				
				rs.close();
				pst.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
	}
	
	public void insert(Customer customer) {
		
		// insert
		customercon();
		String sql = " insert into customer_info values(?,?,?,?) ";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, customer.getId());
			pst.setString(2, customer.getName());
			pst.setString(3, customer.getAddress());
			pst.setString(4, customer.getPhone_num());
			//pst.setString(5, customer.getGrade());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Customer customer(String id) {
		
		customercon();
		String sql = "select * from customer_info where id=?";
		Customer customer = null;
		
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				String tmpId = rs.getString(1);
				String tmpName = rs.getString(2);
				String tmpAddress = rs.getString(3);
				String tmpPhone_num = rs.getString(4);
				//String tmpGrade = rs.getString(5);
				customer = new Customer(tmpId, tmpName, tmpAddress, tmpPhone_num);
				
			}
			
			rs.close();
			pst.close();
			con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customer;
	}
	
	public void update(Customer customer) {
		customercon();
		String sql = "update customer_info set name=?, address=?, phone_num=? where id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, customer.getName());
			pst.setString(2, customer.getAddress());
			pst.setString(3, customer.getPhone_num());
			pst.setString(4, customer.getId());
			pst.executeUpdate();
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//회원 등급 포함 조회
	public ArrayList<Customer> selectGradeALL(CustomerGrade grades) {
		ArrayList<Customer> list = customers();
		customercon();
		String sql = "SELECT o.id, CASE WHEN SUM(g.goods_price * s.tne_number)>= ? THEN 'VVIP' WHEN SUM(g.goods_price * s.tne_number)>= ? THEN 'VIP' WHEN SUM(g.goods_price * s.tne_number)>= ? THEN 'GOLD' ELSE 'SILVER' END AS grade FROM order_list o JOIN sale_list s ON s.order_number=o.order_number JOIN goods_list g ON s.goods_code=g.goods_code JOIN customer_info c ON o.id=c.id GROUP BY o.id";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, grades.getVvip()); //VVIP
			pst.setString(2, grades.getVip()); //VIP
			pst.setString(3, grades.getGold()); //GOLD
			ResultSet rs = pst.executeQuery();
			
			int cnt = 0;
			while(rs.next()) {
				String grade = rs.getString(2);
				list.get(cnt).setGrade(grade);
				cnt++;
			}
			
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	
	
	// 잘되는 지 테스트
	public static void main(String[] args) {

			CustomerDao dao = new CustomerDao();

			// 등급 조회 테스트
			CustomerGradeDao dao2 = new CustomerGradeDao();		
			System.out.println(dao2.selectGrade());
			ArrayList<Customer> list2 = dao.selectGradeALL(dao2.selectGrade());
			for(Customer customer: list2) {
				System.out.println(customer);
			}

			/*
			// Customer 기능 테스트
			//ArrayList<Customer> list = dao.customers();
			for(Customer customer: list) {
				System.out.println(customer);
			}
			// Customer 기능 테스트
			String id="test0444";
			Customer customer = dao.customer(id);
			System.out.println("고객정보 한명: " + customer);


			// Customer 등록 테스트
			String id2 = "test0676";
			String name2 = "5555";
			String address2 = "고백구 행복동";
			String phone_num2 = "010-8282-8282";

			Customer newCustomer = new Customer(id2, name2, address2, phone_num2);
			dao.insert(newCustomer);
			 */

	}

}
