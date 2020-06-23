package com.yunxian.design.pattern.behavioral.template;

import org.junit.Test;

public class TestFileTemplate {

    @Test
    public void testFileSizeSort(){
        FileSizeSort fileSizeSort = new FileSizeSort();
        fileSizeSort.templateSort("D:\\book");

    }

    @Test
    public void testFileDateSort(){
        FileDateSort fileDateSort = new FileDateSort();
        fileDateSort.templateSort("D:\\book");

    }


}
