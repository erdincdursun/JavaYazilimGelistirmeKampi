import java.util.ArrayList;
import java.util.List;

import bussines.CategoryManager;
import bussines.CourseManager;
import bussines.TeacherManager;
import core.loggin.DataBaseLogger;
import core.loggin.FileLogger;
import core.loggin.Logger;
import dataaAcces.HibernateCategoryDao;
import dataaAcces.HibernateCourseDao;
import dataaAcces.HibernateTeacherDao;
import dataaAcces.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new FileLogger()};
		
		Course course1 = new Course(4,"Kotlin","BusraDursun","YazilimKampi1",3000); 
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course1);
		
		System.out.println("-------------------");
		
		Category Category1 = new Category(5,"Bilisim");
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(Category1);
		
		System.out.println("-------------------");
		
		Teacher teacher = new Teacher("Busra","Dursun");
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), loggers);
		teacherManager.add(teacher);
		

		
	}

}
