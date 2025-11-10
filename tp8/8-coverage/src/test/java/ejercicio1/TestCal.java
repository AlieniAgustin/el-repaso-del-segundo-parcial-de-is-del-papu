package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCal{
  
  @Test 
  public void mismoMes(){
    Cal calendario = new Cal();
    int mes1 = 1; int mes2 = 1;
    int dia1 = 2; int dia2 = 4;
    int anio = 2005;
    int cantDias = calendario.cal(mes1,dia1,mes2,dia2,anio);
    int cantDiasEsperados = 2;
    assertEquals(cantDiasEsperados,cantDias);
  }

  @Test 
  public void distintoMesAnioNoBisiesto1(){
    Cal calendario = new Cal();
    int mes1 = 1; int mes2 = 3;
    int dia1 = 2; int dia2 = 4;
    int anio = 2017;
    int cantDias = calendario.cal(mes1,dia1,mes2,dia2,anio);
    int cantDiasEsperados = 61;
    assertEquals(cantDiasEsperados,cantDias);
  }

  @Test 
  public void distintoMesAnioNoBisiesto2(){
    Cal calendario = new Cal();
    int mes1 = 1; int mes2 = 3;
    int dia1 = 2; int dia2 = 4;
    int anio = 100;
    int cantDias = calendario.cal(mes1,dia1,mes2,dia2,anio);
    int cantDiasEsperados = 61;
    assertEquals(cantDiasEsperados,cantDias);
  }


  @Test 
  public void distintoMesAnioBisiesto1(){
    Cal calendario = new Cal();
    int mes1 = 1; int mes2 = 3;
    int dia1 = 2; int dia2 = 4;
    int anio = 2016;
    int cantDias = calendario.cal(mes1,dia1,mes2,dia2,anio);
    int cantDiasEsperados = 62;
    assertEquals(cantDiasEsperados,cantDias);
  }

  @Test 
  public void distintoMesAnioBisiesto2(){
    Cal calendario = new Cal();
    int mes1 = 1; int mes2 = 3;
    int dia1 = 2; int dia2 = 4;
    int anio = 800;
    int cantDias = calendario.cal(mes1,dia1,mes2,dia2,anio);
    int cantDiasEsperados = 62;
    assertEquals(cantDiasEsperados,cantDias);
  }
}

