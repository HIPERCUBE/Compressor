package com.hipercube.compressor.cli;

/**
 * Created by HIPERCUBE on 1/26/16.
 */
public enum CompressorOption {
    /**
     * [Necessary]
     * Location
     * <p>
     * input directory which original file located
     */
    l, L, location, Location,

    /**
     * [Option]
     * Output
     * <p>
     * output directory which zipped file located
     */
    o, O, output, Output,

    /**
     * [Option]
     * Repeat
     * <p>
     * whether to continue to work
     */
    r, R, repeat, Repeat,

    /**
     * [Option]
     * Cycle
     * <p>
     * operation cycle (milli-second)
     */
    c, C, cycle, Cycle,
}
