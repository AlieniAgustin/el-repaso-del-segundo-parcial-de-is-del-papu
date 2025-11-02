package testing.partition.practico.ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBoundedQueue{

  @Test 
  public void basicTest(){
    BoundedQueue q = new BoundedQueue(2); //signo de capacity > 0
    q.enQueue(2); //o no null, y cola no llena
    assertEquals("[2]", q.toString());
    Object removed = q.deQueue(); //cola no vacia
    assertEquals(2, removed);

    q.enQueue(3);
    assertFalse(q.isEmpty()); //cola no vacia
    assertFalse(q.isFull()); //cola no llena
  }

  @Test 
  public void emptyQueue(){
    BoundedQueue q = new BoundedQueue(0); //capacity = 0
    assertThrows(IllegalStateException.class, () -> q.enQueue(2)); //cola llena 
    assertThrows(IllegalStateException.class, () -> q.deQueue()); //cola vacia 
    assertTrue(q.isEmpty()); //cola vacia 
    assertTrue(q.isFull()); //cola llena
  }

  @Test 
  public void illegalQueue(){
    assertThrows(IllegalArgumentException.class, () -> new BoundedQueue(-2));
  }

  @Test 
  public void enQueueWithNull(){
    BoundedQueue q = new BoundedQueue(2); //signo de capacity > 0
    assertThrows(NullPointerException.class, () -> q.enQueue(null)); //o null, y cola no llena
    assertEquals("[]", q.toString());

    q.enQueue(2);

    Object removed = q.deQueue(); //cola no vacia
    assertEquals(2, removed);

    q.enQueue(3);
    assertFalse(q.isEmpty()); //cola no vacia
    assertFalse(q.isFull()); //cola no llena
  }

  @Test 
  public void enQueueWithFullQueue(){
    BoundedQueue q = new BoundedQueue(1); //signo de capacity > 0

    q.enQueue(1);

    assertThrows(IllegalStateException.class, () -> q.enQueue(2)); //o no null, y cola llena

    assertEquals("[1]", q.toString());

    assertFalse(q.isEmpty()); //cola no vacia

    Object removed = q.deQueue(); //cola no vacia
    assertEquals(1, removed);

    assertFalse(q.isFull()); //cola no llena
  }

  @Test 
  public void deQueueWithEmptyQueue(){
    BoundedQueue q = new BoundedQueue(2); //signo de capacity > 0

    assertThrows(IllegalStateException.class, () -> q.deQueue()); //cola vacia 

    q.enQueue(1); //o no null, cola no llena 

    assertEquals("[1]", q.toString());

    assertFalse(q.isEmpty()); //cola no vacia 
    assertFalse(q.isFull()); //cola no llena 
  }

  @Test 
  public void isEmptyWithEmptyQueue(){
    BoundedQueue q = new BoundedQueue(2); //signo de capacity > 0

    assertTrue(q.isEmpty()); //cola vacia

    q.enQueue(2); //o no null, y cola no llena
    assertEquals("[2]", q.toString());
    Object removed = q.deQueue(); //cola no vacia
    assertEquals(2, removed);

    assertFalse(q.isFull()); //cola no llena
  }

  @Test 
  public void isFullWithFullQueue(){
    BoundedQueue q = new BoundedQueue(2); //signo de capacity > 0
    q.enQueue(2); //o no null y cola no llena 
    assertEquals("[2]", q.toString());

    Object removed = q.deQueue(); //cola no vacia 
    assertEquals(2, removed);

    q.enQueue(1);
    q.enQueue(2);

    assertFalse(q.isEmpty()); //cola no vacia 
    assertTrue(q.isFull()); //cola llena
  }

}
