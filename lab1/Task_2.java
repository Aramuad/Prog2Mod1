//Sam Ballard

package lab1;
public class Task_2 {

	Task_2() {		
	}
	
	public int findLargest(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[0]) {
				arr[0] = arr[i];
			}
		}
		return arr[0];
	}
	
	public static void main(String[] args) {
		Task_2 t2 = new Task_2();
		int[] nums = new int[] {1, 4, 13, 43, -25, 17, 22, -37, 29};
		int[] data = new int[20];
		for(int i = 0; i < data.length; i++) {
			int coinFlip = (int)Math.round(Math.random());
			if (coinFlip == 0) {
				data[i] = (int)Math.floor(Math.random() * -100);
			} else {
				data[i] = (int)Math.floor(Math.random() * 100) + 1;
			}
		}
		int largestNums = t2.findLargest(nums);
		int largestData = t2.findLargest(data);
		int sum = largestNums + largestData;
		System.out.println("Largest in nums: " + largestNums);
		System.out.println("Largest in data: " + largestData);
		System.out.println("Sum of largest nums and data: " + sum);
		System.out.println("Contents of data: ");
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");
		}
	}
}
