import java.util.Scanner;
class Ex{
	public static void main(String[] args){
		double number,sum=0.0;
		Scanner input = new Scanner(System.in);
		for(int i=1;i<6;++i){
			System.out.println("Enter number " +i+" : ");
			number = input.nextDouble();

			if(number<=0.0){
				continue;
				}
			sum += number;
		}
		System.out.println("Sum = "+sum);
		input.close();
	}
}
