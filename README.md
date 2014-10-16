Here is what we did:
 1. We made `Builder` a public static class inside [`CanadianAddress`](src/csc301/builderExample/CanadianAddress.java).    
    * The same way we define classes inside packages, we can define static classes inside other classes.    
    * We refer to the class as `CanadianAddress.Builder`.
    * `CanadianAddress` and `CanadianAddress.Builder` can access each other's private methods, constructors, and instance variables.
 2. We change the constructor of `CanadianAddress` to be private, and take a single argument of type `CanadianAddress.Builder`.
 
You can see how the builder is used in [Main.java](src/csc301/builderExample/Main.java) (almost the same as before, we only changed the name of the class to be `CanadianAddress.Builder`).

Notice that:
 * Other classes cannot create new instances of `CanadianAddress`, because its constructor is private.
 * The only way to get a new `CanadianAddress` instance is by calling the builder's `build` method.
 * We can validate the arguments inside the `build` method, and prevent invalid/illegal `CanadianAddress` instances from being created.
 
