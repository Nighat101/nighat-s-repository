package projects.partone;

public class GradeCalculator {
	public static void main(String[] args) {
		int marks = 70;
		
		if(marks <= 100 && marks >= 90) {
			System.out.println("The student grade is an A.");
		}
		
		else if(marks <= 89 && marks >= 80) {
			System.out.println("The student grade is an B.");
		}
		
		else if(marks <= 79 && marks >= 70) {
			System.out.println("The student grade is an C.");
		}
	}
}
