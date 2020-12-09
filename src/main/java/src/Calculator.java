package src;

import java.util.ArrayList; 

public class Calculator {
		public ArrayList<Double> CalculateSquareRoots(int firstRange, int secondRange) throws Exception {
			ArrayList<Double> squareRootsArrayList = new ArrayList<Double>();
			
			if(firstRange < secondRange) {
				for(int i=firstRange; i <= (secondRange - firstRange)+1; i++) {
					Double valueToAdd = Math.floor((Math.sqrt(Double.valueOf(i))) * 100) / 100;
					squareRootsArrayList.add(valueToAdd);
				}
			} else {
				throw new Exception("First parameter must be lower than second parameter !");
			}
			
			return squareRootsArrayList;
		}
}
