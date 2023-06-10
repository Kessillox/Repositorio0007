# Sprint Final Módulo 4

### Equipo: Potrero

### Integrantes: Cristian Durán - Ignacio Aránguiz - Iván Becerra

#### Creación de sistema para la mejora en la gestión, control y
#### disponibilidad de información en una empresa con sus clientes.


El sistema de código para la creación del programa cuenta con 3 Packages:

1. controllers para la validación de almacenamiento Administrativo, Capacitacion,
Cliente y Profesional; 
2. El paquete "models" contiene 10 clases que responden a las distintas 
necesidades de la empresa. Se crea una clase base llamada "Usuario" que 
se extiende a 3 clases hijas: "Administrativo", "Profesional" y "Cliente". 
Además, se crearon otras clases como "Contenedor" para el almacenamiento 
de usuarios en 2 listas: asesorias y capacitaciones. También se incluyen 
las clases "Accidente", "Listado", "Revision" y "VisitaTerreno", las cuales 
fueron creadas para responder a necesidades anteriores de la empresa, pero
actualmente no están funcionales para el menú principal.
3. interfaces, para la creación de la interface (IAsesoria), donde se encuentra 
el método analizarUsuario(), que se utiliza para imprimir los datos del Usuario 
y se sobrescribe en el tipo de usuario -clases hijas-, para imprimir los atributos
propios de un objeto.