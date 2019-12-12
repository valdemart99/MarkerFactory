package com.swiftacad.production.current;

import com.swiftacad.production.*;

public class Marker extends WritingProducts {
	private double fillerWidth;
	private double weight;
	private boolean permanent;
	
	public Marker(WritingColor writingColor, String brand, boolean writing,
			double fillerWidth, double weight, boolean permanent) {
		super(writingColor, brand, writing);
		this.fillerWidth = fillerWidth;
	}
	
	
}
