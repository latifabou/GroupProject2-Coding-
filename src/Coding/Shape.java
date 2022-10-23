package Coding;

public interface Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
     */
    void calculeArea();
    void calculePerimiter();
}
class Circle implements Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
    public void calculeArea(){
        double areaCircle = Math.PI * r*r;
        System.out.println(areaCircle);
    }
    @Override
    public void calculePerimiter() {
        double periCircle=Math.PI*2*r;
        System.out.println(periCircle);
    }
   }
class Square implements Shape{
    double side;
    Square(double side){
        this.side=side;
    }
    public void calculeArea(){
double areaSquare=side*side;
        System.out.println(areaSquare);
    }
   public void calculePerimiter(){
double priSquare=4*side;
       System.out.println(priSquare);
    }
}
class tester{
    public static void main(String[] args) {
        Circle circle=new Circle(10);
         circle.calculeArea();
        circle.calculePerimiter();
        Square square=new Square(10);
       square.calculeArea();
       square.calculePerimiter();
    }
}