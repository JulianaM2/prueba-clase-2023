package com.travelocity.stepdefinitions;

import com.travelocity.task.BuscarPaqueteTask;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import com.travelocity.page.ResultadosBusquedaPage;

public class PaquetesStepDefinitions {

    @Cuando("{actor} busca un paquete de viaje desde {string} para {string}")
    public void buscarLugarParaHospedarse(Actor actor, String origen, String destino ) {
        actor.attemptsTo(BuscarPaqueteTask.conOrigenDestino(origen, destino));
    }

    @Entonces("{actor} debe encontrar al menos una opción con valor menor a {int}")
    public void should_see_information_about(Actor actor, Integer precio) {
        actor.attemptsTo(
                Ensure.that(ResultadosBusquedaPage.LISTA_DE_VALORES_PAQUETES).textValues().startsWith("$")
        );
    }
}
