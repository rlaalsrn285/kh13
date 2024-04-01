package com.kh.spring10.restcontroller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring10.dao.BoardLikeDao;
import com.kh.spring10.vo.LikeVO;

import jakarta.servlet.http.HttpSession;

//@CrossOrigin
@RestController
@RequestMapping("/rest/board_like")
public class BoardLikeRestController {
	@Autowired
	private BoardLikeDao boardLikeDao;
	
//	회원의 글에 대한 좋아요 상태를 조회
//	@RequestMapping("/check")
//	public Map<String, Object> check (
//			HttpSession session, @RequestParam int boardNo) {
//		String loginId = (String)session.getAttribute("loginId");
//		
//		Map<String, Object> data = new HashMap<>();
//		data.put("state", boardLikeDao.check(loginId, boardNo));
//		data.put("count", boardLikeDao.count(boardNo));
//		
//		return data;
//	}
	
	@RequestMapping("/check")
	public LikeVO check (
			HttpSession session, @RequestParam int boardNo) {
		String loginId = (String)session.getAttribute("loginId");
		
		LikeVO likeVO = new LikeVO();
		likeVO.setState(boardLikeDao.check(loginId, boardNo));
		likeVO.setCount(boardLikeDao.count(boardNo));
		
		return likeVO;
	}
	
//	하트를 클릭한 경우 실행할 매핑
//	@RequestMapping("/toggle")
//	public Map<String, Object> toggle(
//			HttpSession session, @RequestParam int boardNo) {
//		String loginId = (String)session.getAttribute("loginId");
//		
//		Map<String, Object> data = new HashMap<>();
//		
//		if(boardLikeDao.check(loginId, boardNo)) {//좋아요 누른적 있으면
//			boardLikeDao.delete(loginId, boardNo);//좋아요 취소
//			data.put("state", false);
//		}
//		else {
//			boardLikeDao.insert(loginId, boardNo);//좋아요 설정
//			data.put("state", true);
//		}
//		
//		//바뀐 좋아요 개수 확인
//		int count = boardLikeDao.count(boardNo);
//		data.put("count", count);
//		
//		return data;
//	}
	
	@RequestMapping("/toggle")
	public LikeVO toggle(
			HttpSession session, @RequestParam int boardNo) {
		String loginId = (String)session.getAttribute("loginId");
		
		LikeVO likeVO = new LikeVO();
		if(boardLikeDao.check(loginId, boardNo)) {//좋아요 누른적 있으면
			boardLikeDao.delete(loginId, boardNo);//좋아요 취소
			likeVO.setState(false);
		}
		else {
			boardLikeDao.insert(loginId, boardNo);//좋아요 설정
			likeVO.setState(true);
		}
		//바뀐 좋아요 개수 확인
		likeVO.setCount(boardLikeDao.count(boardNo));
		
		return likeVO;
	}
}



