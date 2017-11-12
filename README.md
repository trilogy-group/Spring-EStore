EStore app
============================
A small application to learn and implement spring concepts.


# Swagger configuration

- Swagger UI can be seen using this URL : http://localhost:8181/estore/swagger-ui.html

# Spring Security

- Basic Authentication
API's can be accessed by providing Base64 encoded credentials with each request, using HTTP [Authorization] header.
Also need to exclude Swagger-UI resources from security configuration in order to be accessible without credentials.
