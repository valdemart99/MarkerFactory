package com.swiftacad;

import java.util.*;

import javax.annotation.Generated;

import com.swiftacad.production.*;
import com.swiftacad.production.current.*;

public class TestingProcedure {
	private Marker[] testBatch;
	
	public TestingProcedure() {
		this.testBatch = new Marker[50];
	}

	public static void main(String[] args) {
		testProduction();
	}
	
	public static void testProduction() {
		TestingProcedure firstTest = new TestingProcedure();

		firstTest.generateBatch(50);
		
		ArrayList<Marker> suitableContainer = new ArrayList<>();
		for (Marker m: firstTest.getTestBatch()) {
			suitableContainer.add(m);
		}
		
		for (int i = 0; i < suitableContainer.size(); ++i) {
			if (i % 2 == 0 && suitableContainer.get(i).getWritingColor() == WritingColor.blue) {
				System.out.println(suitableContainer.get(i).getWritingColor() + " " +
									suitableContainer.get(i).getBrand());
			}
		}
	}
	
	public void generateBatch(int batchCount) {
		Marker[] batch = new Marker[batchCount];
		int index = 0;
		
		while (batch[batch.length - 1] == null) {
			try {
				if (index <= 20) { // just to have some different types
					batch[index] = new Marker(WritingColor.blue, "Bic", true, 5.3, 78.2, true);
				} else if (index <= 40) {
					batch[index] = new Marker(WritingColor.red, "PSG", true, 4.6, 88, false);
				} else {
					batch[index] = new Marker(WritingColor.blue, "Otello", true, 6, 102, true);
				}
				
				index++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.testBatch = batch;
	}

	public Marker[] getTestBatch() {
		return testBatch;
	}

	public void setTestBatch(Marker[] testBatch) {
		this.testBatch = testBatch;
	}
}
