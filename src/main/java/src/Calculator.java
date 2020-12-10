package src;

import java.util.ArrayList; 

/*
 * Our main class is Calculator
 */
public class Calculator {
	
	/*
	 * It only has one method, because it's all we need to get a list of square roots. The method needs two int,
	 * the first and the second range, in order to send back an arrayList of Double. 
	 */
		public ArrayList<Double> CalculateSquareRoots(int firstRange, int secondRange) throws Exception {
			ArrayList<Double> squareRootsArrayList = new ArrayList<Double>();
			
			if(firstRange < secondRange) {
				/*
				 * If firstRange is lower than secondRange, the calculate can be executed.
				 */
				for(int i=firstRange; i <= (secondRange - firstRange)+1; i++) {
					Double valueToAdd = Math.floor((Math.sqrt(Double.valueOf(i))) * 100) / 100;
					squareRootsArrayList.add(valueToAdd);
				}
			} else {
				/*
				 * It throws an exception with a message if firstRange is higher than secondRange.
				 */
				throw new Exception("First parameter must be lower than second parameter !");
			}
			
			return squareRootsArrayList;
		}
}