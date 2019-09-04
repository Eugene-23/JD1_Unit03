package htp.home.task03.main;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

	private StudentLogic stLogic = new StudentLogic();

	public List<Student> takeALevelStudents(Group group) {
		
		List<Student> result = new ArrayList<Student>();
		
		Student[] students = group.getStudents();
		
		for(Student st : students) {
			if (stLogic.isALevelStudents(st)) {
				result.add(st);
			}
		}
		
		return result;
		
	}

}
