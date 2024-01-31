package InternPack;

public class Student {

	public static void main(String[] args) {
		Teacher teach = new Teacher();
		teach.teaching();
		MathsTeacher mathsTeacher = new MathsTeacher();
		mathsTeacher.teaching();
		Teacher teaching = new MathsTeacher();
		 teaching.teaching();
	}

}
