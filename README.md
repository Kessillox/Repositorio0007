# Repositorio0007

RAMA de **Gustavo Vargas P** (_StudioMontt_), para los ejercicios
individuales de Talento Digital, curso Java, desde el N°25 en adelante.

### Ejercicio N°25:

El ejercicio solicita crear una clase utilizando **colaboración y composición**. Se plantea un problema específico que
consiste en crear una clase para representar a un trabajador de una empresa corredora de propiedades, con atributos como
nombres, apellidos, RUN, teléfono y edad. Se requiere que la clase tenga métodos como `toString()`, `nombreCompleto()` y
`descomponerRun()`. Además, se indica que la clase no debe tener un método `main()`.

El resultado fue crear un código con una clase llamada "Trabajador", que tiene cinco atributos: `nombres`, `apellidos`,
`run`, `telefono` y `edad`. También tiene un constructor vacío y uno con parámetros para inicializar los atributos.
Además, tiene métodos `getter` y `setter` para cada atributo, un método `toString` para imprimir los valores de los
atributos, un método `nombreCompleto` para concatenar el nombre y apellidos del trabajador y un método `descomponerRun`
para obtener los números del RUN antes del guión como un entero. El código utiliza expresiones ternarias y el método
`parseInt` para convertir cadenas en enteros.

### Ejercicio N°27:

El ejercicio (continuación del anterior) solicita crear una nueva clase que represente a una carga familiar de un
trabajador, considerando sus _Constructores_, `getter` y `setter`, y `toString`. Además de mantener un encapsulamiento
de las clases.

En resumen, la clase `CargaFamiliar` permite crear instancias de cargas familiares asociadas a un trabajador, y
proporciona métodos para acceder y modificar sus atributos, así como mostrar una representación en cadena de la carga
familiar. Tiene atributos privados que representan los datos de la carga familiar, como el RUN de la carga (`runCarga`),
nombres, apellidos, RUN del familiar (`runFamiliar`), parentesco y edad.

Además, se agrega a la clase principal (Main), un código donde se agregan datos al constructor de la clase `Trabajador` 
y la clase `CargaFamiliar`, solicitando en esta última al usuario que ingrese el parentesco de la carga familiar 
mediante un menú que muestra tres opciones: 1) Cónyuge, 2) Hijo/a y 3) Otro. Luego se utiliza un `switch` para asignar 
un valor numérico a la variable `parentesco` dependiendo de la opción seleccionada por el usuario. Si el usuario ingresa
una opción no válida, se asigna el valor 0 a `parentesco`. Después se crea una instancia de `CargaFamiliar` con los 
datos ingresados y se muestra la representación en cadena de la carga familiar utilizando el método `toString`.


### Ejercicio N°29:

Se solicita crear un **diagrama de clases** que represente a las entidades Trabajador, CargaFamiliar, y dos clases 
nuevas: Dirección y Estudio:

Dirección
- Identificador de la dirección
- Calle
- Número
- Sector
- Comuna

Estudio
- Institución
- Carrera
- Año inicio
- Año fin

Además, debe considerar lo siguiente:
- Un trabajador está asociado solo a una dirección, o bien a ninguna.
- Un trabajador puede tener registrados al menos un estudio, sin límite de registro.

![Diagrama de Clases](/src/TI-29-GustavoV.png)


### Ejercicio N°31:

Este ejercicio es la continuación del N°29; se solicita agregar el método `mostrarDatos()` en la clase _Trabajador_, el 
cual debe mostrar el `telefono` y `edad` del trabajador.

Además, se sabe que existen _tres tipos_ de trabajadores:
- **Honorario:** respecto de este tipo de trabajadores, se desea saber su `giro` y `año de iniciación` de actividades.
- **Contratado:** de esta categoría se debe conocer su `fecha de ingreso` y `salario mensual`.
- **Eventual:** de este tipo de trabajador se interesa saber su `disponibilidad` y `correo electrónico`.

Las tres clases deben extender la clase `Trabajador` y deben incluir sus propios atributos, accesores, mutadores y el 
método `toString()`.

Además, cada clase hija debe implementar el método `mostrarDatos()`, sobrescribiendo el comportamiento establecido en 
la clase padre.


### Ejercicio N°33:

Para este nuevo ejercicio, se necesita crear una clase padre llamada `Empleado`, de las cuales derivaran dos tipos:
`Vendedor` y `Repartidor`.

1. Todo **empleado** tendrá los siguientes atributos: `nombre`, `apellido`, `edad` y `salario`.
1. Además, si este **empleado** tiene más de 40 años se le dará un bono adicional de `100.000` pesos.
1. En cuanto al **vendedor**, se desea saber su `fecha de inicio` en la empresa. En lo que respecta al **repartidor**, 
es necesario saber su `disponibilidad horaria` (texto).
1. A los **vendedores**, se les asignará un bono adicional de `50.000`, y en el caso de los **repartidores**, quienes 
tengan menos de 30 años se les asignará un bono adicional de `15.000`.
