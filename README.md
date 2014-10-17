We "solved" the telescoping constructor problem by
 * Providing a default constructor (i.e. a constructor with 0 arguments).
 * Providing setters for all properties.

The problem is that we made it way too easy for other developers/classes to (accidently) create invalid/illegal instances (e.g. an address that is missing the street name).

We want to ensure that it is impossible to create invalid/illegal [`CanadianAddress`](src/csc301/builderExample/CanadianAddress.java) instances.     

Notice that this requirement is easy to satisfy with [our previous solution](https://github.com/csc301-fall2014/BuilderExample/blob/step2/src/csc301/builderExample/CanadianAddress.java) - If the arguments to the constructor are invalid, we throw an exception.
