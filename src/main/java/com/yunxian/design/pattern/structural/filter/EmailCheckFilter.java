package com.yunxian.design.pattern.structural.filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheckFilter implements Filter {

    private static final String REGEX = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    @Override
    public boolean filter(EmailDTO emailDTO) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(emailDTO.getEmail());
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
}
