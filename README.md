BuilderExample
==============

We "solved" the telescoping constructor problem by
 * Providing only the default constructor (i.e. no-argument constructor).
 * Providing setters for all properties.

The problem is that we made it too easy for other developers/classes to create invalid/illegal instances (e.g. An address that is missing the street name).

We want to ensure that it is impossible to create invalid/illegal `CanadianAddressImpl` instances.     

This requirement is easy to satisfy with our previous solution (the telescoping constructor) - If the arguments to the constructor are invalid, we throw an exception.
