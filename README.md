# backend


Backend of an app made in flutter, it retrieves the data from a MYSQL Database following the field strucutre: id, email, password.

## Getting Started

The structure of this project is defined in /src by.
  
  MainApplication: Runs the Spring Application declaring the port to use 8090 and following the 
  
  Product: Maps the Java object declared in the class to relational database tables.
  
  LoginController:  defines a Spring REST controller that handles HTTP POST requests to the "/login" endpoint
  
  ProductController:  defines a Spring REST controller that handles HTTP POST, GET, PUT, DELETE requests to the "/login" endpoint
  
  ProductRepository:  Defines a nterface that extends the JpaRepository interface with a method to find by Email.
  
  ResourceNotFoundException:  Defines a custom exception class named ResourceNotFoundException that extends the RuntimeException class
For help getting started with Flutter development, view the
[online documentation](https://docs.flutter.dev/), which offers tutorials,
samples, guidance on mobile development, and a full API reference.
