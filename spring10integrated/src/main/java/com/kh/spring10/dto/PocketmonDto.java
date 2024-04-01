package com.kh.spring10.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter @Getter @NoArgsConstructor @ToString
@Data
public class PocketmonDto {
	
	private int pocketmonNo;
	private String pocketmonName;
	private String pocketmonType;
	
}
