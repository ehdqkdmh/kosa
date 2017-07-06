package kr.or.kosa.emp.dao;

import kr.or.kosa.emp.Employee;

public class EmpRepositoryImpl implements EmpRepository {

	@Override
	public Employee select(int empid) {
		// TODO Auto-generated method stub
		Employee emp= new Employee();
		emp.setFirstName("홍");
		emp.setEmployeeId(empid);
		emp.setPhoneNumber("010-2555-5574");
		emp.setLastName("길동");
		emp.setEmail("email@email.com");
		return emp;
	}

}
