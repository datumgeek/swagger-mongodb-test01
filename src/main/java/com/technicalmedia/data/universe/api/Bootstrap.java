package com.technicalmedia.data.universe.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;
import io.swagger.models.auth.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger Server")
      .description("This is a sample Data Universe server.")
      .termsOfService("")
      .contact(new Contact()
        .email("datumgeek@yahoo.com"))
      .license(new License()
        .name("MIT")
        .url("http://unlicense.org"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
