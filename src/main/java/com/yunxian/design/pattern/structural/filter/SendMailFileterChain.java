package com.yunxian.design.pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class SendMailFileterChain {

    private List<Filter> filters = new ArrayList<Filter>();

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public boolean doFilter(EmailDTO emailDTO) {
        for (Filter filter : filters) {
            if (!filter.filter(emailDTO)) {
                return false;
            }
        }
        return true;
    }
}
