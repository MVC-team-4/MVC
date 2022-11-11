package customerPage.model;

import java.util.ArrayList;

public class CustomerService {

	CustomerDao dao;
	CustomerGradeDao dao2;
	
	public CustomerService (CustomerDao dao) {
		this.dao = dao;
		dao2 = new CustomerGradeDao();
	}
		
	public ArrayList<Customer> selectAll(){
		ArrayList<Customer> list = dao.customers();
		return list;
	}
	
	//등급 포함 조회
	public ArrayList<Customer> selectGradeAll(){
		ArrayList<Customer> list = dao.selectGradeALL(dao2.selectGrade());
		return list;
	}
	
	//등급 수정
	public void updateGrade(CustomerGrade grade) {
		dao2.updateGrade(grade);
	}
}
