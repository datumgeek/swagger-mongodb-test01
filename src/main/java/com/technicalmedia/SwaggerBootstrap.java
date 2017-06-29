package com.technicalmedia;

import io.swagger.jaxrs.config.BeanConfig;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class SwaggerBootstrap extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setDescription("Welcome to the Data Universe !! :) :)");
        beanConfig.setTitle("Data Universe API");
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/rest");
        beanConfig.setResourcePackage(
                "com.technicalmedia.data.universe.api");
        beanConfig.setFilterClass(
                "com.technicalmedia.AllAuthorizationFilterImpl");
        beanConfig.setScan(true);
    }
}
