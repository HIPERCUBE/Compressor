package com.hipercube.compressor.cli;

/**
 * Created by HIPERCUBE on 1/26/16.
 */
public enum CompressorOption {
    /**
     * [Necessary]
     * Location (-l, -location)
     * <p>
     * input directory which original file located
     */
    Location,

    /**
     * [Option]
     * Output (-o, -output)
     * <p>
     * output directory which zipped file located
     */
    Output,

    /**
     * [Option]
     * Repeat (-r, -repeat)
     * <p>
     * whether to continue to work
     */
    While,

    /**
     * [Option]
     * Cycle (-c, -cycle)
     * <p>
     * operation cycle (milli-second)
     */
    Cycle,
}
