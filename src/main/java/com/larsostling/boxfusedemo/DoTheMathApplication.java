package com.larsostling.boxfusedemo;

import com.larsostling.boxfusedemo.health.DoTheMathHealthCheck;
import com.larsostling.boxfusedemo.resources.AddResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DoTheMathApplication extends Application<DoTheMathConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DoTheMathApplication().run(args);
    }

    @Override
    public String getName() {
        return "DoTheMath";
    }

    @Override
    public void initialize(final Bootstrap<DoTheMathConfiguration> bootstrap) {
        // Nothing to initialize yet
    }

    @Override
    public void run(final DoTheMathConfiguration configuration,
                    final Environment environment) {
        environment.healthChecks().register("default", new DoTheMathHealthCheck());
        environment.jersey().register(new AddResource());
    }

}
