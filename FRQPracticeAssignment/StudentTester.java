package FRQPracticeAssignment;

public class StudentTester {
    public static void main(String[] args) {
        Student one = new Student("Jordan", 9);
        Student two = new Student("Taylor", 10);
        Student three = new Student("Morgan", 11);
 
        one.printInfo();
        two.printInfo();
        three.printInfo();
    }
}

class Student {
	private String studentName;
	private int grade;

    public Student(String n, int g){
	    studentName = n;
		grade = g;
	}

    public void printInfo() {
      	System.out.println(studentName + " — Grade " + grade);
   	}
}