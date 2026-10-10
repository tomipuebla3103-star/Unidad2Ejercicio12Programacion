<img width="446" height="313" alt="WhatsApp Image 2026-10-01 at 14 27 56" src="https://github.com/user-attachments/assets/cda0b006-5eef-4c8d-ba4f-1cdcef365389" />

La Gestoría y el Registro de Propiedades

 Descripción
Este proyecto consiste en un sistema en Java que permite gestionar la transferencia de titularidad de un inmueble. El gestor inmobiliario envía una solicitud al registro de propiedad, que verifica la situación legal del inmueble antes de aprobar o rechazar la transferencia.

 Clases
- **Propiedad:** contiene la dirección, la tasación y el estado legal del inmueble.
- **Propietario:** guarda el DNI y el nombre completo del titular.
- **RegistroPropiedad:** recibe las solicitudes mediante el método `transferirInmueble(Propiedad p, Propietario nuevoTitular)` y verifica que la propiedad no tenga embargos antes de realizar la transferencia.
- **GestorInmobiliario:** actúa como intermediario y se encarga de enviar la solicitud de transferencia al registro.

 Funcionamiento
En el `main` se crean las propiedades, los propietarios, el registro y el gestor inmobiliario. Luego, se simulan dos operaciones: una transferencia exitosa y otra que es rechazada porque la propiedad tiene un embargo.

 Recorrido del mensaje
1. El programa crea los objetos necesarios para realizar las transferencias.
2. El gestor inmobiliario solicita el cambio de titularidad de una propiedad.
3. El gestor llama al método `transferirInmueble()` del registro y le envía la propiedad y los datos del nuevo titular.
4. El registro verifica el estado legal del inmueble.
5. Si la propiedad no tiene embargos, se actualiza el titular y se confirma la transferencia.
6. Si la propiedad tiene un embargo, la operación se rechaza y el titular no se modifica.
7. Finalmente, el programa muestra por consola el resultado de ambas operaciones.

Validaciones
El registro comprueba que la propiedad no tenga embargos antes de autorizar el cambio de titularidad. Esto evita realizar una transferencia cuando existe un impedimento legal.

Objetivo
Practicar la comunicación entre objetos en Java, el envío de objetos como parámetros, las llamadas a métodos y la aplicación de validaciones para aprobar o rechazar operaciones.
