Feature: Linio
  @pruebaLinio
  Scenario: Login y agregar producto al carrito
    Given usuario se encuentra en la página "https://www.linio.com.pe/account/login"
    When ingresa email correcto "jennystephania2001@gmail.com"
    And ingresa contraseña correcta "Linioexamen123"
    And se hace click en el boton Iniciar sesion segura
    And se selecciona la opcion Mejores calificados
    And se selecciona el producto "Audífono Bluetooth F9 PRO 3000 mAh"
    And se da click en el boton Añadir al carrito
    Then se valida que el nombre de cuenta sea "Jenny"
    And se valida que debe aparecer el titulo "REMATE/MEJORES CALIFICADOS"
    And se valida el mensaje "Tu producto se agregó al carrito"


