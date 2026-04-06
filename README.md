REALIZADO POR:
Sosa Chirino Marcos Antonio
DNI 46807958

Descripción de la App: 
Esta aplicación Android tiene como objetivo aplicar el uso de BroadcastReceiver para capturar eventos del sistema. 
Específicamente, la app "escucha" el evento de desbloqueo de pantalla del dispositivo con Intent.ACTION_USER_PRESENT.
Al detectarse el desbloqueo, la aplicación realiza las siguientes acciones de forma automática:
* Notificación Visual: Muestra un mensaje Toast con el texto: "Pantalla desbloqueada detectada".
* Registro en Consola: Registra en el Logcat un mensaje indicando que se produjo el evento de desbloqueo.
* Interacción con el Sistema: Genera un Intent implícito que abre el marcador de llamadas con el número cargado.
