//Sam Ballard

package assignment_1a_b;
public class Tests {
	
	private String fName, lName;
	private double test1, test2, test3, test4, test5, average;
	private char letterGrade;

	Tests() {
	}
	Tests(String fName, String lName, double test1, double test2, double test3, double test4, double test5, double average, char letterGrade) {
		this.fName = fName;
		this.lName = lName;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
		this.test4 = test4;
		this.test5 = test5;
		this.average = average;
		this.letterGrade = letterGrade;
	}
	
	public String getFullName() {
		return fName + " " + lName;
	}
	public String getAllScores() {
		return test1 + ", " + test2 + ", " + test3 + ", " + test4 + ", " + test5;
	}
	public String getFirst() {
		return fName;
	}
	public String getLast() {
		return lName;
	}
	public double getTest1() {
		return test1;
	}
	public double getTest2() {
		return test2;
	}
	public double getTest3() {
		return test3;
	}
	public double getTest4() {
		return test4;
	}
	public double getTest5() {
		return test5;
	}
	public void setFirst(String first) {
		fName = first;
	}
	public void setLast(String last) {
		lName = last;
	}
	public void setTest1(double score) {
		test1 = score;
	}
	public void setTest2(double score) {
		test2 = score;
	}
	public void setTest3(double score) {
		test3 = score;
	}
	public void setTest4(double score) {
		test4 = score;
	}
	public void setTest5(double score) {
		test5 = score;
	}
	public double calcAvg() {
		average = (test1 + test2 + test3 + test4 + test5) / 5;
		return average;
	}
	public char makeLetterGrade() {
		if (average >= 90) {
			letterGrade = 'A';
		} else if (average >= 80 && average < 90) {
			letterGrade = 'B';
		} else if (average >= 70 && average < 80) {
			letterGrade = 'C';
		} else if (average >= 60 && average < 70) {
			letterGrade = 'D';
		} else {
			letterGrade = 'F';
		}
		return letterGrade;
	}
	public String allData() {
		return fName + "            " + lName + "         " + test1 + "      " + test2 + "      " + test3 + "      " + test4 + "      " + test5 + "      " + average + "           " + letterGrade;
	}
}
