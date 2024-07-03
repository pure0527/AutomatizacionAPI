package com.nttdata.glue;

import com.nttdata.steps.petStoreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class petstoreStepsDef {

    @Steps
    petStoreSteps petstore;

    // No reconocio los tipos de valores como int. el archivo feature no reconocio el stepDef
    /*@Given("creo un pedido con id: {int}, petId: {int}, quantity: {int}, shipDate: {string}>, status: {string}, y complete: {string}")
    public void CrearOrden() {
    }*/

    @Given("creo un pedido con id: {string}, petId: {string}, quantity: {string}, shipDate: {string}, status: {string}, y complete: {string}")
    public void CrearOrden(String id, String petId, String cantidad, String fecha, String status, String comp) {
        petstore.CrearPedido(id,petId,cantidad,fecha,status,comp);
    }

    @Then("el código de respuesta es {int}")
    public void validarCodigo(int estado) {
        petstore.validarCodigo(estado);
    }

    @And("el type es {string}")
    public void validarType(String type) {
        petstore.validarType(type);
    }


    @Given("creo un pedido con id: <id>, petId: <petId> , quantity: <quantity>, shipDate: <shipDate>, status: <status>, y complete: <complete>")
    public void creoUnPedidoConIdIdPetIdPetIdQuantityQuantityShipDateShipDateStatusStatusYCompleteComplete() {
    }

    @Then("el código respuesta del pedido debería ser {int}")
    public void elCódigoRespuestaDelPedidoDeberíaSer(int arg0) {

    }


    @And("el contenido recuperado")
    public void elContenidoRecuperado() {

    }

    @Given("que se ha creado un pedido con orderId {int}")
    public void queSeHaCreadoUnPedidoConOrderId(int arg0) {

    }

    @When("recupero el pedido con orderId {int}")
    public void recuperoElPedidoConOrderIdId() {
    }


}

