package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class petStoreSteps {

    public void CrearPedido(String id, String petId, String cantidad, String fecha, String status, String estOrden) {
        String CREATE_ORDER = "https://petstore.swagger.io/v2/store/order";
        SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "  \"id\": \": \""+id+"\",\n" +
                        "  \"petId\": \""+petId+"\",\n" +
                        "  \"quantity\": \""+cantidad+"\",\n" +
                        "  \"shipDate\": \""+fecha+"\",\n" +
                        "  \"status\": \""+status+"\",\n" +
                        "  \"complete\": \""+estOrden+"\",\n" +
                        "}")
                .log().all()
                .post(CREATE_ORDER)
                .then()
                .log().all()
        ;
    }

    public void validarCodigo(int estado) {
        restAssuredThat(response -> response.statusCode(estado));
    }

    public void validarType(String type) {
        restAssuredThat(response -> response.body("'type'", equalTo(type)));
        System.out.println("Type: " + SerenityRest.lastResponse().body().path("type").toString());
        System.out.println(SerenityRest.lastResponse().print());
    }
}
