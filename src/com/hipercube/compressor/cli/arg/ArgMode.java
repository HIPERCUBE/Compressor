package com.hipercube.compressor.cli.arg;

import com.hipercube.compressor.cli.exception.InvalidModeException;
import com.sun.org.apache.xpath.internal.Arg;

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
public class ArgMode {
    public enum MODE {ZIP, UNZIP}

    public MODE mode;

    public static final String MODE_ZIP = "zip";
    public static final String MODE_UNZIP = "unzip";
    public static final String detail = "mode parameter only required 'zip' or 'unzip'";

    public ArgMode() {
        this.mode = MODE.ZIP;
    }

    public ArgMode(boolean isZip) {
        this.mode = isZip ? MODE.ZIP : MODE.UNZIP;
    }

    public ArgMode(String isZip) throws InvalidModeException {
        switch (isZip) {
            case MODE_ZIP:
                this.mode = MODE.ZIP;
                break;
            case MODE_UNZIP:
                this.mode = MODE.UNZIP;
                break;
            default:
                throw new InvalidModeException();
        }
    }
}
