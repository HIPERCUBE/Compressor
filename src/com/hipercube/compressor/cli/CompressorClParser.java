package com.hipercube.compressor.cli;

import org.apache.commons.cli.*;

import java.util.List;

/**
 * Copyright (c) 1/26/16 Joowon Ryoo
 * <p>
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 * <p>
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * <p>
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
        options.addOption("o", "output", true, "output directory which zipped file located");
        options.addOption("r", "repeat", true, "whether to continue to work");
        options.addOption("c", "cycle", true, "operation cycle (milli-second)");
        options.addOption("h", "help", true, "show Compressor helps");
    }

    /**
     * process argument
     *
     * @param args arguments
     * @return result is success
     */
    public final boolean process(String[] args) {
        try {
            // parse arguments
            CommandLine commandLine = parse(options, args);
            // create CompressorArg from parsed CommandLine
            CompressorArg compressorArg = getCompressorArgFromCommandLine(commandLine);

            // First check, is argument include help option
            if (compressorArg.help != null)
                showHelp(compressorArg.help);
        } catch (ParseException e) {
            parseFailed();
            return false;
        }
        return true;
    }

    /**
     * show how to use Compressor
     */
    public void showUsage() {
        HelpFormatter helpFormatter = new HelpFormatter();
        String usage = "Compressor -l <arg> [options]";
        helpFormatter.printHelp(usage, options);
    }

    public void showHelp(String option) {
        switch (option) {
            case "l":
            case "location":
                showHelp(CompressorOption.Location);
                break;
            case "o":
            case "output":
                showHelp(CompressorOption.Output);
                break;
            case "r":
            case "repeat":
                showHelp(CompressorOption.Repeat);
                break;
            case "c":
            case "cycle":
                showHelp(CompressorOption.Cycle);
                break;
            case "h":
            case "help":
                showHelp(CompressorOption.Help);
                break;
            default:
                parseFailed();
        }
    }

    public void showHelp(CompressorOption option) {
        System.out.print(option.name() + ": ");
        switch (option) {
            case Location:
                System.out.println("input directory which original file located");
                break;
            case Output:
                System.out.println("output directory which zipped file located");
                break;
            case Repeat:
                System.out.println("whether to continue to work");
                break;
            case Cycle:
                System.out.println("operation cycle (milli-second)");
                break;
            case Help:
                System.out.println("show Compressor helps");
                break;
        }
    }

    /**
     * create CompressorArg from parsed CommandLIne
     *
     * @param commandLine parsed commandLine
     * @return CompressorArg which created from commandLine
     */
    private CompressorArg getCompressorArgFromCommandLine(CommandLine commandLine) {
        CompressorArg arg = new CompressorArg();
        try {
            arg.location = commandLine.getOptionValue("l");
            arg.output = commandLine.getOptionValue("o");
            arg.repeat = Boolean.parseBoolean(commandLine.getOptionValue("r") != null ? commandLine.getOptionValue("r") : "false");
            arg.cycle = Integer.parseInt(commandLine.getOptionValue("c") != null ? commandLine.getOptionValue("c") : "10");
            arg.help = commandLine.getOptionValue("h");
        } catch (Exception e) {
            parseFailed();
        }
        return arg;
    }

    /**
     * on parse failed
     */
    private void parseFailed() {
        System.out.println("Error occurred in parsing arguments\nCheck your arguments\n");
        showUsage();
    }
}