package tutorial;

public class CuentaBancaria{

  private int saldo;

  public CuentaBancaria(){
    this.saldo = 0;
  }

  public void depositar(int cantidad){
    this.saldo += cantidad;
  }

  public int getSaldo(){
    return this.saldo;
  }

  public void retirar(int retiro){
    this.saldo -= retiro; 
  }
}
