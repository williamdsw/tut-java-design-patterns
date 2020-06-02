package com.williamdsw.structural.composite.classes;

import java.awt.Color;
import java.awt.Graphics;

public class Dot extends BaseShape {

	private final int DOT_SIZE = 3;
	
	public Dot (int x, int y, Color color) {
		super (x, y, color);
	}
	
	@Override
	public int getWidth () {
		return DOT_SIZE;
	}
	
	@Override
	public int getHeight () {
		return DOT_SIZE;
	}
	
	@Override
	public void paint (Graphics graphics) {
		super.paint (graphics);
		graphics.fillRect (this.getX () - 1, this.getY () - 1, this.getWidth (), this.getHeight ());
	}
}
