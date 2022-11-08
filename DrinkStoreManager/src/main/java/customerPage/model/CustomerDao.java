package customerPage.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import customerPage.model.Customer;
import customerPage.model.CustomerDao;

public class CustomerDao {
	
	//
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
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
	
	/*
	
	// 잘되는 지 테스트
	public static void main(String[] args) {
			
			CustomerDao dao = new CustomerDao();
			
			// Customer 기능 테스트
			ArrayList<Customer> list = dao.customers();
			
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
		
		}
		*/
	
}
