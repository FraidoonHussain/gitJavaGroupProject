public class marks {

    public static void main(String[] args) {
        Marks[] tasks={ new studentA(70,76,78),
                new studentB(70,76,78,89)};
        for (Marks task:tasks){
            System.out.println("average % "+ task.getPercentage());
        }}}
abstract class Marks {
    abstract double getPercentage();
}
class studentA extends Marks{
    double subject1;
    double subject2;
    double subject3;
    studentA(double subject1,double subject2, double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3;
    }}
class studentB extends Marks{
    double subject1;
    double subject2;
    double subject3;
    double subject4;
    studentB(double subject1,double subject2, double subject3,double subject4){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4;
    }
}



































}
