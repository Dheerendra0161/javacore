package practiceCoreJAVA;

public class School {
	
	    public void admitStudent(String name, int age) {
	        // Create and return a Student object
	        //return new Student(name, age);
	    }
	  

	
	    public static void main(String[] args) {
	        School school = new School();
	        //Student newStudent = school.admitStudent("Alice", 18);
	        //newStudent.study();
	        String s=new Student().study();
	        System.out.println(s);
	    }
	}


