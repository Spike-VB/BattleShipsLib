package com.spike.BattleShipsLib;

public class WinResponse extends HitResponse {

	private static final long serialVersionUID = 1L;
	
	public WinResponse() {
		
	}
	
	public WinResponse(boolean hit, boolean killed) {
		super(hit, killed);
	}
}
