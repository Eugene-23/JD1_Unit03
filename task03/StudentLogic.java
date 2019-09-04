package htp.home.task03.main;

public class StudentLogic {
	
	public boolean isALevelStudents(Student st) {
		
		int[] marks = st.getMarks();

		for (int mark : marks) {
			if (mark < 9) {
				return false;
			} 
		}
		return true;
	}

}
