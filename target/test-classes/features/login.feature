
Feature: Product - Store

  @test
  Scenario Outline: Validación del precio de un producto
    Given estoy en la página de la tienda
    And me logueo con mi email '<email>' y clave "<clave>"
    When navego a la categoria "<categoria>" y subcategoria "<subcategoria>"
    And agrego "<cantidad>" unidades del primer producto al carrito
    When valido en el popup la confirmación del producto agregado
    And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
    And vuelvo a validar el calculo de precios en el carrito
    Examples:
      | email                   | clave       | categoria | subcategoria | cantidad |
      | cpingoaguilar@gmail.com | @carlos1020 | Clothes   | Men          | 2        |
      | cpingoaguila            | @carlos1020 | Clothes   | Men          | 2        |
      | cpingoaguilar@gmail.com | @carlos1020 | Autos     | Toyota       | 2        |
