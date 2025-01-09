
# MapStruct Example

This project demonstrates the use of [MapStruct](https://mapstruct.org/), a Java annotation processor for generating type-safe bean mapping classes.

## Overview

MapStruct simplifies the process of mapping between different Java bean types by generating the necessary code at compile time. This approach enhances performance and reduces the need for manual mapping code.

## Features

- **Automatic Code Generation**: Eliminates the need for manual mapping code by generating mappings during compilation.
- **Type Safety**: Ensures that mappings are checked at compile time, reducing runtime errors.
- **Performance**: Generates efficient mapping code without the overhead of reflection.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 23
- Maven or Gradle build tool

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/vikasjha08/MapStruct-Example.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd MapStruct-Example
   ```

3. **Build the project**:

    - **Using Maven**:

      ```bash
      mvn clean install
      ```

    - **Using Gradle**:

      ```bash
      ./gradlew clean build
      ```

### Usage

After building the project, you can perform the following actions:

1. **Explore the Generated Mapping Classes**:  
   The generated classes can be found in the `target` or `build` directory, depending on your build tool.

2. **Run Test Cases**:  
   Execute the included test cases to see examples of how MapStruct handles different types of mappings.
    ```bash
      mvn test
    ```


3. **Create Your Own Mappings**:  
   Modify the existing examples or create your own source and target classes. Annotate the interface with `@Mapper` and provide method definitions to see MapStruct in action.

## Examples

This project includes examples demonstrating:

- **Basic Mappings**: Simple mappings between source and target objects.
- **Nested Bean Mappings**: Handling mappings for nested objects.
- **Custom Mappings**: Defining custom mapping logic for specific scenarios.

For detailed documentation, visit [Baeldung's Guide to MapStruct](https://www.baeldung.com/mapstruct).

## Resources

Below are helpful resources for learning and using MapStruct effectively:

- **MapStruct Official Documentation**:  
  Comprehensive documentation can be found [here](https://mapstruct.org/documentation/stable/reference/html/).

- **Baeldung's Guide to MapStruct**:  
  A beginner-friendly guide is available [here](https://www.baeldung.com/mapstruct).

- **MapStruct GitHub Repository**:  
  Check out the official GitHub repository for updates and community discussions [here](https://github.com/mapstruct/mapstruct).


## Acknowledgments

Special thanks to the MapStruct community and contributors for their continuous efforts in maintaining and improving the library.
