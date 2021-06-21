package com.spike.BattleShipsLib;

import java.io.Serializable;

public abstract class FireResponse implements Serializable {

	private static final long serialVersionUID = 4468911425379270649L;
	
	private boolean hit = false;
	
	public FireResponse() {}
	
	public FireResponse(boolean h) {
		hit = h;
	}
	
	public void setHit(boolean h) {
		hit = h;
	}
	
	public boolean isHit() {
		return hit;
	}
}
