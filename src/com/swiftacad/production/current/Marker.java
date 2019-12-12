package com.swiftacad.production.current;

import com.swiftacad.production.*;

public class Marker extends WritingProducts {
	private double fillerWidth;
	private double weight;
	private boolean permanent;
	
	public Marker(WritingColor writingColor, String brand, boolean writing,
			double fillerWidth, double weight, boolean permanent) throws Exception {
		super(writingColor, brand, writing);
		this.fillerWidth = fillerWidth;
		if (weight > 0 && weight <= 500) {
			this.weight = weight;
		} else {
			throw new Exception("Incorrect weight input!");
		}
		this.permanent = permanent;
	}

	public double getFillerWidth() {
		return fillerWidth;
	}

	public void setFillerWidth(double fillerWidth) {
		this.fillerWidth = fillerWidth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) throws Exception {
		if (weight > 0 && weight <= 500) {
			this.weight = weight;
		} else {
			throw new Exception("Incorrect weight input!");
		}
	}

	public boolean isPermanent() {
		return permanent;
	}

	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
}
