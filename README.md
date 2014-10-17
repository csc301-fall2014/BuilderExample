We will solve our problem like we usually do - Introduce a middleman.

Our middleman is the [CanadianAddressBuilder](src/csc301/builderExample/CanadianAddressBuilder.java) class, which breaks the task (of instantiating a `CanadianAddress`) into two parts:
 1. Collect all the arguments.
 2. Create an instance of `CanadianAddress`.

Essentially, the builder is just a "container" for the `CanadianAddress` constructor arguments.    

You can see how the builder is used in [Main.java](src/csc301/builderExample/Main.java).    

Notice that our implementation of [CanadianAddressBuilder](src/csc301/builderExample/CanadianAddressBuilder.java) allowed us to chain the methods in [Main.java](src/csc301/builderExample/Main.java), and resulted in nicer code.

That's great, but there is still a __major problem__ with this implementation - Developers/classes can still create `CanadianAddress` instances directly (using `new CanadianAddress()`).

----
[Step 5](https://github.com/csc301-fall2014/BuilderExample/tree/step5)
