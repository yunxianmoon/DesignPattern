package com.yunxian.design.pattern.behavioral.template;

public abstract class FileTemplate {
    public abstract void FilesSort(String fliePath);
    public final void templateSort(String fliePath){
        FilesSort(fliePath);
    }

}
