package com.hipercube.compressor.compress.zip;

import java.io.*;
import java.util.zip.GZIPOutputStream;

/**
 * Copyright (c) 1/31/16 Joowon Ryoo
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
public class CompressorZip extends Zip {

    @Override
    public void compress(File source, File output) throws IOException {
        long startTime = System.currentTimeMillis();

        BufferedReader in = new BufferedReader(new FileReader(source));
        BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(output)));

        String s;
        while ((s = in.readLine()) != null) {
            out.write(s.getBytes());
            out.write("\n".getBytes());
        }
        in.close();
        out.close();

        long endTime = System.currentTimeMillis();
        System.out.println("compress elapsed time : " + (endTime - startTime) + "ms");
    }
}
