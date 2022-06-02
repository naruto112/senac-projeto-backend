package br.com.estoque.infra.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        
        info = @Info(
                title = "SENAC PROJETO BACKEND",
                version = "0.0.1",
                license = @License(
                        name = "MIT",
                        url = "https://opensource.org/licenses/MIT"))
)
public class SwaggerConfig extends Application {

}