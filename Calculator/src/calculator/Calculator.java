package calculator;

public class Calculator {
	private static double operandOne;
	private static double operandTwo;
	private static String operation;
	private static double result;
	
	public static void setOperandOne(double operandOne) {
		Calculator.operandOne = operandOne;
	}
	public static void setOperandTwo(double operandTwo) {
		Calculator.operandTwo = operandTwo;
	}
	public static void setOperation(String operation) {
		Calculator.operation = operation;
	}
	
	public static void performOperation() {
		if(operation == "+") {
			result = operandOne + operandTwo;
		}else if(operation == "-") {
			result = operandOne - operandTwo;
		}else {
			System.out.println("Operation not recognized.");
		}
	}
	public static void getResults() {
		System.out.println("The answer is: " + result);
	}
}
