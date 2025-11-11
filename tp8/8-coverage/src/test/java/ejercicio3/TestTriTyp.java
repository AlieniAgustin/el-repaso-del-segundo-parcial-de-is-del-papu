package ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTriTyp{

  @Test 
  public void test1(){
    TriTyp t = new TriTyp();
    assertEquals(4,TriTyp.triang(0,2,3));
    assertEquals(4,TriTyp.triang(1,0,3));
    assertEquals(4,TriTyp.triang(2,2,0));
    assertEquals(3,TriTyp.triang(2,2,2));
  }

  @Test 
  public void test2(){
    assertEquals(4,TriTyp.triang(1,2,3));
    assertEquals(1,TriTyp.triang(2,6,7));
    assertEquals(4,TriTyp.triang(3,1,2));
    assertEquals(4,TriTyp.triang(1,3,2));
  }

  @Test 
  public void test3(){
    assertEquals(2,TriTyp.triang(2,2,1));
    assertEquals(4,TriTyp.triang(1,1,3));
    assertEquals(2,TriTyp.triang(2,1,2));
    assertEquals(4,TriTyp.triang(2,5,2));
    assertEquals(2,TriTyp.triang(1,2,2));
    assertEquals(4,TriTyp.triang(5,2,2));
  }

}
