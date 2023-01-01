// Jalena Austin

// I assert that I have written 100% of this code myself otherwise
// I will receive a 0% grade on this assignment.
//
// Status:
//
// This code is 100% tested and correct

import java.util.*;
public class triangle {
	public static void main(String[] args) {
		
		int finalSide;
		int area;
		boolean anotherInput = true;
	
		while (anotherInput) {
			Scanner userInput = new Scanner(System.in);
			String firstVar = userInput.next();
			if (firstVar.equals("-1")) {
				break;
			}
			int firstInt = userInput.nextInt();
			String secondVar = userInput.next();
			int secondInt = userInput.nextInt();
			
			if ((firstVar.compareTo("AB") == 0 || secondVar.compareTo("AB") == 0) && 
				(firstVar.compareTo("BC") == 0 || secondVar.compareTo("BC") == 0)) {
					finalSide = (int) Math.sqrt(Math.pow(firstInt, 2) + Math.pow(secondInt, 2)); 
					area = (int) (0.5 * firstInt * secondInt);
					System.out.println("AC: " + finalSide + ", AREA: " + area);
				}
					
			else if ((firstVar.compareTo("AB") == 0 || secondVar.compareTo("AB") == 0) && 
				(firstVar.compareTo("AC") == 0 || secondVar.compareTo("AC") == 0)) {
					finalSide = (int) (Math.pow(firstInt, 2) - Math.pow(secondInt, 2));
					if (finalSide < 0) {
						finalSide = finalSide * -1;
					}
					finalSide = (int)Math.sqrt(finalSide);
						if (firstVar.compareTo("AB") == 0) {
							area = (int) (0.5 * firstInt * finalSide);
						}
						else {
							area = (int) (0.5 * secondInt * finalSide);
						}
					System.out.println("BC: " + finalSide + ", AREA: " + area);
				}
					
			else if ((firstVar.compareTo("BC") == 0 || secondVar.compareTo("BC") == 0) && 
				(firstVar.compareTo("AC") == 0 || secondVar.compareTo("AC") == 0)){
					finalSide = (int) (Math.pow(firstInt, 2) - Math.pow(secondInt, 2));
					if (finalSide < 0) {
						finalSide = finalSide * -1;
					}
					finalSide = (int)Math.sqrt(finalSide);
						if (firstVar.compareTo("BC") == 0) {
							area = (int) (0.5 * firstInt * finalSide);
						}
						else {
							area = (int) (0.5 * secondInt * finalSide);
						}
					System.out.println("AB: " + finalSide + ", AREA: " + area);
				}
			}
		}
	}
