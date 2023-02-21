package com.travelocity.page;

import net.serenitybdd.screenplay.targets.Target;

public class BusquedaPrincipalPage {
  public static final Target BT_DESTINO_HOSPEDAJE = Target.the("Búsqueda destino de hospedaje").locatedBy("//button[@data-stid='location-field-destination-menu-trigger']");
  public static final Target IN_DESTINO_HOSPEDAJE = Target.the("Input para búsqueda destino de hospedaje").locatedBy("//input[@id='location-field-destination']");
  public static final Target FECHA_IN_HOSPEDAJE = Target.the("Input Check in").locatedBy("//button[@id='d1-btn']");
  public static final Target FECHA_INICIO_HOSPEDAJE = Target.the("Fecha de inicio de hospedaje").locatedBy("//button[@aria-label='5 de abril de 2023']");
  public static final Target FECHA_FIN_HOSPEDAJE = Target.the("Fecha de finalización de hospedaje").locatedBy("//button[@aria-label='15 de abril de 2023']");
  public static final Target FECHA_HOSPEDAJE_LISTO = Target.the("Botón para finalizar la selección de fechas").locatedBy("//button[@data-stid='apply-date-picker']");
  public static final Target BUSCAR_HOSPEDAJE = Target.the("Botón para buscar el hispedaje").locatedBy("//button[@data-testid='submit-button']");
}
