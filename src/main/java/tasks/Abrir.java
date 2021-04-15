package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

@AllArgsConstructor
public class Abrir implements Task {

  private final String nombrePagina;

  public static Abrir pagina(String nombrePagina) {
    return instrumented(Abrir.class, nombrePagina);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Open.url(
            utils.Urls.valueOf(nombrePagina.toUpperCase().replace(" ", "_")).getDireccionUrl()));
  }
}
