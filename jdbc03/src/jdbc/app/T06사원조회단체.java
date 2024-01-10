package jdbc.app;

import java.util.List;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class T06사원조회단체 {

	public static void main(String[] args) {

		EmpDao daoo = new EmpDao();
		List<EmpDto> llist = daoo.selectListt();
		
		
		for(EmpDto aaa : llist) {
		System.out.println(aaa.getEmpName()+"/////");
		System.out.println(aaa.getEmpDept()+"/////");
		
		}
	}

}
