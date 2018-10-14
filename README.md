# DepositosSubterraneos

Contribución de Gustavo Dejean y Laura Rivero

# Descripción del problema

Se tiene un conjunto de depósitos subterráneos para el almacenamiento de petróleo. Cada depósito tiene una forma de prisma rectangular,
siendo la superficie de su base si , y su profundidad pi determinadas. Todos los depósitos tienen su techo al mismo nivel y es 
coincidente con la superficie del suelo, pero la profundidad pi puede variar de un depósito a otro.

Los depósitos están comunicados por un sistema de cañerías cuya extensión y volumen es completamente despreciable y no debe considerarse para
el análisis del presente problema. Sin embargo debe tenerse en cuenta que las cañerías salen desde la base de todos los depósitos hacia 
una cañería central desde la cual ingresa el fluido al sistema de depósitos. Esto puede verse en la figura. Cuando se procede al 
vertido de combustible proveniente de los pozos petroleros cercanos, el nivel del líquido comienza a elevarse, comenzando por el o los 
depósitos más profundos, luego, cuando el nivel del fluido alcanza el piso de algún otro deposito, gracias al sistema de cañerías, \
comienza el llenado de/los nuevo/s depósito/s.

En el caso de que algún depósito se encuentre vacío en un momento dado, éste siempre comenzará a llenarse cuando el nivel del fluido 
supere el nivel de su piso. De esta manera se mantiene el mismo nivel en todos los depósitos a medida que se van superando los niveles 
de sus pisos. En consecuencia, un depósito se considera en uso cuando el nivel del petróleo supera el nivel de su fondo.

Se desea saber: Dado un volumen determinado de petróleo V, si el sistema es capaz de almacenarlo o habrá desbordamiento.

a) En caso de desbordamiento además se quiere saber el volumen sobrante.

b) En caso de no existir desbordamiento, se quiere saber: la cantidad de depósitos utilizados y la longitud que hay desde la 
superficie del suelo al nivel del fluido en el sistema de depósitos. 

# Datos de entrada

Se recibe un archivo depositos.in del directorio actual, que contiene:

Primera línea: La cantidad n de depósitos existentes en el sistema ( 1 ≤ n ≤ 500 ).

Cada una de las siguientes n líneas tiene las dimensiones de cada depósito: la superficie de la base si, expresada en metros cuadrados 
y profundidad pi. ( 1 ≤ pi ≤ 200; 1 ≤ si ≤ 400); ambos valores separados por un blanco.

Los depósitos vienen ordenados en forma monótona descendente según su profundidad (primero viene el depósito más profundo y en último 
lugar está el depósito menos profundo).

La última línea tiene el volumen V a ingresar al sistema, expresado en m³ ( 0 < V < 1.000.000 ). Todas las medidas siempre están dadas 
en números enteros.

# Datos de salida
El programa debe generar, en el directorio actual, el archivo depositos.out con:

a) En el caso de existir desborde: Una única línea indicando: “Rebasan: ” seguido de la cantidad en metros cúbicos que rebasarían.

b) En el caso de no existir desborde: 

Primera línea: la cantidad de depósitos utilizados para almacenar el fluido.
Segunda línea: la profundidad desde la superficie del suelo hasta el nivel del fluido expresada en metros y truncando los decimales.

Ejemplo
Si el archivo depositos.in contiene:

3

12 3

8 2

6 1

60

El archivo depositos.out será

Rebasan: 2

En cambio si en la última línea, en vez de 60 pusiéramos 30, el depositos.out seria:

2

1 
