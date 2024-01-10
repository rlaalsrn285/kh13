package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class T03사원수정 {

	public static void main(String[] args) {

		EmpDto dtto = new EmpDto();
		dtto.setEmpNo(888);
		dtto.setEmpName("바꾼메루미");
		dtto.setEmpDept("바꾼메롱부");
		dtto.setEmpDate("1999-02-02");
		dtto.setEmpSal(2000);
		
		EmpDao daoo = new EmpDao();
		
		boolean result = daoo.update(dtto);
		
		if(result) {
			System.out.println("사원 변경완");
		}
		else {
			System.out.println("사원 변경실패");
		}
	}
}
