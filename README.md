This solution is the __bad example__. It makes the [`CanadianAddress`](src/csc301/builderExample/CanadianAddress.java) class less cohesive, by giving it two different responsibilities:
  * Represent a Canadian address.
  * Parse strings that represent Canadian addresses.
   
  
Parsing strings is not easy, because you never know what format to expect.    
Your peer evaluations from phase 1 are a great example - In one of the sections, about half the submissions had the wrong format, and required "special treatment".
