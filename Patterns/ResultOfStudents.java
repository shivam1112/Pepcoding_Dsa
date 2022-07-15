package patterns;
import java.util.Scanner;

public class ResultOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks Of Student =");
		int marks =sc.nextInt();
		sc.close();
		if (marks>90) {
			System.out.println("Excellent");
		}
		else if (marks>80 && marks<=90) {
			System.out.println("Good");
		}
		else if (marks>70 && marks<=80) {
			System.out.println("Fair");
		}
		else if (marks>60 && marks<=70) {
			System.out.println("Meets Reputation");
		}
		else {
			System.out.println("Below Par");
		}
		

	}

}
