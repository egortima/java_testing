package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Egor");


    Square s = new Square(5);
    System.out.println("square area with sides " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4,6);


    System.out.println("rectangle area with sides " + r.a + " and " + r.b + " = " + area(r));

//    int l =8;
//    int s = l * l;
//    System.out.println("square area with sides " + l + " = " + s);
//
//    System.out.println(2+2);
//    System.out.println(2*2);
//    System.out.println(2/2);
//    System.out.println(2-2);
//    System.out.println(1/2);
//    System.out.println(1.0/2);
//    System.out.println("2"+"2");
//    System.out.println("2"+2);
//    System.out.println((2+2)*2);
//    System.out.println("2+2 = " + (2+2));
//    System.out.println("2+2 = " + 2+2);

  }

  public static void hello(String somebody) {
    System.out.println("Hello" + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }
}
