package tasks;

import static userinterface.EncuestaSintomasSura.BTN_FINALIZAR_ENCUESTA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DiligenciarEncuesta implements Task {

  public static DiligenciarEncuesta delContacto() {
    return Tasks.instrumented(DiligenciarEncuesta.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BTN_FINALIZAR_ENCUESTA));
  }
}
