package com.travelocity.stepdefinitions;

import com.travelocity.task.SeleccionarHospedaje;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import com.travelocity.page.ResultadosBusquedaPage;

public class HospedajeStepDefinitions {

    @Cuando("{actor} busca un hospedaje para {string}")
    public void buscarLugarParaHospedarse(Actor actor, String destino) {
        actor.attemptsTo(SeleccionarHospedaje.simple(destino));
    }

    @Entonces("{actor} debe encontrar al menos una opción disponible")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(ResultadosBusquedaPage.LISTA_DE_HOSPEDAJES).values().hasSizeGreaterThan(1)
        );
    }
}
