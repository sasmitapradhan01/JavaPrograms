import java.util.Scanner;
class UserInputSum{
	public static void main(String[] args){
		double number,sum=0.0;
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Enter a number: ");
			number = input.nextDouble();
			if(number < 0.0){
				break;
			}
			sum +=number;
		}
		System.out.println("Sum = "+sum);
	}
}
