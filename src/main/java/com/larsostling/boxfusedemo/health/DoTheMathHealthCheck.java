package com.larsostling.boxfusedemo.health;

import com.codahale.metrics.health.HealthCheck;

public class DoTheMathHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
