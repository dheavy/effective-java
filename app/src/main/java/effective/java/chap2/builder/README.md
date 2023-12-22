# Builder pattern

Good choice when designing classes whose constructors or static factories would have more than a handful of parameters, especially if many of the parameters are optional or of identical type.

Client code is much easier to read and write with builders than with _telescoping constructors_, and builders are much safer than _JavaBeans_.
