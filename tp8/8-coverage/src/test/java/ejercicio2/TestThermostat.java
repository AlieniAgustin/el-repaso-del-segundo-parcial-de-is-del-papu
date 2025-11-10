package ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestThermostat{

  @Test 
  public void test1(){
    ProgrammedSettings settings = new ProgrammedSettings();
    Thermostat t = new Thermostat();
    Period period = Period.DAY;
    DayType day = DayType.WEEKDAY;
    t.setDay(day);
    t.setPeriod(period);
    t.setCurrentTemp(64);
    t.setThresholdDiff(0);
    t.setOverride(true);
    t.setOverTemp(65);
    t.setTimeSinceLastRun(2);
    t.setMinLag(1);
    assertTrue(t.turnHeaterOn(settings));
  }

  @Test 
  public void test2(){
    ProgrammedSettings settings = new ProgrammedSettings();
    Thermostat t = new Thermostat();
    Period period = Period.DAY;
    DayType day = DayType.WEEKDAY;
    t.setDay(day);
    t.setPeriod(period);
    t.setCurrentTemp(64);
    t.setThresholdDiff(0);
    t.setOverride(false);
    t.setOverTemp(65);
    t.setTimeSinceLastRun(1);
    t.setMinLag(2);
    assertFalse(t.turnHeaterOn(settings));
  }

  @Test 
  public void test3(){
    ProgrammedSettings settings = new ProgrammedSettings();
    Thermostat t = new Thermostat();
    Period period = Period.DAY;
    DayType day = DayType.WEEKDAY;
    t.setDay(day);
    t.setPeriod(period);
    t.setCurrentTemp(65);
    t.setThresholdDiff(0);
    t.setOverride(true);
    t.setOverTemp(66);
    t.setTimeSinceLastRun(2);
    t.setMinLag(1);
    assertTrue(t.turnHeaterOn(settings));
  }

  @Test 
  public void test4(){
    ProgrammedSettings settings = new ProgrammedSettings();
    Thermostat t = new Thermostat();
    Period period = Period.DAY;
    DayType day = DayType.WEEKDAY;
    t.setDay(day);
    t.setPeriod(period);
    t.setCurrentTemp(65);
    t.setThresholdDiff(0);
    t.setOverride(true);
    t.setOverTemp(66);
    t.setTimeSinceLastRun(2);
    t.setMinLag(2);
    assertFalse(t.turnHeaterOn(settings));
  }

  @Test 
  public void test5(){
    ProgrammedSettings settings = new ProgrammedSettings();
    Thermostat t = new Thermostat();
    Period period = Period.DAY;
    DayType day = DayType.WEEKDAY;
    t.setDay(day);
    t.setPeriod(period);
    t.setCurrentTemp(65);
    t.setThresholdDiff(0);
    t.setOverride(false);
    t.setOverTemp(66);
    t.setTimeSinceLastRun(2);
    t.setMinLag(1);
    assertFalse(t.turnHeaterOn(settings));
  }

  @Test 
  public void test6(){
    ProgrammedSettings settings = new ProgrammedSettings();
    Thermostat t = new Thermostat();
    Period period = Period.DAY;
    DayType day = DayType.WEEKDAY;
    t.setDay(day);
    t.setPeriod(period);
    t.setCurrentTemp(65);
    t.setThresholdDiff(0);
    t.setOverride(true);
    t.setOverTemp(65);
    t.setTimeSinceLastRun(2);
    t.setMinLag(2);
    assertFalse(t.turnHeaterOn(settings));
  }

  @Test 
  public void test7(){
    Thermostat t = new Thermostat();
    t.setRunTime(2);
    assertEquals(2,t.getRunTime());
    t.setHeaterOn(true);
    assertTrue(t.getHeaterOn());
  }

  @Test 
  public void test8(){
    ProgrammedSettings settings = new ProgrammedSettings();
    Thermostat t = new Thermostat();
    Period period = Period.DAY;
    DayType day = DayType.WEEKDAY;
    t.setDay(day);
    t.setPeriod(period);
    t.setCurrentTemp(64);
    t.setThresholdDiff(0);
    t.setOverride(false);
    t.setOverTemp(65);
    t.setTimeSinceLastRun(2);
    t.setMinLag(1);
    assertTrue(t.turnHeaterOn(settings));
  }

}
