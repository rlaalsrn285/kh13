package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dao.PocketmonDao;
import jdbc.dto.EmpDto;
import jdbc.dto.PocketmonDto;

public class T06사원조회 {

	public static void main(String[] args) {

		int empempNo = 777;
		
		EmpDao daao = new EmpDao();
		EmpDto ddto = daao.select111(empempNo);
		
		System.out.println(ddto.toString());
		
	}

}
