package com.kh.lucky.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class SearchVO {
	private int routeStart;
	private int routeEnd;
	private Date routeStartTime;
	private Date routeEndTime;
	private String gradeType;
	private int seatNo;

}
