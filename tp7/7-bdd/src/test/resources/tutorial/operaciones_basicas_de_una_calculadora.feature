Feature: operaciones basicas de una calculadora

  Scenario: suma de dos enteros positivos
    Given tengo una calculadora
    When sumo 5 y 3
    Then el resultado debe ser 8

  Scenario: resta entre dos enteros
    Given tengo una calculadora
    When resto 2 y 3
    Then el resultado debe ser -1
