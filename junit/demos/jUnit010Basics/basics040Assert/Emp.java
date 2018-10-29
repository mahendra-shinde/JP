package com.jUnit010Basics.basics040Assert;

public class Emp {
	private int empId;
	private String empNm;
	private float empSal;
	private boolean isPermanant;
	
	public Emp(int empId, String empNm, float empSal, boolean isPermanant) {
		super();
		this.empId = empId;
		this.empNm = empNm;
		this.empSal = empSal;
		this.isPermanant = isPermanant;
	}
	
	public Emp() {
		super();
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}
	
	public boolean isPermanant() {
		return isPermanant;
	}

	public void setPermanant(boolean isPermanant) {
		this.isPermanant = isPermanant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empNm=" + empNm + ", empSal=" + empSal + ", isPermanant=" + isPermanant + "]";
	}
}
