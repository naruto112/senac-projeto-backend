# code-with-quarkus Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_** Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/code-with-quarkus-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A JAX-RS implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)


## Exemplo de código


```shell script
package org.acme;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.acme.*;
import io.agroal.api.AgroalDataSource;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {
    @Inject
    @Named("teste")
    AgroalDataSource dataSource;

    @GET
    public Response hello() {

        StringBuilder sb = new StringBuilder();
        
        
        List<Object> listObject = new ArrayList<Object>();

        try{
            // Connection connection = dataSource.getConnection();
            // PreparedStatement ps = 
            //     connection.prepareStatement("DECLARE V_ID PLS_INTEGER;BEGIN PCKG_CRUD.INSERE_DEPOS_PCKG('DEPOSITO 2', V_ID);END;");
            // ps.executeQuery();

            // Connection connection = dataSource.getConnection();
            // PreparedStatement ps = 
            //     connection.prepareStatement("SELECT * FROM SENAC.ES_DEPOSITOS");
            // ResultSet rs = ps.executeQuery();

            // while (rs.next()) {
            //     Deposito dps = new Deposito();
            //     dps.setNOM_DEPOS(rs.getString("NOM_DEPOS"));
            //     dps.setID(rs.getInt("ID"));
            //     listObject.add(dps);
            // }

            // Connection connection = dataSource.getConnection();
            // CallableStatement cs = connection.prepareCall("");


            return Response.ok(listObject).build();
            

        }catch(SQLException e) {
            return Response.ok(e.getErrorCode()).build();
        }

        
    }

    public static class Modelo {
        private final String messsage;


        public Modelo(String message) {
            this.messsage = message;
        }

        public String getMessage() {
            return this.messsage;
        }
    }


    @POST
    public Response examplePost(){
        return Response.ok(new Modelo("status atualizado")).build();
    }
}
```