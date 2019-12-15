package Java_test;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("World");
    hello("user");
    hello("Daniil");
    System.out.println("Hello World!");


    Square s = new Square(7);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(8, 9);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}

