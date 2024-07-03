
Feature: PetStore

  @crear
  Scenario Outline: Crear orden
    Given creo un pedido con id: "<id>", petId: "<petId>", quantity: "<quantity>", shipDate: "<shipDate>", status: "<status>", y complete: "<complete>"
    Then el código de respuesta es 200
    And el type es "unknown"

    Examples:
     | id | petId | quantity | shipDate   | status   | complete |
     |111 | 1     | 2        | 2023-07-01 | placed   | true     |
     |112 | 2     | 1        | 2023-07-02 | approved | false    |


  @consultar
  Scenario Outline: consultar la orden
    Given que se ha creado un pedido con orderId <id>
    When recupero el pedido con orderId <id>
    Then el código respuesta del pedido debería ser 200
    And el contenido recuperado

    Examples:
      | id | petId | quantity | shipDate   | status   | complete | creationStatusCode |
      | 1  | 1     | 2        | 2023-07-01 | placed   | true     | 200                |
      | 2  | 2     | 1        | 2023-07-02 | approved | false    | 200                |

