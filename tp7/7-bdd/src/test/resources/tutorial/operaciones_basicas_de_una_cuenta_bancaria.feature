Feature: operaciones basicas de una cuenta bancaria

  Scenario: consulta de saldo
    Given tengo una cuenta bancaria
    When ingreso $200
    And consulto mi saldo
    Then mi saldo es de $200

  Scenario: hago dos ingresos de dinero
    Given tengo una cuenta bancaria
    When ingreso $100
    And ingreso $200
    And consulto mi saldo
    Then mi saldo es de $300

  Scenario: retiro dinero luego de ingresar
    Given tengo una cuenta bancaria
    When ingreso $50
    And retiro $10
    And consulto mi saldo
    Then mi saldo es de $40
