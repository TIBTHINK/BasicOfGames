package com.tibthink.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	public void KeyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player) {
				//key event for player1 mother fucker
				  
			}
		}
	}
	
	public void KeyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
	}
}
