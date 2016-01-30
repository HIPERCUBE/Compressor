package com.hipercube.compressor.cli;

import com.hipercube.compressor.cli.arg.ArgMode;
import com.hipercube.compressor.cli.exception.ClParseException;
import com.hipercube.compressor.cli.exception.InvalidFilePathException;
import com.hipercube.compressor.cli.exception.InvalidModeException;

import java.io.File;

/**
 * Copyright (c) 1/30/16 Joowon Ryoo
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
public class CreateOption {
    private ArgMode mode;
    private File source;
    private File output;
    public boolean repeat;
    public int cycle;
    public String help;

    public CreateOption(CompressorArg arg) throws ClParseException {
        // set mode
        setMode(arg.mode);
        // set source
        if (arg.source != null)
            setSource(arg.source);
        // set output
        if (arg.output != null)
            setOutput(arg.output);
    }

    public ArgMode getMode() {
        return mode;
    }

    public void setMode(String modeString) throws InvalidModeException {
        this.mode = new ArgMode(modeString);
    }

    /**
     * source getter
     *
     * @return source file
     */
    public File getSource() {
        return source;
    }

    /**
     * source setter
     *
     * @param sourcePath source file path
     * @throws InvalidFilePathException invalid file path exception
     */
    public void setSource(String sourcePath) throws InvalidFilePathException {
        this.source = new File(sourcePath);
        if (!source.exists()) throw new InvalidFilePathException();
    }

    /**
     * output getter
     *
     * @return output file
     */
    public File getOutput() {
        return output;
    }

    /**
     * output setter
     *
     * @param outputPath output file path
     * @throws InvalidFilePathException invalid file path exception
     */
    public void setOutput(String outputPath) throws InvalidFilePathException {
        this.output = new File(outputPath);
        if (!output.exists()) throw new InvalidFilePathException();
    }
}
