package com.spike.BattleShipsLib;

import java.io.Serializable;
import java.util.*;

public class Ship implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<int[]> ship = new ArrayList<int[]>();
	private ArrayList<int[]> life = new ArrayList<int[]>();
	
	public Ship() {
		
	}
	
	public Ship(int[][] s) {
		for(int[] i : s) {
			buildShip(i[0], i[1]);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void buildShip(int i, int j) {
		int[] part = {i, j};
		ship.add(part);
		life = (ArrayList<int[]>) ship.clone();
	}
	
	public ArrayList<int[]> getShip() {
		return ship;
	}
	
	public void printShip() {
		System.out.print(toString());
	}
	
	public String toString() {
		String string = "";
		for(int[] sh : ship) {
			string = string + sh[0] + "," + sh[1] + " ";
		}
		string = string.trim();
		return string;
	}
	
	public boolean isHit(int i, int j) {
		for(int[] l : life) {
			if(l[0] == i && l[1] == j) {
				life.remove(l);
				return true;
			}
		}
		return false;
	}
	
	public boolean isHit(int[] pos) {
		return isHit(pos[0], pos[1]);
	}
	
	public boolean isKilled() {
		if(life.size() == 0) {
			return true;
		}
		return false;
	}
}
