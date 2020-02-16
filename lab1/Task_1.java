//Sam Ballard

package lab1;
import java.util.Scanner;
public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EnTeR yOuR nAmE: ");
		String thisIs = sc.nextLine();
		System.out.println("EnTeR yOuR aGe: ");
		int dumb = sc.nextInt();
		System.out.println();
		System.out.println("Name: " + thisIs);
		System.out.println("Age: " + dumb);
		sc.close();
	}

}
