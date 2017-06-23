package com.google.monitoring.runtime.instrumentation.sample;

import com.google.monitoring.runtime.instrumentation.AllocationInstrumenter;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by jmaloney on 6/1/17.
 */
public class RandomSampler extends SampleStrategy {

    private static final int VARIABLE = Integer.MIN_VALUE + AllocationInstrumenter.variableWidth;

    @Override
    public boolean canSample() {
        return ThreadLocalRandom.current().nextInt() < VARIABLE;
    }
}
