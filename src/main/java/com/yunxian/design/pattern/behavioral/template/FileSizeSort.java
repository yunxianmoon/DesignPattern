package com.yunxian.design.pattern.behavioral.template;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileSizeSort extends FileTemplate{

    public void FilesSort(String fliePath) {
        List< File> files = Arrays.asList(new File(fliePath).listFiles());
        Collections.sort(files, new Comparator< File>() {
            public int compare(File f1, File f2) {
                long diff = f1.length() - f2.length();
                if (diff > 0)
                    return 1;
                else if (diff == 0)
                    return 0;
                else
                    return -1;
            }
            public boolean equals(Object obj) {
                return true;
            }
        });
        for (File f : files) {
            if(f.isDirectory()) continue;
            System.out.println(f.getName()+":"+f.length());
        }

    }
}
