package com.spike.BattleShipsLib;

public class HitResponse extends FireResponse {

	private static final long serialVersionUID = 1L;
	
	private boolean killed = false;
	
	public HitResponse() {}
	
	public HitResponse(boolean h, boolean k) {
		super(h);
		killed = k;
	}
	
	public void setKilled(boolean k) {
		killed = k;
	}
	
	public boolean isKilled() {
		return killed;
	}
}
