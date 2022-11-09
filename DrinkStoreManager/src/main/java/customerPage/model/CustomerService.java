package customerPage.model;

import java.util.ArrayList;

public class CustomerService {

	CustomerDao dao;
	
	public CustomerService (CustomerDao dao) {
		this.dao = dao;
	}
	
	public ArrayList<Customer> selectAll(){
		ArrayList<Customer> list = dao.customers();
		return list;
	}
	
	//등급 포함 조회
	public ArrayList<Customer> selectGradeAll(String[] grades){
		//grades[0]:VVIP기준, grades[1]:VIP기준, grades[2]:GOLD기준		
		ArrayList<Customer> list = dao.selectGrade(grades);
		return list;
	}
}
