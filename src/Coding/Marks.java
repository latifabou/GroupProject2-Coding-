package Coding;

abstract public class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
     Create class 'Marks' with an abstract method 'getPercentage' that will be returning
      the average percentage of marks. Provide implementation of abstract method in classes 'A' and 'B'.
      The constructor of student A takes the marks in three subjects as its parameters and the marks
      in four subjects as its parameters for student B. Test your code
     */
    double mathMark;
    double spanishMark;
    double scienceMark;

    public Marks(double mathMark, double spanishMark, double scienceMark) {
        this.mathMark = mathMark;
        this.spanishMark = spanishMark;
        this.scienceMark = scienceMark;
    }

    abstract double getPercentage(int numOfObjects);
}
class A extends Marks{
    public A(double mathMark, double spanishMark, double scienceMark) {
        super(mathMark, spanishMark, scienceMark);
    }

    @Override
   public double getPercentage(int numOfObjects) {
        double sum=mathMark+spanishMark+scienceMark;
       double avgP=(sum/300)*100;
        return avgP;

    }

}
class B extends Marks{
       double geoMark;

    public B(double mathMark, double spanishMark, double scienceMark, double geoMark) {
        super(mathMark, spanishMark, scienceMark);
        this.geoMark = geoMark;
    }

    double getPercentage(int numOfObjects) {
        double sum = mathMark+spanishMark+scienceMark+geoMark;
        double avgP = sum/numOfObjects;
        return avgP;
    }

}
class StudentTester{
    public static void main(String[] args) {
        Marks stA=new A(77,80,85);
        double p1=stA.getPercentage(3);
        System.out.println(p1+"%");
        Marks stB=new B(90,78,82,86);
        double p2=stB.getPercentage(4);
        System.out.println(p2+"%");


    }

}
