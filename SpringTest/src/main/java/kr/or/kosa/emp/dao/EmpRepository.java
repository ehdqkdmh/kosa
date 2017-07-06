package kr.or.kosa.emp.dao;

import kr.or.kosa.emp.Employee;

public interface EmpRepository {
	Employee select(int empid);
}
