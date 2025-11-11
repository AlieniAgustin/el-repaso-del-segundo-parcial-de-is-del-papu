package mutation.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestFindVal{

  @Test 
  public void test1(){
    int[] numbers = {1,2,3};
    int val = 4;
    int expectedIndex = -1;
    int currentIndex = FindVal.findVal(numbers,val);
    assertEquals(expectedIndex,currentIndex);
  }

  @Test 
  public void test2(){
    int[] numbers = {};
    int val = 1;
    int expectedIndex = -1;
    int currentIndex = FindVal.findVal(numbers,val);
    assertEquals(expectedIndex,currentIndex);
  }

  @Test 
  public void test3(){
    int[] numbers = {1,2,3};
    int val = 2;
    int expectedIndex = 1;
    int currentIndex = FindVal.findVal(numbers,val);
    assertEquals(expectedIndex,currentIndex);
  }

  @Test 
  public void test4(){
    int[] numbers = {1,2,3};
    int val = 1;
    int expectedIndex = 0;
    int currentIndex = FindVal.findVal(numbers,val);
    assertEquals(expectedIndex,currentIndex);
  }


}
