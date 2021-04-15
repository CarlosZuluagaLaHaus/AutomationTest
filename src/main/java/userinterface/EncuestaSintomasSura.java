package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EncuestaSintomasSura {

  public static final Target BTN_FINALIZAR_ENCUESTA =
      Target.the("Boton Finalizar Encuesta").located(By.name("data[page2Finalizar]"));
}
