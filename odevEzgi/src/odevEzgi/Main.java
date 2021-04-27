package odevEzgi;


public class Main {

	public static void main(String[] args) 
	{
		Course course1 = new Course(0, null, 0, null); 
	    course1.id =1;
	    course1.name ="Yazýlým Geliþtirici Yetiþtirme Kampý C# + ANGULAR";
	    course1.progress =50;
	    course1.instructor ="Engin DEMÝROÐ";
		

	    Course course2 = new Course(0, null, 0, null);
	    course2.id =2;
	    course2.name ="Yazýlým Geliþtirici Yetiþtirme Kampý JAVA + REACT";
	    course2.progress =27;
	    course2.instructor ="Engin DEMÝROÐ";
	    
	    Course[] courses = {course1,course2};
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		
		for(Course course : courses) {
			System.out.println("%" + course.progress + " tamamladýnýz.");
		}
		
		
		
		
		
		System.out.println(courses.length);
		
		Category category1 = new Category();
		category1.id =1;
		category1.name ="Programlama";
		
		Category category2 = new Category();
		category2.id =2;
		category2.name ="Diðer";
		
		CourseManager courseManager = new CourseManager();
		courseManager.listCourses();
		courseManager.addCourses();
		
		
		
		
		Student student1 = new Student(null, null, null, 0);
		student1.name ="Emine Ezgi KURNAZ";
		student1.email ="eek@gmail.com"; //yalancý mail
		student1.age =19;
		
		Student student2 = new Student(null, null, null, 0);
		student2.name ="Osman YILMAz";
		student2.email ="osm@gmail.com"; //yalancý mail
		student2.age =20;
		
		Student[] students = {student1,student2};
		
		for(Student student : students) {
			System.out.println(student.name);
		}
		
		System.out.println(students.length);
		
		StudentManager studentManager = new StudentManager();
		StudentManager.listStudents();
		////?
		
	}

}
