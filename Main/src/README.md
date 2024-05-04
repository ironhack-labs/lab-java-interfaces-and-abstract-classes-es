## IntArrayList vs. IntVector

IntArrayList es más eficiente cuando el tamaño esperado de la lista no es demasiado grande.
Es decir, si sabes que la lista no va a crecer demasiado y, por lo tanto, no ocupará mucha memoria.
Esto es porque IntArrayList utiliza una forma de crecimiento incremental, aumentando el 50% de su tamaño
solo cuando es necesario. 

IntVector es más eficiente cuando se espera que la lista crezca significativamente en tamaño. Es decir, cuando 
es necesario tener una estructura que pueda expandirse rápidamente para adaptarse a ese crecimiento. Duplicar el
tamaño del array puede ser mas eficiente en tiempo de ejecución y uso de memoria si la lista crece rápidamente.

