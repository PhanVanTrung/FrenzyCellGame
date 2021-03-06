package com.pvt.main;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
	// All the game object declared here in the abstract class: Enemies, Player, Points.
	// position of an object
	protected int x,y;
	// set ID for object
	protected ID id;
	// variable to control speed of object (Velocity)
	protected int velX, velY;
//	private Handler handler;
//	public Handler getHandler() {
//		return handler;
//	}
//
//	public void setHandler(Handler handler) {
//		this.handler = handler;
//	}

	public GameObject(ID id) {
		this.id = id;
	}
	
	public GameObject(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public abstract void tick();

	public abstract void render(Graphics g);
	// Used this to detect collision
	public abstract Rectangle getBounds();
}
