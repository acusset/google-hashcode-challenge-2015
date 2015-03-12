package com.jeancode;

import java.io.File;

/**
 * Created by Antoine on 12/03/2015.
 */
public class Parseur {

    private String fileName = "dc.in";
    private File file;

    public boolean openFile() {
        this.file = new File(this.fileName);
        if (!this.file.exists())
            return false;
        System.out.println(this.fileName + " is open");
        return true;
    }

    public boolean closeFile() {
//        this.file;
        return true;
    }

    @Override
    public String toString() {
        return "Parseur{" +
                "fileName='" + fileName + '\'' +
                ", file=" + file +
                '}';
    }
}
