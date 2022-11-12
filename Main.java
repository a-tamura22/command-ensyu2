import java.util.Scanner;
public class  Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 2; i++){
			System.out.println(i+"l–Ú");
				System.out.print("g’·(cm)= ");
				double height = sc.nextDouble() / 100;
				
				System.out.print("‘Ìd(kg)= ");
				double weight = sc.nextDouble();

				double bmi = weight / height / height;
				double b = ((double)Math.round(bmi * 100))/100;
				
				System.out.println(b);
		}
	}
}
