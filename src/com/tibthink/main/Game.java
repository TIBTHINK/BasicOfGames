package com.tibthink.main;

import java.awt.Canvas;

public class Game extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -8753144288249705774L;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12*9;
	
	private Thread thread;
	private boolean running = false;
	
	
	public Game() {
		new Window(WIDTH, HEIGHT, "LETS FUCK YOUR MOM", this);
	}
	
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		
	}

	public static void main(String args[]) {
		new Game();
	}
}
