package com.hipercube.compressor.cli;

import org.apache.commons.cli.*;

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
public class CompressorClParser extends DefaultParser {
    private final Options options = new Options();

    /**
     * Constructor
     */
    public CompressorClParser() {
        // Add Options
        options.addOption("l", "location", true, "input directory which original file located");
        options.addOption("o", "option", true, "output directory which zipped file located");
        options.addOption("r", "repeat", true, "whether to continue to work");
        options.addOption("c", "cycle", true, "operation cycle (milli-second)");
        options.addOption("h", "help", false, "show Compressor helps");
    }

    /**
     * process argument
     *
     * @param args arguments
     * @return result is success
     */
    public final boolean process(String[] args) {
        try {
            CommandLine commandLine = parse(options, args);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Error occurred in parsing arguments\nCheck your arguments\n");
            showUsage();
            return false;
        }
        return true;
    }

    /**
     * show how to use Compressor
     */
    private void showUsage() {

    }
}