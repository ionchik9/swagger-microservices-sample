package com.ion.swagger.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class RestDocProvider implements SwaggerResourcesProvider {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private ServiceConfig serviceConfig;


    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        discoveryClient
                .getServices()
                .forEach(serviceId ->
                        resources.add(swaggerResource(serviceId, resolveUri(serviceId), serviceConfig.getVersion())));

        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }

    private String resolveUri(String serviceId){
       return serviceConfig
               .getApiGatewayPublicUrl() +
               serviceConfig
                       .getJsonUrl()
                       .replaceAll("servicename", serviceId);
    }
}
