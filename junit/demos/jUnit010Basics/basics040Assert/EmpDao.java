package com.jUnit010Basics.basics040Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpDao {
	private List<Emp> empList;
	
	private Emp[] empArray = {
			new Emp(100, "aaaa", 10000.0f, true),
			new Emp(105, "aaaa", 20000.0f, false),
			new Emp(103, "aaaa", 30000.0f, true),
			new Emp(104, "aaaa", 40000.0f, false),
			new Emp(109, "aaaa", 50000.0f, true),
			new Emp(101, "aaaa", 60000.0f, false),
			new Emp(106, "aaaa", 70000.0f, true),
			new Emp(107, "aaaa", 80000.0f, false),
			new Emp(110, "aaaa", 90000.0f, true),
			new Emp(112, "aaaa", 100000.0f, false),
			new Emp(108, "aaaa", 110000.0f, true)
	};
	
	public EmpDao(){
		empList = Arrays.asList(empArray);
	}
	
	public Emp getEmpOnEmpId(int empId){
		for(Emp emp : empList){
			if (emp.getEmpId()==empId){
				return emp;
			}
		}
		return null;
	}
	
	public ArrayList<Emp> getEmpsOnSalRange(float fromSal, float toSal){
		ArrayList<Emp> empRangeList = new ArrayList<Emp>();
		for(Emp emp : empList){
			if ((fromSal<=emp.getEmpSal())&&(emp.getEmpSal()<=toSal)){
				empRangeList.add(emp);
			}
		}
		
		return empRangeList;
	}
	
	public boolean isEmpPermanant(int empId){
		for(Emp emp : empList){
			if (emp.getEmpId()==empId){
				return emp.isPermanant();
			}
		}
		return false;
	}
}
