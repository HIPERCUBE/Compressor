package com.hipercube.compressor.cli;

/**
 * Created by HIPERCUBE on 1/26/16.
 */
public enum CompressorOption {
    /**
     * [Necessary]
     * Location ( , -l, -L, -location, -Location)
     * <p>
     * input directory which original file located
     */
    Location,

    /**
     * [Option]
     * Output (-o, -O, -output, -Output)
     * <p>
     * output directory which zipped file located
     */
    Output,

    /**
     * [Option]
     * While (-w, -W, -while, -While)
     * <p>
     * whether to continue to work
     */
    While,

    /**
     * [Option]
     * Cycle (-c, -C, -cycle, -Cycle)
     * <p>
     * operation cycle (milli-second)
     */
    Cycle,
}
