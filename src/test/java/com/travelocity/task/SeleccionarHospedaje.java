package com.travelocity.task;

import org.openqa.selenium.Keys;

import com.travelocity.page.BusquedaPrincipalPage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;


public class SeleccionarHospedaje {
    public static Performable simple(String destino) {
        return Task.where("{0} selecciona un hospedaje simple para '" + destino + "'",
                Open.url("https://www.travelocity.com/es/"),
                Click.on(BusquedaPrincipalPage.BT_DESTINO_HOSPEDAJE),
                Enter.theValue(destino)
                        .into(BusquedaPrincipalPage.IN_DESTINO_HOSPEDAJE)
                        .thenHit(Keys.ENTER),
                Click.on(BusquedaPrincipalPage.FECHA_IN_HOSPEDAJE),
                Click.on(BusquedaPrincipalPage.FECHA_INICIO_HOSPEDAJE),
                Click.on(BusquedaPrincipalPage.FECHA_FIN_HOSPEDAJE),
                Click.on(BusquedaPrincipalPage.FECHA_HOSPEDAJE_LISTO),
                Click.on(BusquedaPrincipalPage.BUSCAR_HOSPEDAJE));
    }
}
