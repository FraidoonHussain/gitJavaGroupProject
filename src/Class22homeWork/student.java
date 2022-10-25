package Class22homeWork;

public class student {
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public void study (){
    System.out.println("Good students are always studying");
   }
}
class SyntaxStudent extends student {

    @Override
    public void study (){
        System.out.println("I am a SyntaxStudent learning to code");
    }
    public static void studyJava (){
        System.out.println("I'm learning java at SyntaxStudent");
    }
}
class CollegeStudent extends student {
    @Override
    public void study (){
        System.out.println("CollegeStudents must study hard");
    }
public static void studyEnglish (){
    System.out.println("CollegeStudent studying English");
    }
}
class SchoolStudent extends student {
    @Override
    public void study (){
        System.out.println("SchoolStudent should study hard");
    }
public static void studyBiology (){
    System.out.println("SchoolStudent should study Biology");
}
}