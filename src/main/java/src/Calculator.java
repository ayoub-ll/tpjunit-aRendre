package src;

import java.util.ArrayList; 

public class Calculator {
		public ArrayList<Double> CalculateSquareRoots(int firstRange, int secondRange) throws Exception {
			ArrayList<Double> squareRootsArrayList = new ArrayList<Double>();
			if(firstRange < secondRange) {
				for(int i =0; i < secondRange - firstRange; i++) {
					squareRootsArrayList.add(Math.sqrt(firstRange) + i);
				}
			} else {
				throw new Exception("First parameter must be lower than second parameter !");
			}
			return squareRootsArrayList;
		}
}
