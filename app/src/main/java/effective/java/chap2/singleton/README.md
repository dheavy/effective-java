# Singleton

Enums ensure a single instance by design and handle thread safety and serialization automatically.

- INSTANCE is the only enum constant, representing the single instance of DatabaseConnectionManager.

- The constructor DatabaseConnectionManager() is private (like all enum constructors) and is called once to initialize INSTANCE.
