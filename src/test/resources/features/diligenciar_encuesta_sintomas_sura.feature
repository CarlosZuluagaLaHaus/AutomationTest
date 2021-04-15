#language: es
#carloszuluaga@lahaus.com

Característica: Proceso de diligenciamiento encuesta sintomas Covid-19 página de Sura
  Como automatizador de La Haus
  Quiero diligenciar la encuesta de sintomas diarios
  Para garantizar a diario esta tarea

  ··Antecedentes: Abrir página web encuesta sintomas Covid-19 de Sura


  Escenario: Diligenciar encuesta diaria de sintas Covid-19 Sura.
    Dado que Carlos se encuentra en la página de 'Sura'
    Cuando autoriza el manejo de información para el usuario
      | Nombre Usuario        | Carlos Andrés Zuluaga Gómez      |
      | Número Identificación | 1053787031                       |
    Y diligencia la encuesta con los datos
    Entonces puede visualizar el mensaje de confirmación 'Carlos Andrés Zuluaga Gómez, gracias por tus respuestas.'
