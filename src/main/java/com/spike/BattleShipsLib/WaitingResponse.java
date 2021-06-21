package com.spike.BattleShipsLib;

public class WaitingResponse extends FireResponse {

	private static final long serialVersionUID = 1L;
	
	private int position[] = new int[2];
	
	public WaitingResponse() {
		position[0] = -1;
		position[1] = -1;
	}
	
	public WaitingResponse(boolean h, int[] p) {
		super(h);
		position = p;
	}
	
	public void setPosition(int[] p) {
		position = p;
	}
	
	public int[] getPosition() {
		return position;
	}

}
