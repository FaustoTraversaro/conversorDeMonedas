Conversor de Monedas
Proyecto final del desafío de programación de Oracle ONE y Alura Latam. Esta aplicación es un conversor de monedas de consola que utiliza una API externa para obtener las tasas de cambio más recientes.

🚀 Características
Menú Interactivo: Interfaz de usuario de consola simple y fácil de usar.

Conversión Múltiple: Permite la conversión entre 6 pares de monedas populares:

Dólar (USD) a Peso Argentino (ARS)

Peso Argentino (ARS) a Dólar (USD)

Dólar (USD) a Real Brasileño (BRL)

Real Brasileño (BRL) a Dólar (USD)

Dólar (USD) a Peso Colombiano (COP)

Peso Colombiano (COP) a Dólar (USD)

Tasas en Tiempo Real: Consume la API de ExchangeRate-API para obtener las tasas de conversión actualizadas al momento de la ejecución.

Código Modular: El proyecto está estructurado en clases separadas para responsabilidades específicas (conexión a API, cálculos, interfaz de usuario).

🛠️ Tecnologías Utilizadas
Java 11+: Lenguaje principal del proyecto.

IntelliJ IDEA: IDE utilizado para el desarrollo.

HttpClient (Java 11): Para realizar solicitudes HTTP a la API.

Gson (Google): Librería para analizar (parsear) la respuesta JSON de la API.

Git y GitHub: Para el control de versiones y alojamiento del proyecto.

🏁 Cómo Ejecutar
Clonar el Repositorio (o descargar el ZIP)

Obtener una API Key:

Regístrese gratis en ExchangeRate-API.

Obtenga su clave API personal.

Configurar la API Key:

Abra el archivo src/ConsultaAPI.java.

Reemplace la clave con su clave personal en la línea 17:

Ejecutar:

Busque el archivo src/Conversor.java.

Ejecute el método main().

✍️ Autor
Fausto Traverso