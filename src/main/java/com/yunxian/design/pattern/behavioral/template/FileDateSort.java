package com.yunxian.design.pattern.behavioral.template;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class FileDateSort extends FileTemplate {
    public void FilesSort(String fliePath) {
        File file = new File(fliePath);
        File[] fs = file.listFiles();
        Arrays.sort(fs, new Comparator<File>() {
            public int compare(File f1, File f2) {
                long diff = f1.lastModified() - f2.lastModified();
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
        for (int i = fs.length - 1; i > -1; i--) {
            System.out.println(fs[i].getName());
            System.out.println(new Date(fs[i].lastModified()));
        }
    }
}
