package testing.partition.practico.ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPatternIndex{

  @Test 
  public void subjectAndPatternAreNull(){
    String subject = null;
    String pattern = null;
    assertThrows(NullPointerException.class, () -> PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void subjectIsNullAndPatternIsEmpty(){
    String subject = null;
    String pattern = "";
    assertThrows(NullPointerException.class, () -> PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void subjectIsNullAndPatternIsNotEmpty(){
    String subject = null;
    String pattern = "a";
    assertThrows(NullPointerException.class, () -> PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void subjectIsEmptyAndPatternIsNull(){
    String subject = "";
    String pattern = null;
    assertThrows(NullPointerException.class, () -> PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void subjectIsNotEmptyAndPatternIsNull(){
    String subject = "a";
    String pattern = null;
    assertThrows(NullPointerException.class, () -> PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void subjectAndPatternAreEmpty(){
    //aca se encontro un error
    String subject = "";
    String pattern = "";
    assertEquals(-1, PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void patternIsNotInSubject(){
    String subject = "agustin";
    String pattern = "aguz";
    assertEquals(-1, PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void patternIsInTheFinalOfSubject(){
    String subject = "agustin";
    String pattern = "tin";
    assertEquals(4, PatternIndex.patternIndex(subject,pattern));
  }

  @Test 
  public void patternAppearsSeveralTimesInSubject(){
    String subject = "agustingus";
    String pattern = "gus";
    assertEquals(1, PatternIndex.patternIndex(subject,pattern));
  }

}
