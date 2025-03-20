Ejercicio 1: Red social

Se quiere programar en objetos una versión simplificada de una red social parecida a Twitter. Este servicio debe permitir a los usuarios registrados postear y leer mensajes de hasta 280 caracteres. Ud. debe modelar e implementar parte del sistema donde nos interesa que quede claro lo siguiente:
  - Cada usuario conoce todos los Tweets que hizo.
  - Un tweet puede ser re-tweet de otro, y este tweet debe conocer a su tweet de origen.
  - Twitter debe conocer a todos los usuarios del sistema.
  - Los tweets de un usuario se deben eliminar cuando el usuario es eliminado. No existen tweets no referenciados por un usuario.
  - Los usuarios se identifican por su screenName.
  - No se pueden agregar dos usuarios con el mismo screenName.
  - Los tweets deben tener un texto de 1 carácter como mínimo y 280 caracteres como máximo.
  - Un re-tweet no tiene texto adicional.

Tareas:

Su tarea es diseñar y programar en Java lo que sea necesario para ofrecer la funcionalidad antes descrita. Se espera que entregue los siguientes productos.

Diagrama de clases UML.
Implementación en Java de la funcionalidad requerida.
Implementar los tests (JUnit) que considere necesarios.
