import java.util.ArrayList;

public class MyMvcDemo {

	public static void main(String[] args) {
		
		Professor professor = new Professor("Garrett", "Chang", "garett.chang@shu.edu", 9724304);
		
		Course course = new Course("Software Engineering II", "CSAS3112A", 3, professor);
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		courses.add(course);
		
		Student student = new Student("Garrett", "Denton", "dentonga@shu.edu", 11221172, courses);
		
		StudentView studentView = new StudentView();
		StudentController sController = new StudentController(student, studentView);
		
		CourseView courseView = new CourseView();
		CourseController cController = new CourseController(course, courseView);
		
		ProfessorView professorView = new ProfessorView();
		ProfessorController pController = new ProfessorController(professor, professorView);
		
		sController.printStudentDetails();
		
		cController.printCourseDetails();
		
		pController.printProfessorDetails();
		
	}
	
}
