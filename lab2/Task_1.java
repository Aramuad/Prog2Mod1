//Sam Ballard

package lab2;
import java.util.Scanner;
public class Task_1 {
	
	Task_1() {
	}
	
	public int longestPositiveSeries(int[][] arr) {
		int counter = 0;
		int[] counterHolder = new int[13];
		for(int i = 0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				if (arr[i][j] >= 0) {
					counter++;
				} else {
					counterHolder[counter] = counter;
					counter = 0;
				}
			}
		}
		for(int i = 0; i < counterHolder.length; i++) {
			if (counterHolder[0] < counterHolder[i]) {
				counterHolder[0] = counterHolder[i];
			}
		}
		counter = counterHolder[0];
		return counter;
	}
	
	public static void main(String[] args) {
		Task_1 t1 = new Task_1();
		Scanner sc = new Scanner(System.in);
		int[][] data = new int[5][5];
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.println("Enter values for the array: ");
				data[i][j] = sc.nextInt();
			}
		}
		int seriesLength = t1.longestPositiveSeries(data);
		System.out.println("Longest Positive Series: " + seriesLength);
		System.out.println("Values in data: ");
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + ", ");
			}
		}
	}

}
