
public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rangeLimit = { 30, 40, 50, 60, 70, 80, 90, 100 };
		String[] grade = { "F", "D", "C", "B", "A", "S", "SS", "SSS" };
		int maxGradeLevel = grade.length-1;

		int studenScore = 90;

		int gradeLevel = 0;
		String studentGrade = "SSS";

		while ((studentGrade.equals("SSS")) && (gradeLevel < maxGradeLevel)) {

			if (studenScore > rangeLimit[maxGradeLevel] || studenScore < 0) {
				studentGrade = "측정불가 	";
				break;

			}
			if (studenScore < rangeLimit[gradeLevel + 1]) {
				studentGrade = grade[gradeLevel];
			}
			gradeLevel = gradeLevel + 1;
		}
		System.out.println(studentGrade);
	}

}
