package com.spike.BattleShipsLib;

import junit.framework.TestCase;

public class ShipTest extends TestCase {
	
	private int[][] s = {{1, 2}, {1, 3}, {1, 4}};
	private Ship ship = new Ship(s);
	
	public void testPrintShip() {
		assertEquals("1,2 1,3 1,4", ship.toString());
	}
	
	public void testIsHit() {
		assertEquals(true, ship.isHit(1, 3));
		assertEquals(false, ship.isHit(1, 1));
	}
	
	public void testIsKilled() {
		assertEquals(false, ship.isKilled());
		ship.isHit(1, 3);
		ship.isHit(1, 2);
		ship.isHit(1, 4);
		assertEquals(true, ship.isKilled());
	}
}
