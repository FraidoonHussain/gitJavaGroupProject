package Class22homeWork;

public class studentTester {

    public static void main(String[] args) {
        student [] student= {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for(student stu: student) {
            stu.study();
        }
        SyntaxStudent.studyJava();
        CollegeStudent.studyEnglish();
        SchoolStudent.studyBiology();

    }


}
