package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class T02사원등록 {

	public static void main(String[] args) {

		EmpDto edt = new EmpDto();
		edt.setEmpNo(666);
		edt.setEmpName("리자몽");
		edt.setEmpDept("용가리부 ");
		edt.setEmpDate("1999-07-07");
		edt.setEmpSal(77500);
		
		EmpDao Edaoo = new EmpDao();
		Edaoo.insertt(edt);
		
		System.out.println("사원등록완료");
	}

}
