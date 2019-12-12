package com.swiftacad.production;

public abstract class WritingProducts {
	private WritingColor writingColor;
	private String brand;
	private boolean writing;
	
	public WritingProducts(WritingColor writingColor, String brand, boolean writing) {
		this.writingColor = writingColor;
		this.brand = brand;
		this.writing = writing;
	}

	public WritingColor getWritingColor() {
		return writingColor;
	}

	public void setWritingColor(WritingColor writingColor) {
		this.writingColor = writingColor;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isWriting() {
		return writing;
	}

	public void setWriting(boolean writing) {
		this.writing = writing;
	}
}
