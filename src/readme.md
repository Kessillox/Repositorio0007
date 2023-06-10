# Sprint Final Módulo 4

### Equipo: Potrero

### Integrantes: Cristian Durán - Ignacio Aránguiz - Iván Becerra

#### Creación de sistema para la mejora en la gestión, control y
#### disponibilidad de información en una empresa con sus clientes.


El sistema de código para la creación del programa cuenta con 3 packages,
1. controllers para la validación de Administrativo, Capacitacion,
Cliente y Profesional; 
2. models para la creación de 10 clases que gracias a su funcionalidad 
permitiran responder a las distintas necesidades de la empresa. Creando 
una clase base (Usuario) que se extiende a 3 clases hijas: Administrativo, 
Profesional y Cliente. Otras clases, como contenedor se crearon para el 
almacenamiento de usuarios distribuido en 2 listas: asesorias y capacitaciones;
y clases como Accidente, Listado, Revision y VisitaTerreno que serviran para
utilidades próximas de la empresa.
3. interfaces, para la creación de la interface (IAsesoria), donde se encuentra 
el método analizarUsuario() para llamar al toString de Cliente, Profesional y
Administrativo.