package com.shaunak;

import java.io.*;
import java.util.*;

public class EmployeeDAOImpl implements EmployeeDAO {
	public LinkedList<Employee> employeeList = new LinkedList<>();

	@Override
	public void add(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public Employee findById(int employeeId) {
		for (Employee b : employeeList) {
			if (b.getEmployeeId() == employeeId) {
				return b;
			}
		}
		return null;
	}

	@Override
	public List<Employee> findByEmployeeFname(String employee) {
		List<Employee> temp = new ArrayList<>();
		for (Employee b : employeeList) {
			if (b.getFirstName().toLowerCase().contains(employee.toLowerCase())) {
				temp.add(b);
			}
		}
		return temp;
	}

	public void readFile() {
		try {
			File file = new File("C:\\web");
			File newFile = new File(file, "EmpData.txt");
			if (newFile.exists()) {
				//System.out.println("File Already Exists");
				FileInputStream reader = new FileInputStream("C:\\web\\EmpData.txt");
				ObjectInputStream oin = new ObjectInputStream(reader);
				String line;
				Object obj = oin.readObject();
				if (obj instanceof LinkedList)
					employeeList = (LinkedList<Employee>) obj;

			}
		} catch (IOException | ClassNotFoundException ex) {
			System.out.println("Unable to Create!!");
		}
	}
	public void writeFile() {
		try {
			File file = new File("C:\\web");
			File newFile = new File(file, "EmpData.txt");


				FileOutputStream writer = new FileOutputStream("C:\\web\\EmpData.txt");
				ObjectOutputStream out = new ObjectOutputStream(writer);
				String line;
				out.writeObject(employeeList);
			System.out.println("Records Saved to the File\n");


		} catch (IOException ex) {
			System.out.println("Unable to Create!!");
		}
	}
}