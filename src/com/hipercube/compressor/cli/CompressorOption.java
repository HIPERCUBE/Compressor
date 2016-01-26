package com.hipercube.compressor.cli;

/**
 * Copyright (c) 1/26/16 Joowon Ryoo
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
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
    Repeat,

    /**
     * [Option]
     * Cycle (-c, -cycle)
     * <p>
     * operation cycle (milli-second)
     */
    Cycle,

    /**
     * [Help]
     * Help (-h, -help)
     * <p>
     * show Compressor helps
     */
    Help,
}
