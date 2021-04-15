package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Urls {
  SURA(
      "https://www.segurossura.com.co/covid-19/encuestas/paginas/sintomas.aspx?nitEmpresa=900809691&sector=U0VSVklDSU9TIEdFTkVSQUxFUw==&idEmpresa=OTAwODA5Njkx&mail=patriciachaverra@lahaus.com");

  private final String direccionUrl;
}
