package BatchManagement;

public class CourseNotFoundException extends RuntimeException {
	public CourseNotFoundException(String messange) {
		super(messange);
	}
}
