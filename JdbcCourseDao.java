package dataaAcces;

import entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanina eklendi." );
	}

}
