package exceptions;

public class MensajeConfirmacionNoCoincide extends AssertionError {

  public static final String MENSAJE_ERRADO =
      "El mensaje de confirmación no coincide con el esperado";

  public MensajeConfirmacionNoCoincide(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
