package tutorial;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOperacionesBasicasCalculadora{

  private Calculadora calculadora;
  private int resultado;

  @Given("tengo una calculadora")
  public void tengo_una_calculadora(){
    calculadora = new Calculadora();
  }

  @When("sumo {int} y {int}")
  public void sumo_y(Integer a, Integer b){
    resultado = calculadora.suma(a,b);
  }

  @Then("el resultado debe ser {int}")
  public void el_resultado_debe_ser(Integer esperado){
    assertEquals(esperado,resultado);
  }

  @When("resto {int} y {int}")
  public void resto_y(Integer a, Integer b){
    resultado = calculadora.resta(a,b);
  }

}
