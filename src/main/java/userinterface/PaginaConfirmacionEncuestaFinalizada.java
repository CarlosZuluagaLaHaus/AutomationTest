package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaConfirmacionEncuestaFinalizada {

  public static final Target LBL_MENSAJE_ENCUESTA_DILIGENCIADA =
      Target.the("Label Mensaje Encuesta Finalizada Correctamente")
          .located(By.xpath("//div[@class='title']//h1"));
}
