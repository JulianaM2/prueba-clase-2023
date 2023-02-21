package com.travelocity.task;

import org.openqa.selenium.Keys;

import com.travelocity.page.BusquedaPrincipalPage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;


public class SeleccionarHospedajeTask {
    public static Performable simple(String destino) {
        return Task.where("{0} selecciona un hospedaje simple para '" + destino + "'",
                Open.url("https://www.travelocity.com/es/"),
                Click.on(BusquedaPrincipalPage.BTN_DESTINO),
                Enter.theValue(destino)
                        .into(BusquedaPrincipalPage.IN_DESTINO)
                        .thenHit(Keys.ENTER),
                Click.on(BusquedaPrincipalPage.FECHA_IN),
                Click.on(BusquedaPrincipalPage.FECHA_INICIO),
                Click.on(BusquedaPrincipalPage.FECHA_FIN),
                Click.on(BusquedaPrincipalPage.BTN_FECHA_LISTO),
                Click.on(BusquedaPrincipalPage.BTN_BUSCAR));
    }
}
