
# `IntArrayList` vs `IntVector`

En este proyecto creamos dos clases para guardar una lista de números enteros: `IntArrayList` e `IntVector`. Cada una tiene su propia forma de hacer crecer el array interno, lo que las hace mejores para distintos tipos de situaciones.

## `IntArrayList`

**Descripción:** `IntArrayList` arranca con un array de tamaño 10. Cuando se queda sin espacio, crea otro array que es un 50% más grande que el anterior.

**Cuándo es más eficiente:**

- **Crecimiento Moderado:** Si no esperas que la lista crezca de golpe, sino más bien de a poco, `IntArrayList` es más eficiente porque aumenta el tamaño de manera gradual. Así se reduce la cantidad de veces que tiene que copiar los datos al aumentar el array.

- **Uso Inicial de Memoria Pequeño:** Si te preocupa usar mucha memoria desde el principio y prefieres que el crecimiento sea más controlado, `IntArrayList` es una buena opción, ya que no duplica el tamaño del array cada vez, solo lo aumenta en un 50%.


## `IntVector`

**Descripción:** `IntVector` arranca con un array de tamaño 20. Cuando se llena, crea otro array que es el doble del tamaño del anterior.

**Cuándo es más eficiente:**

- **Crecimiento Rápido:** Si esperas que la lista crezca mucho en poco tiempo, `IntVector` es más eficiente. Al duplicar el tamaño en cada redimensionamiento, reduce la cantidad de veces que tiene que copiar el array. Esto es útil si vas a agregar muchos elementos de golpe.

- **Número Alto de Operaciones:** Si la lista va a tener una gran cantidad de elementos y el rendimiento al agregar datos es importante, `IntVector` es ideal porque crece más rápido, minimizando las veces que se copia el array.



## Resumen

- **`IntArrayList`** es más adecuado cuando se espera que el crecimiento sea gradual y se desea un manejo de memoria más conservador.
- **`IntVector`** es más eficiente cuando se espera un crecimiento rápido y se desea reducir el número total de operaciones de redimensionamiento.

