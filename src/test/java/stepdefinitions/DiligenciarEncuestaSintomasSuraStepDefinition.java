package stepdefinitions;

import static exceptions.MensajeConfirmacionNoCoincide.MENSAJE_ERRADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import exceptions.MensajeConfirmacionNoCoincide;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import java.util.Map;
import questions.MensajeConfirmacion;
import tasks.DiligenciarEncuesta;
import tasks.DiligenciarInformacion;

public class DiligenciarEncuestaSintomasSuraStepDefinition {

  @Cuando("autoriza el manejo de información para el usuario")
  public void diligenciarInformacionContacto(Map<String, String> mapDatosUsuario) {
    theActorInTheSpotlight().attemptsTo(DiligenciarInformacion.delContacto(mapDatosUsuario));
  }

  @Cuando("diligencia la encuesta con los datos")
  public void diligenciarEncuesta() {
    theActorInTheSpotlight().attemptsTo(DiligenciarEncuesta.delContacto());
  }

  @Entonces("puede visualizar el mensaje de confirmación {string}")
  public void visualizarResultadosBusqueda(String mensajeConfirmacion) {
    theActorInTheSpotlight()
        .should(
            seeThat(MensajeConfirmacion.diligenciaEncuesta(), equalTo(mensajeConfirmacion))
                .orComplainWith(MensajeConfirmacionNoCoincide.class, MENSAJE_ERRADO));
  }
}
