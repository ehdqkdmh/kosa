package kr.or.kosa.emp;

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String jobId;
	java.sql.Date Date;
	double salary;
	double commissionPct;
	int manageId;
	int departmentId;
	
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}
	public void setManageId(int manageId) {
		this.manageId = manageId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getJobId() {
		return jobId;
	}
	public double getSalary() {
		return salary;
	}
	public double getCommissionPct() {
		return commissionPct;
	}
	public int getManageId() {
		return manageId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", jobId=" + jobId + ", salary=" + salary
				+ ", commissionPct=" + commissionPct + ", manageId=" + manageId + ", departmentId=" + departmentId
				+ "]";
	}
	
	
	
}
