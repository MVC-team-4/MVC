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
	public ArrayList<Customer> selectGradeAll(){
		CustomerGradeDao dao2 = new CustomerGradeDao();		
		ArrayList<Customer> list = dao.selectGrade(dao2.selectGrade());
		return list;
	}
}
