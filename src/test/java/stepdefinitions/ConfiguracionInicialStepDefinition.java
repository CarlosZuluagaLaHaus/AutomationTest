package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.*;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;

public class ConfiguracionInicialStepDefinition {

  @Before
  public void configurarActor() {
    setTheStage(new OnlineCast());
    theActorCalled("Carlos");
  }

  @Dado("que Carlos se encuentra en la página de {string}")
  public void abrirUrl(String nombrePagina) {
    theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina));
  }
}
