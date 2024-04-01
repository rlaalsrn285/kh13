package com.kh.spring10.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.kh.spring10.dao.CertDao;

//주기적으로 사용자와 무관하게 실행되는 서비스
//서버에 매우 부담을 주는 위험한 기능이어서 기본적으로 금지되어 있음
//main 메소드가 존재하는 파일 위에 @EnableScheduling 을 추가하여 허용 처리
@Service
public class ScheduleService {
	
	@Autowired
	private CertDao certDao;

	//메소드가 자동 실행되도록 @Scheduled와 옵션을 추가
	//@Scheduled(fixedRate = 1000L)
	//@Scheduled(cron = "* * * * * *")//*초 *분 *시 *일 *월 *요일 (연도)
	//@Scheduled(cron = "*/2 * * * * *")//2초마다 *분 *시 *일 *월 *요일
	//@Scheduled(cron = "0 */2 * * * *")//2분마다 0초에 실행
	//@Scheduled(cron = "0-10 */2 * * * *")//2분마다 0초~10초에 실행
	//@Scheduled(cron = "0,10 */2 * * * *")//2분마다 0초와 10초에 실행
	
	//(Q) 출근시간(9시)에 한번, 퇴근시간(18시)에 한번 실행
	//@Scheduled(cron = "0 0 9,18 * * *")
	
	//(Q) 업무시간(9 to 18) 동안 정각마다 실행
	//@Scheduled(cron = "0 0 9-18 * * *")
	
	//(Q) 영업일(월-금) 근무시간 정각마다 실행
	//@Scheduled(cron = "0 0 9-18 * * 1-5")//월(1), 금(5), 토(6), 일(7)	
	//@Scheduled(cron = "0 0 9-18 * * mon-fri")
	
	//(Q) 급여일(매월 25일) 오후 3시에 실행
	//@Scheduled(cron = "0 0 15 25 * ?")//물음표는 무관(any)이라는 뜻
	
	//(Q) 매월 넷째주 수요일 오후 5시에 실행
	//@Scheduled(cron = "0 0 17 ? * 3#4")//넷째주(#4) 수요일(3)
	//@Scheduled(cron = "0 0 17 ? * wed#4")//넷째주(#4) 수요일(wed)
	
	//(Q) 매월 마지막 수요일 오후 5시에 실행
	//@Scheduled(cron = "0 0 17 ? * 3L")//마지막(L) 수요일(3)
	//@Scheduled(cron = "0 0 17 ? * wedL")//마지막(L) 수요일(wed)
	
	@Scheduled(cron = "0 0 * * * *")
	public void clearCert() {
		System.out.println(LocalDateTime.now());
		certDao.deleteLegacy();
	}
	
}



