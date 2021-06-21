package com.spike.BattleShipsLib;

public class LoseResponse extends WaitingResponse {

	private static final long serialVersionUID = 1L;
	
	public LoseResponse() {
		
	}
	
	public LoseResponse(boolean hit, int[] pos) {
		super(hit, pos);
	}

}
