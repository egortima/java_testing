package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }
  @Test
  public void testArea2(){
    Rectangle r = new Rectangle (2, 10);
    Assert.assertEquals(r.area(),25.0);
  }

}
