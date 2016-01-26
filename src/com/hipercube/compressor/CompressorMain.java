package com.hipercube.compressor;

import org.apache.commons.cli.*;

/**
 * Created by HIPERCUBE on 1/26/16.
 */
public class CompressorMain {
    private static final Options options = new Options();

    public static void main(String[] args) {
        CommandLineParser commandLineParser = new DefaultParser();
        CommandLine commandLine;

        try {
            options.addOption("p", "print", true, "print argument");
            options.addOption("h", "help", false, "print guideline");

            commandLine = commandLineParser.parse(options, args);
        } catch (ParseException e) {
            System.out.println("Error occurred on parse arguments");

        }
    }

    /**
     * Show how to use Compressor
     */
    private void showUsage() {

    }
}
