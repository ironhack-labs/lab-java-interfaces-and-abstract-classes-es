# IntList

This project contains an interface `IntList` and two implementations: `IntArrayList` and `IntVector`.

`IntArrayList` stores integers in an array with a default length of 10. When the array is full, it creates a new array that is 50% larger, copies the elements from the old array to the new array, and adds the new element.

`IntVector` stores integers in an array with a default length of 20. When the array is full, it creates a new array that is twice the size of the old array, copies the elements from the old array to the new array, and adds the new element.

`IntArrayList` would be more efficient when the number of elements is small and the array needs to be resized frequently, because it resizes the array by 50% each time.

`IntVector` would be more efficient when the number of elements is large and the array needs to be resized infrequently, because it doubles the size of the array each time.