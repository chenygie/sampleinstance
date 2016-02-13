package sampleinstance;
import java.io.*;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用构造器创建两个对象
		Employee empOne = new Employee("James Smith");
		Employee empTwe = new Employee("Bill Gates");
		
		empOne.setEmployeeAge(20);
		empOne.setEmployeeDesignation("Software Engineer");
		empOne.setEmployeeSalary(8000.0);
		empOne.printEmployee();
		
		empTwe.setEmployeeAge(21);
		empTwe.setEmployeeDesignation("worker");
		empTwe.setEmployeeSalary(5000.0);
		empTwe.printEmployee();
	}

}
