package mutation.ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestSum{

  @Test 
  public void test1(){
    int[] x = {1,2};
    int expectedSum = 3;
    int currentSum = Sum.sum(x);
    assertEquals(expectedSum,currentSum);
  }

  @Test 
  public void test2(){
    int[] x = {0,0,0,0};
    int expectedSum = 0;
    int currentSum = Sum.sum(x);
    assertEquals(expectedSum,currentSum);
  }

  @Test 
  public void test3(){
    int[] x = {1,-1,2,3,-3,-2};
    int expectedSum = 0;
    int currentSum = Sum.sum(x);
    assertEquals(expectedSum,currentSum);
  }

}
