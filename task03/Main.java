package htp.home.task03.main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		GroupLogic grLogic = new GroupLogic();
		
		Group gr = new Group(10);
		
		gr.add(new Student("Ivanov A.A.", 253, new int[] {8, 8, 10, 9, 7}));
		gr.add(new Student("Petrov I.V.", 365, new int[] {9, 9, 10, 9, 9}));
		gr.add(new Student("Sidorova E.D.", 365, new int[] {7, 8, 10, 8, 7}));
		gr.add(new Student("Krasnov K.P.", 253, new int[] {10, 9, 10, 9, 9}));
		gr.add(new Student("Bobrov R.K.", 365, new int[] {8, 6, 5, 9, 7}));
		gr.add(new Student("Karasikov E.A.", 253, new int[] {10, 9, 9, 9, 10}));
		gr.add(new Student("Poliakova K.B.", 365, new int[] {8, 6, 7, 9, 8}));
		gr.add(new Student("Popov A.M.", 253, new int[] {6, 8, 5, 7, 4}));
		gr.add(new Student("Borsukov B.O.", 365, new int[] {10, 10, 9, 9, 10}));
		gr.add(new Student("Belkina O.N.", 253, new int[] {8, 6, 7, 9, 8}));
		
		
		List<Student> aLevelStudents;	
		aLevelStudents = grLogic.takeALevelStudents(gr);
		
		printALevelStudents(aLevelStudents);
		
	}	
	
	public static void printALevelStudents(List<Student>aLevelStudents) {
		for(Student st : aLevelStudents) {
			System.out.println(st.getName() + " " + st.getGroup());
		}
		
	}

}
