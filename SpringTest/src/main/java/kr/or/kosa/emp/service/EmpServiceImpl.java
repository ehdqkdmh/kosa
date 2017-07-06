package kr.or.kosa.emp.service;

import kr.or.kosa.emp.Employee;
import kr.or.kosa.emp.dao.EmpRepository;

public class EmpServiceImpl implements EmpService {

	
	EmpRepository repository;
	public EmpServiceImpl(EmpRepository repository){
		this.repository=repository;
	}
	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return repository.select(empid);
	}
	

}
