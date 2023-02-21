package com.travelocity.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusquedaPage {
  public static final Target LISTA_DE_HOSPEDAJES = Target.the("Lista del resultado de búsqueda de hospedaje").locatedBy("//a[@data-stid='open-hotel-information']");
  public static final Target LISTA_DE_VALORES_PAQUETES = Target.the("Lista del resultado de búsqueda de hospedaje").locatedBy("//span[@data-stid='price-lockup-text']");
}

