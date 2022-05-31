import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char operator;
		Double x,y,result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose operator: +, -, *, or ?");
		operator = sc.next().charAt(0);
		System.out.print("Input first num = ");
		x = sc.nextDouble();
		System.out.print("Input second num = ");
		y = sc.nextDouble();
		
		switch (operator) {
		case '+': 
			result = x + y;
			System.out.println(x + " " + operator + " " + y + " = " + result);
			break;
		case '-': 
			result = x - y;
			System.out.println(x + " " + operator + " " + y + " = " + result);
			break;
		case '*': 
			result = x * y;
			System.out.println(x + " " + operator + " " + y + " = " + result);
			break;
		case '/': 
			result = x / y;
			System.out.println(x + " " + operator + " " + y + " = " + result);
			break;
		
		
		default:
			System.out.println("Invalid!");
			break;
			
		}
		
	}

}
