With this solution, [`CanadianAddress`](src/csc301/builderExample/CanadianAddress.java) has only one responsibility - It represents a Canadian address.    
That's good, but we can notice another problem:
 * [`CanadianAddress`](src/csc301/builderExample/CanadianAddress.java)'s constructor takes 7 arguments.
 * Even worse, all arguments are of type String.
 * When we instantiate [`CanadianAddress`](src/csc301/builderExample/CanadianAddress.java), we will need to remember the order of the arguments, and get it right every time we change the code.
  
This problem is known as the __telescoping constructor__ anti-pattern.     
 * Slows down developers.
 * Makes the code error-prone.

----
[Step 3](https://github.com/csc301-fall2014/BuilderExample/tree/step3)
