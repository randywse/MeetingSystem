package Business;

import Dao.EmployeeDao;

public class EmployeeBusiness {
	private EmployeeDao employeeDao;
	
	public void authentication(String username, String password) {
		// TODO Auto-generated method stub
		employeeDao = new EmployeeDao();
		employeeDao.authentication(username,password);
	}

}
