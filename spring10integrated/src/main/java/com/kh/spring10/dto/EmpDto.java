package com.kh.spring10.dto;

public class EmpDto {
	
	private int empNo;
	private String empName;
	private String empDept;
	private String empDate;
	private int empSal;
	
	
	@Override
	public String toString() {
		return "EmpDto [empNo=" + empNo + ", empName=" + empName + ", empDept=" + empDept + ", empDate=" + empDate
				+ ", empSal=" + empSal + "]";
	}
	public EmpDto() {
		super();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpDate() {
		return empDate;
	}
	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

}
