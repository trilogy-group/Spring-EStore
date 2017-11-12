EStore app
====
A CRUD application to learn and implement spring concepts.

1. Spring Boot
2. IoC aka DI injection
3. Rest API documentation using Swagger
4. Spring Security  
	* Basic authentication  
	* Role base API authorization   


# Swagger configuration

- Swagger UI can be seen using this URL : [/estore/swagger-ui.html](http://localhost:8181/estore/swagger-ui.html)

# Spring Security

## Basic Authentication
API's can be accessed by providing Base64 encoded credentials with each request, using HTTP [Authorization] header.
Also need to exclude Swagger-UI resources from security configuration in order to be accessible without credentials.

## Protecting APIs against user roles
API's can be protected against user roles in WebSecurityConfiguration.java file.

> `http.antMatchers("/users/*").hasRole("USER")`
