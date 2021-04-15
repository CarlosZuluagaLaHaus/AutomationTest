package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicialSura {

  public static final Target BTN_ACEPTAR_AUTORIZAR_MANEJO_DATOS =
      Target.the("Boton Autorización Manejo Datos").located(By.name("data[page3SiAutorizo]"));
  public static final Target TXT_NUMERO_IDENTIFICACION =
      Target.the("Campo de texto diligenciar número identificación")
          .located(By.name("data[identificacion_usuario]"));
  public static final Target TXT_NOMBRE_COMPLETO_CONTACTO =
      Target.the("Campo de texto diligenciar nombre contacto")
          .located(By.name("data[nombre_usuario]"));
  public static final Target BTN_SIGUIENTE =
      Target.the("Boton Siguiente").located(By.name("data[page1Siguiente]"));
}
