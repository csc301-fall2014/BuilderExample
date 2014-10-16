BuilderExample
==============

This solution makes `CanadianAddressImpl` less cohesive, and is an example of __bad design__ (aka _anti-pattern_).    
`CanadianAddressImpl` has two responsibilities:
  * Represent a Canadian address.
  * Parse strings that represent Canadian addresses.
   
  
Parsing strings is not easy, because you never know what format to expect.    
Your peer evaluations from phase 1 are a great example - In one of the sections, about half the submissions had the wrong format, and required "special treatment".
