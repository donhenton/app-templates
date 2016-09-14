
package com.dhenton9000.jersey.template.resources;

import com.dhenton9000.jersey.template.model.TemplateModel;
import com.dhenton9000.jersey.template.service.SpringService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * http://localhost:8090/<app-name>/demo/model
 * @author dhenton
 */
//@Component
@Path("demo")
@Api(value = "/demo")
public class DemoResource {

    @Autowired
     private SpringService springService;

    @GET
    @Path("/model")
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Get sample model")
    public TemplateModel getModel() {
        return springService.getTemplateModel();
        
    }

}
