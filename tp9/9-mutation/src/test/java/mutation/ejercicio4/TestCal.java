package mutation.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCal {

  /**
   * mismo mes
   */
  @Test 
  public void test1(){
    Cal cal = new Cal();
    int month1 = 2; int month2 = 2;
    int day1 = 3; int day2 = 10;
    int year = 2025;
    int expectedNumDays = 7;
    int currentNumDays = Cal.cal(month1,day1,month2,day2,year);
    assertEquals(expectedNumDays,currentNumDays);
  }

  /**
   * anio no bisiesto
   */
  @Test 
  public void test2(){
    int month1 = 2; int month2 = 5;
    int day1 = 3; int day2 = 10;
    int year = 2025;
    int expectedNumDays = 96;
    int currentNumDays = Cal.cal(month1,day1,month2,day2,year);
    assertEquals(expectedNumDays,currentNumDays);
  }

  /**
   * anio no bisiesto
   */
  @Test 
  public void test3(){
    int month1 = 2; int month2 = 5;
    int day1 = 3; int day2 = 10;
    int year = 100;
    int expectedNumDays = 96;
    int currentNumDays = Cal.cal(month1,day1,month2,day2,year);
    assertEquals(expectedNumDays,currentNumDays);
  }

  /**
   * anio bisiesto
   */
  @Test 
  public void test4(){
    int month1 = 2; int month2 = 5;
    int day1 = 3; int day2 = 10;
    int year = 400;
    int expectedNumDays = 97;
    int currentNumDays = Cal.cal(month1,day1,month2,day2,year);
    assertEquals(expectedNumDays,currentNumDays);
  }


}
