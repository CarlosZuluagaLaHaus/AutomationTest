package tasks;

import static userinterface.PaginaInicialSura.*;

import java.util.Map;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class DiligenciarInformacion implements Task {

  private final Map<String, String> mapDatosUsuario;

  public static DiligenciarInformacion delContacto(Map<String, String> mapDatosUsuario) {
    return Tasks.instrumented(DiligenciarInformacion.class, mapDatosUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_ACEPTAR_AUTORIZAR_MANEJO_DATOS),
        Enter.theValue(mapDatosUsuario.get("Número Identificación"))
            .into(TXT_NUMERO_IDENTIFICACION),
        Enter.theValue(mapDatosUsuario.get("Nombre Usuario")).into(TXT_NOMBRE_COMPLETO_CONTACTO),
        Click.on(BTN_SIGUIENTE));
  }
}
