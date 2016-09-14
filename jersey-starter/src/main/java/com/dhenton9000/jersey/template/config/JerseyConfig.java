/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhenton9000.jersey.template.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.dhenton9000.jersey.template.util.CORSResponseFilter;
import com.dhenton9000.jersey.template.util.LoggingResponseFilter;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.swagger.annotations.Info;
import io.swagger.jaxrs.config.BeanConfig;
 

//import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import org.glassfish.jersey.server.spring.SpringComponentProvider;

/**
 *
 * @author dhenton
 */

public class JerseyConfig extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
     
    public JerseyConfig() {
        register(RequestContextFilter.class);
        register(new JsonProvider());
        packages("com.dhenton9000.jersey.template.resources");
        packages("io.swagger.jaxrs.listing");
		
        register(LoggingResponseFilter.class);
        register(CORSResponseFilter.class);
        register(SpringComponentProvider.class);

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.2");
        beanConfig.setDescription("jersey starter");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8090");
        beanConfig.setBasePath("/jersey-starter"); //this adjusts swagger output by the web context
        beanConfig.setResourcePackage("io.swagger.resources");
        beanConfig.setResourcePackage("com.dhenton9000.jersey.template.resources");
        beanConfig.setScan(true);


    }

    public static class JsonProvider extends JacksonJaxbJsonProvider {

        public JsonProvider() {
            super();
            ObjectMapper mapper = new ObjectMapper();
            //set properties on the mapper here
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
            setMapper(mapper);
        }
    }
}
