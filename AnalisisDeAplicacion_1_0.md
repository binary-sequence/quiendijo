<font color='#660000'>Nota: Esta wiki corresponde a la versión 1.0.</font>

# Introducción #
La aplicación consiste en un juego de preguntas y respuestas. Al jugador se le presenta en cada turno una frase dicha por algún personaje popular y se le pide que elija quién dijo esa frase entre cuatro opciones posibles.

Se da por supuesto que, personaje popular, hace referencia a alguien que pueda considerarse digno de mención; como científicos, artistas, filósofos y escritores. No se hace referencia a personajes vulgares de los medios de comunicación.

Dicho esto, son indicados los objetivos que debe cumplir la aplicación en su primera versión (Quien dijo 1.0).

# Índice #
  1. Análisis previo
  1. Diagrama de casos de uso
  1. Diagrama de actividades
  1. Diagrama de entidades e interrelaciones
  1. Diagrama relacional
  1. GUI Interfaz gráfica de usuario
  1. Diagrama de clases

# 1. Análisis previo #
La aplicación necesita un soporte sobre el que almacenar las frases célebres, los autores, las respuestas y, los datos estadísticos de usuario. La opción ideal es usar una base de datos para tal fin. Android permite el uso de la base de datos SQLite.

Se necesita una interfaz gráfica de usuario. Los elementos gráficos necesarios los provee la librería SDK de Android; como botones y etiquetas.

Además se ofrecerá un histórico al usuario que le permita ver cuántas preguntas ha acertado, cuantas ha fallado y cuantas no ha contestado. No sólo sobre el total. También se le mostrará agrupado por autor para mostrarle de qué autor conoce mas frases.

# 2. Diagrama de casos de uso #
Para indicar los objetivos que debe cumplir la aplicación se representan las acciones a realizar por el usuario mediante el estándar UML.
| Diagrama de casos de uso |
|:-------------------------|
| ![https://lh4.googleusercontent.com/-vy3-fNgC28A/TygFFP0LvMI/AAAAAAAAAJo/ruY518rgdtI/s800/01casosUso.jpg](https://lh4.googleusercontent.com/-vy3-fNgC28A/TygFFP0LvMI/AAAAAAAAAJo/ruY518rgdtI/s800/01casosUso.jpg) |

# 3. Diagrama de actividades #
| Imagen de diagrama de actividades |
|:----------------------------------|
| ![https://lh3.googleusercontent.com/-mD45RFUyaR4/TygCkI5CvbI/AAAAAAAAAJY/bkBNYOol1_k/s800/actividades.jpg](https://lh3.googleusercontent.com/-mD45RFUyaR4/TygCkI5CvbI/AAAAAAAAAJY/bkBNYOol1_k/s800/actividades.jpg) |

# 4. Diagrama de entidades e interrelaciones #
| Imagen de diagrama de entidades e interrelaciones |
|:--------------------------------------------------|
| ![https://lh5.googleusercontent.com/-aq_DYy_Kl3Q/T1s4OO8ZGjI/AAAAAAAAALY/XktNlPWIlY0/s800/03entidades.jpg](https://lh5.googleusercontent.com/-aq_DYy_Kl3Q/T1s4OO8ZGjI/AAAAAAAAALY/XktNlPWIlY0/s800/03entidades.jpg) |

# 5. Diagrama relacional #
| Imagen de diagrama relacional |
|:------------------------------|
| ![https://lh6.googleusercontent.com/-dLyutwZU0Lo/T1s5gjp0ICI/AAAAAAAAALs/DaChlsfGq48/s800/04relacional.jpg](https://lh6.googleusercontent.com/-dLyutwZU0Lo/T1s5gjp0ICI/AAAAAAAAALs/DaChlsfGq48/s800/04relacional.jpg) |

# 6. GUI Interfaz gráfica de usuario #
Una pantalla es para el menú principal, desde donde el usuario puede elegir entre iniciar una nueva partida o ver las estadísticas. Otra pantalla es la de juego, en la que se muestra la frase y cuatro nombres entre los que se encuentra el autor original. Antes de comenzar la partida, se pedirá al usuario que seleccione su nick. También hay otra pantalla para las estadísticas.

A continuación se muestran las plantillas para las diferentes pantallas.

| Pantalla de menú: | Pantalla de creación y seleción de usuario | Pantalla de juego: |
|:-------------------|:---------------------------------------------|:-------------------|
| ![https://lh3.googleusercontent.com/-2CVBABStMk8/T1uTm_MEWBI/AAAAAAAAAMo/v8qAck2Jh9I/s800/05frmMenu.jpg](https://lh3.googleusercontent.com/-2CVBABStMk8/T1uTm_MEWBI/AAAAAAAAAMo/v8qAck2Jh9I/s800/05frmMenu.jpg) | ![https://lh3.googleusercontent.com/-KPWPfAkOrcs/T19GkF_vlEI/AAAAAAAAANY/GnBsxs_8-SQ/s800/06frmUsuarios.jpg](https://lh3.googleusercontent.com/-KPWPfAkOrcs/T19GkF_vlEI/AAAAAAAAANY/GnBsxs_8-SQ/s800/06frmUsuarios.jpg) | ![https://lh6.googleusercontent.com/-DF0oeVm1hm8/T1uTm4z3E6I/AAAAAAAAAMg/uVlfgtsunz0/s800/07frmJuego.jpg](https://lh6.googleusercontent.com/-DF0oeVm1hm8/T1uTm4z3E6I/AAAAAAAAAMg/uVlfgtsunz0/s800/07frmJuego.jpg) |

| Pantalla de estadísticas: | Contenido de pestaña General | Contenido de pestaña Autores |
|:---------------------------|:------------------------------|:------------------------------|
| ![https://lh6.googleusercontent.com/-LUgUxBvevKM/T19HbwXffPI/AAAAAAAAANk/fal9JTf8jTk/s800/08frmEstadisticas.jpg](https://lh6.googleusercontent.com/-LUgUxBvevKM/T19HbwXffPI/AAAAAAAAANk/fal9JTf8jTk/s800/08frmEstadisticas.jpg) | ![https://lh5.googleusercontent.com/-iF9fp0TamH0/Tygd4BSMLiI/AAAAAAAAAKM/kbr4yg5o5dw/s288/09frmTabGeneral.jpg](https://lh5.googleusercontent.com/-iF9fp0TamH0/Tygd4BSMLiI/AAAAAAAAAKM/kbr4yg5o5dw/s288/09frmTabGeneral.jpg) | ![https://lh4.googleusercontent.com/-P--nyOXdpO8/TygmAVVmJII/AAAAAAAAAKU/oSU6vcmmyaA/s288/10frmTabAutores.jpg](https://lh4.googleusercontent.com/-P--nyOXdpO8/TygmAVVmJII/AAAAAAAAAKU/oSU6vcmmyaA/s288/10frmTabAutores.jpg) |

# 3. Diagrama de clases #
Debido a la orientación de Java, en la que cualquier elemento es un objeto, tanto las ventanas de GUI como los tipos de datos para recoger información de la base de datos se implementan mediante clases.
| Diagrama de clases |
|:-------------------|
| ![https://lh4.googleusercontent.com/-AyhZqoWX82k/T19rSpPeznI/AAAAAAAAAOM/pFpZqHGhXOU/s800/11clases.jpg](https://lh4.googleusercontent.com/-AyhZqoWX82k/T19rSpPeznI/AAAAAAAAAOM/pFpZqHGhXOU/s800/11clases.jpg) |