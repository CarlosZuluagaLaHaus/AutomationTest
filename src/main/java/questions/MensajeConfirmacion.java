package questions;

import static net.serenitybdd.screenplay.questions.Text.of;
import static userinterface.PaginaConfirmacionEncuestaFinalizada.LBL_MENSAJE_ENCUESTA_DILIGENCIADA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MensajeConfirmacion implements Question<String> {

  public static MensajeConfirmacion diligenciaEncuesta() {
    return new MensajeConfirmacion();
  }

  @Override
  public String answeredBy(Actor actor) {
    LBL_MENSAJE_ENCUESTA_DILIGENCIADA.resolveFor(actor).isVisible();
    return of(LBL_MENSAJE_ENCUESTA_DILIGENCIADA).viewedBy(actor).asString();
  }
}
