package api.util.collection4;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class T01Queue {

	public static void main(String[] args) {

		Queue<String> que = new LinkedBlockingQueue<>();
		
		que.add("바보");
		que.add("멍청");
		que.add("햄버거");
		
		
		System.out.println(que.peek());
		
		que.poll();
		System.out.println(que.peek());
	}

}
