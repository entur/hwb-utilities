# hwb-utilities
Utilities for [HWB](https://github.com/entur/hwb). 

 * DTOs from JSON Schema
 * Wrapped MQTT 3 Broker for testing
 * Wrapped MQTT 3 client

## APIs
DTOs from JSON schema files. 

### Java
Java class generation. Packages corresponds to directory directory.

## Update
Copy schema files from the HWB repository.

> find . -name "*.schema.json" -exec cp --parents \{\} ../hwb-pojo-generator/java/src/main/resources/json/ \;
> 

then remove `[` and `]` from folder names.