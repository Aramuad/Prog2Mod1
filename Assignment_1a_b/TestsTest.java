//Sam Ballard

package Assignment_1a_b;
import java.util.Scanner;
public class TestsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tests student = new Tests();
		Tests[] classroom = new Tests[10];
		for(int i = 0; i < classroom.length; i++) {
			
			System.out.println("Enter student's first name: ");
			student.setFirst(sc.nextLine());
			System.out.println("Enter the student's last name: ");
			student.setLast(sc.nextLine());
			System.out.println("Test 1 grade: ");
			student.setTest1(sc.nextDouble());
			System.out.println("Test 2 grade: ");
			student.setTest2(sc.nextDouble());
			System.out.println("Test 3 grade: ");
			student.setTest3(sc.nextDouble());
			System.out.println("Test 4 grade: ");
			student.setTest4(sc.nextDouble());
			System.out.println("Test 5 grade: ");
			student.setTest5(sc.nextDouble());
			sc.nextLine();
			classroom[i] = new Tests(student.getFirst(), student.getLast(), student.getTest1(), student.getTest2(), student.getTest3(), student.getTest4(), student.getTest5(), student.calcAvg(), student.makeLetterGrade());
		}
		String[] heading = new String[] {"First Name:", "Last Name:", "Test 1:", "Test 2:", "Test 3:", "Test 4:", "Test 5:", "Average:", "Letter Grade:"};
		for(int i = 0; i < heading.length; i++) {
			System.out.print(heading[i] + "   ");
		}
		System.out.println();
		for(int i = 0; i < classroom.length; i++) {
			System.out.println(classroom[i].allData());
		}
		double classAvg = 0;
		for(int i = 0; i < classroom.length; i++) {
			classAvg = classAvg + classroom[i].calcAvg();
		}
		classAvg = classAvg / 2;
		System.out.println();
		System.out.printf("Class Average = %1.2f", classAvg);
		sc.close();
	}
}
