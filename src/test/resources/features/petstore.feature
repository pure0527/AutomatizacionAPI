@petstore
Feature: PetStore Store Service Automation

  @crear
  Scenario Outline: Crear orden
    Given creo un pedido con id: <id>, petId: <petId> , quantity: <quantity>, shipDate: <shipDate>, status: <status>, y complete: <complete>
    Then el código de respuesta es 200
    And el type es "unknown"

    Examples:
     | id | petId | quantity | shipDate   | status   | complete |
     | 111  | 1     | 2        | 2023-07-01 | placed   | true     |
     | 112  | 2     | 1        | 2023-07-02 | approved | false    |


