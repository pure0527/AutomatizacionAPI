package com.nttdata.glue;

import com.nttdata.steps.petStoreSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class petstoreStepsDef {

    @Steps
    petStoreSteps petstore;

    /*@Given("I create an order with petId {int}, quantity {int}, shipDate {string}, status {string}, and complete {boolean}")
    public void createOrder(int petId, int quantity, String shipDate, String status, boolean complete) {
        String order = String.format(
                "{\"petId\": %d, \"quantity\": %d, \"shipDate\": \"%s\", \"status\": \"%s\", \"complete\": %b}",
                petId, quantity, shipDate, status, complete);

        response = given()
                .contentType("application/json")
                .body(order)
                .when()
                .post("https://petstore.swagger.io/v2/store/order");

        orderId = response.jsonPath().getInt("id");
    }

    @Then("the order creation response status code should be {int}")
    public void verifyOrderCreationStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("the order creation response body should match the expected body for creation")
    public void verifyOrderCreationResponseBody() {
        // Puedes reemplazar esto con la validación de tu cuerpo esperado
        response.then().body("petId", equalTo(1))
                .body("quantity", equalTo(2))
                .body("shipDate", equalTo("2023-07-01"))
                .body("status", equalTo("placed"))
                .body("complete", equalTo(true));
    }

    @Given("an order has been created with orderId {int}")
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @When("I retrieve the order with orderId {int}")
    public void retrieveOrder(int orderId) {
        response = given()
                .pathParam("orderId", orderId)
                .when()
                .get("https://petstore.swagger.io/v2/store/order/{orderId}");
    }

    @Then("the order retrieval response status code should be {int}")
    public void verifyOrderRetrievalStatusCode(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @Then("the order retrieval response body should match the expected body for retrieval")
    public void verifyOrderRetrievalResponseBody() {
        // Puedes reemplazar esto con la validación de tu cuerpo esperado
        response.then().body("petId", equalTo(1))
                .body("quantity", equalTo(2))
                .body("shipDate", equalTo("2023-07-01"))
                .body("status", equalTo("placed"))
                .body("complete", equalTo(true));

    }*/

    @Given("ccreo un pedido con id: {int}, petId: {int} , quantity: {int}, shipDate: {string}, status: {string}, y complete: {boolean}")
    public void CrearPedido(int id, int petId, int cantidad, String fecha, String status, boolean comp) {
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


}


