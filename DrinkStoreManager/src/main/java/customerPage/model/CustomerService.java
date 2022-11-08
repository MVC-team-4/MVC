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
}
