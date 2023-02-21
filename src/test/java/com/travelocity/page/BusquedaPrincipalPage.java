package com.travelocity.page;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPrincipalPage {
  public static final Target BTN_DESTINO = Target.the("Búsqueda destino").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
  public static final Target IN_DESTINO = Target.the("Input para búsqueda destino").locatedBy("//input[@id='location-field-destination']");
  public static final Target FECHA_IN = Target.the("Input Check in").locatedBy("//button[@id='d1-btn']");
  public static final Target FECHA_INICIO = Target.the("Fecha de inicio").locatedBy("//button[@aria-label='5 de abril de 2023']");
  public static final Target FECHA_FIN = Target.the("Fecha de finalización").locatedBy("//button[@aria-label='15 de abril de 2023']");
  public static final Target BTN_FECHA_LISTO = Target.the("Botón para finalizar la selección de fechas").locatedBy("//button[@data-stid='apply-date-picker']");
  public static final Target BTN_BUSCAR = Target.the("Botón para buscar").locatedBy("//button[@data-testid='submit-button']");
  public static final Target BTN_ORIGEN = Target.the("Búsqueda origen").locatedBy("//button[@data-stid='location-field-origin-menu-trigger']");
  public static final Target IN_ORIGEN = Target.the("Input para búsqueda origen").locatedBy("//input[@id='location-field-origin']");
  public static final Target TAB_PAQUETES = Target.the("Tab Paquetes").locatedBy("//a/span[contains(text(),'Paquetes')]/..");
}
