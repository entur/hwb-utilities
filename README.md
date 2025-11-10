# hwb-utilities
Utilities forHWB JSON schema files.

## APIs
DTOs from JSON schema. 

### Java
Java class generation. Packages corresponds to directory directory.

## Update
Copy schema files from the HWB repository.

> find . -name "*.schema.json" -exec cp --parents \{\} ../hwb-pojo-generator/java/src/main/resources/json/ \;
> 

then remove `[` and `]` from folder names.