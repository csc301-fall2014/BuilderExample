BuilderExample
==============

With this solution, `CanadianAddressImpl` has only one responsibility - It represents a Canadian address.    
That's good, but we can notice another problem:
 * `CanadianAddressImpl`'s constructor takes 7 arguments.
 * Even worse, all arguments are of type String.
 * When we instantiate `CanadianAddressImpl`, we will need to remember the order of the arguments, and get them right.
  
 
This problem is known as the _telescoping constructor anti-pattern_.     
 * Slows down developers.
 * Makes the code error-prone.     
   Especially, when you need to change a class with a telescoping constructor.

