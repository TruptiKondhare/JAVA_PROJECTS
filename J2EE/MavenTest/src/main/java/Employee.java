public class Employee {
	int empId;
	String name;
	String dept;
	Department1 department;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Department1 getDepartment() {
		return department;
	}
	public void setDepartment(Department1 department) {
		this.department = department;
	}
	public void displayEmployeeData() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Dept: "+dept);
		department.displayDepartment(dept);


	}
	

}
