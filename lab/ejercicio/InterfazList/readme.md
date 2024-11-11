- IntArrayList.
IntArrayList comienza con un array de longitud 10. Cuando se añaden elementos, si el array está lleno, aumenta su tamaño en un 50%.

- Caso de Uso.
IntArrayList es más eficiente cuando se espera que el número total de elementos crezca moderadamente a lo largo del tiempo, ya que su estrategia de redimensionamiento conserva la memoria permitiendo un crecimiento controlado.

- IntVector.
IntVector comienza con un array de longitud 20. Cuando se añaden elementos, si el array está lleno, duplica su tamaño.

- Caso de Uso.
IntVector es más eficiente cuando se espera que el número total de elementos crezca rápidamente o de manera impredecible. Su estrategia de redimensionamiento minimiza la frecuencia de las operaciones de redimensionamiento, mejorando el rendimiento durante períodos de rápido crecimiento.