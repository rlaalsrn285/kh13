package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T09카드게임2 {

	public static void main(String[] args) {
		Scanner scsc = new Scanner(System.in);
		
		String[] suits = {"\u2660" , "\u2666" , "\u2665" , "\u2663"}; 
		String[] ranks = {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
		List<String> deck = new ArrayList<>();  //덱
		deck.add("!!!!!컬러조커!!!!!");
		deck.add("\\uD83C\\uDCCF");
		
		for(int i=0; i <suits.length; i++) { //덱 문양 * 랭크 이중반복으로 덱생성
			for(int k=0; k<ranks.length; k++) {
				deck.add(suits[i] + ranks[k]);
			}
		}
		Collections.shuffle(deck); 				//덱 셔플
		System.out.println("뽑을장수 입력 1~54장");
		int num = scsc.nextInt();		//뽑을장수
		
		for(int i=0; i < num; i++) {
			System.out.println(deck.get(i));
			//deck.remove (i) 해버리면 덱에서 뽑은걸 배열에서 없애버림 실전에선 이게더가까움
		}
		//System.out.println(deck.size()); 		//덱 테스트용
	}

}
