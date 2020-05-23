package com.williamdsw.adapter.adapters;

import com.williamdsw.adapter.classes.RoundPeg;
import com.williamdsw.adapter.classes.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

	private SquarePeg peg;
	
	public SquarePegAdapter (SquarePeg peg) {
		this.peg = peg;
	}
	
	@Override
	public double getRadius() {
		double halfWidth = (peg.getWidth () / 2);
		return (Math.sqrt (Math.pow (halfWidth, 2) * 2));
	}
}
