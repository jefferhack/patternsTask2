# Integrantes del equipo

- Juan David Marulanda
- Jefferson Morales Gonzalez
- Jhan Castro Vargas
- Laura Sofia Guio Camargo
- Natacha Castrillon
- Ruben Dario Suarez Amaya

## Problema vs patron seleccionado:

- ### Problema 1
  Imagina que estás desarrollando un videojuego de aventuras en el que los jugadores pueden controlar a un grupo de héroes con habilidades únicas. Necesitas implementar un sistema de clonación de personajes. Los jugadores deben poder clonar y personalizar héroes existentes para formar equipos estratégicos.

  Requerimientos del sistema:
    1. Los jugadores deben poder clonar a los héroes existentes en el juego para crear nuevos personajes con habilidades idénticas.
    2. Cada héroe tiene un conjunto único de habilidades especiales que incluyen ataques, defensas y habilidades mágicas.
    3. Los héroes pueden pertenecer a diferentes clases, como guerreros, magos o arqueros, y cada clase tiene su propio conjunto de habilidades
    4. Los jugadores deben poder personalizar los nombres y aspectos visuales de los héroes clonados después de la clonación.
    5. Los héroes deben mantener un registro de su experiencia, nivel y puntos de habilidad, y esta información debe copiarse correctamente al clonar un héroe.
    6. El sistema debe ser eficiente y permitir la creación de múltiples clones de un mismo héroe sin duplicar innecesariamente los datos.
  
  ### Patrón selecionado: Prototype 

  - > Se selecciona este patrón ya que es un patrón creacional que permite copiar objetos existentes sin que el código dependa de sus clases, utilizando una interfaz que permita su clonación, adicionalmente teniendo un método de clonación implementado en todas las clases. 

  ### Explicación: 
  Basados en la información entregada por el problema se detecta que la información clave del mismo es la necesidad de clonar objetos con sus diferentes caracteristicas y la posibilidad de agregar otros atributos a los objetos clonados. Para el proyecto se genera las siguientes interfaces y clases: 

    * *Heroe:* Define el método de clone que utilizará el resto de las clases
    * *Guerrero, Arquero, Mago:* Clase extendida de heroe que espefica las particularidades de los heros
    * *Habilidad:* Representa las habilidades específicas de un héroe.
    * *AspectoVisual:* Representa los aspectos visuales específicos de un héroe.
    * *JuegoAventuras:* Contiene el main del proyecto donde se puede crear un héroe original y clonarlos con ciertas caracteristicas. 

  ### Diagrama UML
  
```mermaid

  classDiagram
direction BT
class Arquero {
  + Arquero(String, List~Habilidad~, int, int, AspectoVisual) 
}
class AspectoVisual {
  + AspectoVisual() 
}
class Guerrero {
  + Guerrero(String, List~Habilidad~, int, int, AspectoVisual) 
}
class Habilidad {
  + Habilidad(String) 
}
class Heroe {
  + Heroe(String, String, List~Habilidad~, int, int, AspectoVisual) 
}
class JuegoAventuras {
  + JuegoAventuras() 
}
class Mago {
  + Mago(String, List~Habilidad~, int, int, AspectoVisual) 
}
class Prototype {
<<Interface>>

}

Arquero  -->  Heroe 
Guerrero  -->  Heroe 
Heroe  ..>  Prototype 
Mago  -->  Heroe 

``` 

- ### Problema 2

  La empresa está desarrollando una aplicación de mensajería en tiempo real que permite a los usuarios comunicarse desde
  múltiples dispositivos. Cada vez que un usuario recibe un nuevo mensaje, todos los dispositivos del usuario deben ser
  notificados para que el mensaje se muestre en cada uno de ellos. Para mantener la flexibilidad y desacoplar la lógica
  de notificación de la aplicación principal.

#### El patrón que escoja deberá permitir:

1. Notificación en Tiempo Real: Cada dispositivo del usuario debe recibir una notificación cuando llegue un nuevo
   mensaje.
2. Desacoplamiento: La aplicación de mensajería debe poder notificar a cualquier número de dispositivos sin saber
   detalles específicos sobre cada uno de ellos.
3. Flexibilidad: Los dispositivos pueden ser añadidos o eliminados en tiempo de ejecución sin necesidad de modificar la
   lógica principal de la aplicación.

### Patron seleccionado : Observer

- > Observer es un patrón de diseño de comportamiento que te permite definir un mecanismo de suscripción para notificar
  a varios objetos sobre cualquier evento que le suceda al objeto que están observando, que en este caso es objeto de
  observacion es el mensaje.

### Explicación:

- Basados en el planteamiento del problema, detectamos dos puntos claves importantes:> Tiempo Real / Recibe un nuevo
  mensaje.

  > Esto quiere decir que un evento debe disparar una acción en tiempo real, este evento sería la recepción de un nuevo
  mensaje y la acción es la notificación a los diferentes dispositivos por lo cual debe existir un observador que a la
  recepción del mensaje dispare el envío de notificaciones, esta básicamente es la problemática que resuelve el patrón
  observador.


* Interfaz Observer: Define el método update que será llamado por el sujeto cuando hay un nuevo mensaje.
* Interfaz Subject: Define los métodos para registrar, eliminar y notificar a los observadores.
* Clase MessageService: Implementa la interfaz Subject y gestiona la lista de observadores. Cuando recibe un nuevo
  mensaje, notifica a todos los observadores.
* Clases MobileDevice y TabletDevice: Implementan la interfaz Observer y definen cómo deben reaccionar los dispositivos
  cuando reciben un nuevo mensaje.
* Clase Main: Prueba la implementación del patrón Observer registrando varios dispositivos, enviando mensajes y
  demostrando la flexibilidad de agregar o eliminar dispositivos en tiempo de ejecución.

Este diseño asegura notificaciones en tiempo real, desacoplamiento y flexibilidad para añadir o eliminar dispositivos
sin modificar la lógica principal de la aplicación.

### Diagrama UML :

```mermaid
classDiagram
direction BT
class Main {
  + Main() 
  + main(String[]) void
}
class MessageService {
  + MessageService() 
  + registerObserver(Observer) void
  + removeObserver(Observer) void
  + receiveMessage(String) void
  + notifyObservers(String) void
}
class MobileDevice {
  + MobileDevice(String) 
  + update(String) void
}
class Observer {
<<Interface>>
  + update(String) void
}
class Subject {
<<Interface>>
  + registerObserver(Observer) void
  + notifyObservers(String) void
  + removeObserver(Observer) void
}
class TabletDevice {
  + TabletDevice(String) 
  + update(String) void
}

Main  ..>  MessageService : «create»
Main  ..>  MobileDevice : «create»
Main  ..>  TabletDevice : «create»
MessageService "1" *--> "observers *" Observer 
MessageService  ..>  Subject 
MobileDevice  ..>  Observer 
TabletDevice  ..>  Observer 

```

- ### Problema 3: Template (ninguno le pego)
    - Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase
      pero permite que las subclases sobrescriban pasos del algoritmo sin cambiar su estructura.

- ### Problema 4

  Imagina un sistema de gestión de tareas en el que los usuarios pueden crear, editar,
  eliminar y completar tareas. Cada acción realizada por el usuario corresponde a una acción
  que debe ser ejecutada. Además, es importante mantener un registro de todas las acciones
  realizadas para permitir la reversión de las mismas si es necesario.

  #### El patrón que escoja deberá permitir:

    1. Desacopla el invocador de los objetos que realizan las acciones.
    2. Permite la extensión de nuevas operaciones sin modificar el código existente.
    3. Facilita el registro de acciones para realizar operaciones de reversión.

### Patron seleccionado : Command

> - Command es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente que contiene
    toda la información sobre la solicitud. Esta transformación te permite parametrizar los métodos con diferentes
    solicitudes, retrasar o poner en cola la ejecución de una solicitud y soportar operaciones que no se pueden
    realizar.

### Explicación:

> - En este caso se tuvo en cuenta el requerimiento de las diferentes acciones que se pueden realizar, para esto vemos
    importante desacoplar cada acción del invocador y esto es algo que se puede resolver segregando los comandos en
    clases command.
> - Commant tambien nos permite agregar nuevos requerimientos de forma secilla asegurando la extensibilidad.
> - Finalmente el patron command nos permite tener un registro que nos ayuda a rastrear el historial de operaciones
    ejecutadas y hace posible revertir una operación si es necesario.

### Diagrama UML :

```mermaid
classDiagram
direction BT
class Command {
<<Interface>>
  + execute() void
  + undo() void
}
class CommandHistory {
  + CommandHistory() 
  + execute(Command) void
  + undo() void
}
class CompleteTaskCommand {
  + CompleteTaskCommand(Task) 
  + execute() void
  + undo() void
}
class CreateTaskCommand {
  + CreateTaskCommand(TaskManager, Task) 
  + execute() void
  + undo() void
}
class DeleteTaskCommand {
  + DeleteTaskCommand(TaskManager, Task) 
  + execute() void
  + undo() void
}
class EditTaskCommand {
  + EditTaskCommand(TaskManager, Task, Task) 
  + execute() void
  + undo() void
}
class Task {
  + Task(String) 
  - boolean completed
  - String name
  + toString() String
   String name
   boolean completed
}
class TaskManager {
  + TaskManager() 
  - List~Task~ tasks
  + updateTask(Task, Task) void
  + removeTask(Task) void
  + addTask(Task) void
   List~Task~ tasks
}
class TaskManagerApp {
  + TaskManagerApp() 
  + listTasks() void
  + main(String[]) void
  + deleteTask(Task) void
  + editTask(Task, String) void
  + completeTask(Task) void
  + undoLastAction() void
  + createTask(String) void
}

CompleteTaskCommand  ..>  Command 
CreateTaskCommand  ..>  Command 
DeleteTaskCommand  ..>  Command 
EditTaskCommand  ..>  Command 

```

- ### Problema 5: Decorator
    - Decorator es un patrón de diseño estructural que te permite añadir funcionalidades a objetos colocando estos
      objetos dentro de objetos encapsuladores especiales que contienen estas funcionalidades