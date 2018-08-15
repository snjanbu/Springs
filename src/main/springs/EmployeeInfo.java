package main.springs;

import java.util.HashMap;

public class EmployeeInfo {
	
	private HashMap<Integer,String> employeeMap;

	public HashMap<Integer, String> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(HashMap<Integer, String> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void show() {
		System.out.println(this.employeeMap);
	}
}
