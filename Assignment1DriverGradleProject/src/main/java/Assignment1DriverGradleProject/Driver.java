package Assignment1DriverGradleProject;


import Assignment1GradleProject.Student;
//import org.gradle.api.logging;
import Assignment1GradleProject.Module;
import Assignment1GradleProject.Lecturer;
import Assignment1GradleProject.CourseProgramme;

import java.util.logging.FileHandler;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.ArrayList;
public class Driver {

	public static void main(String[] args) {
		
		/*Logger logger = LoggerFactory.getLogger("some-logger");
		
		
		logger.info("Starting the driver class");*/
		
		Logger logger = Logger.getLogger("Assignment1DriverGradleProject");  
		try {
			
		FileHandler fh = new FileHandler("/Users/srinivas/Desktop/Uni/Fourth_Year/SoftwareEng3/Assignment1DriverProject/Assignment1DriverGradleProject/gradleOutputLog.txt");
		logger.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  
		
		
		
		//creating students
		Student s1= new Student("Joe", 20, "10/1/2002", 123);
		Student s2= new Student("John", 21, "21/3/2001", 323);
		Student s3= new Student("Jack", 22, "15/8/2000", 517);
		Student s4= new Student("Jake", 23, "30/11/1999", 216);
		
		//creating lecturers
		Lecturer l1= new Lecturer("Martin",50,"23/8/1972",10);
		Lecturer l2= new Lecturer("Marvin",50,"12/9/1972",10);
		Lecturer l3= new Lecturer("Michael",50,"20/5/1972",10);
		Lecturer l4= new Lecturer("Morbius",50,"3/1/1972",10);
		
		//creating modules
		Module m1= new Module(1,"Information Retrieval",l1);
		Module m2= new Module(2,"Music Theory",l2);
		Module m3= new Module(3,"The Art of Pizza Making",l3);
		Module m4= new Module(4,"Fundamentals of Haemotology",l4);
		
		//adding students to a module.
		m4.addRegisteredStudent(s1);
		m4.addRegisteredStudent(s2);
		m4.addRegisteredStudent(s3);
		
	
		m2.addRegisteredStudent(s4);
		m2.addRegisteredStudent(s2);
		
		
		m3.addRegisteredStudent(s1);
		m3.addRegisteredStudent(s3);
		
		/*only use if Students have independent modules that do not belong to a course.
		s1.addModule(m4);
		s2.addModule(m4);
		s3.addModule(m4);
		
		s4.addModule(m2);
		s4.addModule(m2);
		
		s1.addModule(m3);
		s3.addModule(m3);*/
		
		ArrayList<Student> students= new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		/*ArrayList<Module> modules= new ArrayList<Module>();
		modules.add(m1);
		modules.add(m2);
		modules.add(m3);
		modules.add(m4);*/
		
		
		//making new CourseProgrammes.
		CourseProgramme cp1= new CourseProgramme("Bachelors in CS");
		CourseProgramme cp2= new CourseProgramme("Bachelors in Music");
		CourseProgramme cp3= new CourseProgramme("Bachelors in Morbium");
		
		ArrayList<CourseProgramme>courses= new ArrayList<CourseProgramme>();
		courses.add(cp1);
		courses.add(cp2);
		courses.add(cp3);
		
		//adding modules to CourseProgrammes.
		cp1.addModule(m1);
		cp2.addModule(m2);
		
		cp3.addModule(m3);
		cp3.addModule(m4);
		
		cp1.addEnrolledStudent(s1);
		
		
		cp2.addEnrolledStudent(s2);
		
		cp3.addEnrolledStudent(s3);
		cp3.addEnrolledStudent(s4);
		
		//adding CourseProgrammes to students.
		s1.addCourseProgramme(cp1);
		s2.addCourseProgramme(cp2);
		s3.addCourseProgramme(cp3);
		s4.addCourseProgramme(cp3);
		
		System.out.println("List of Courses:");
		
		for(CourseProgramme cp: courses)
		{
			//logger.info(cp.toString());
			System.out.println(cp);
		}
		
		System.err.println("List of Students:");
		
		for(Student s: students)
		{
			
			
			//logger.info(s.toString());
			System.out.println(s);
			
		}
		
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	}

}
