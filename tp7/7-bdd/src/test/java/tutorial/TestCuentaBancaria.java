package tutorial;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCuentaBancaria{
  private CuentaBancaria cuenta;
  private int saldo;

  @Given("tengo una cuenta bancaria")
  public void tengo_una_cuenta_bancaria(){
    cuenta = new CuentaBancaria();
  }

  @When("ingreso ${int}")
  public void ingreso_$(Integer deposito){
    cuenta.depositar(deposito);
  }

  @And("consulto mi saldo")
  public void consulto_mi_saldo(){
    saldo = cuenta.getSaldo();
  }

  @Then("mi saldo es de ${int}")
  public void mi_saldo_es_de_$(Integer esperado){
    assertEquals(esperado,saldo);
  }

  @And("retiro ${int}")
  public void retiro_$(Integer retiro){
    cuenta.retirar(retiro); 
  }
}
