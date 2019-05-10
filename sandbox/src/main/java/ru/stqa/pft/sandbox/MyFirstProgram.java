package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args)
  {
    hello("world");
    hello("user");
    hello("Egor");

    double l = 5;
    System.out.println("square area with sides " + l + " = " + area(l));


    double a = 4;
    double b = 10;

    System.out.println("rectangle area with sides " + a + " and " + b + " = " + area(a,b));

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

  public static void hello( String somebody)
  {
    System.out.println("Hello" + somebody + "!");
  }

  public static double area(double len)
  {
    return len*len;
  }
  public static double area(double a, double b)
  {
    return a*b;
  }
}
