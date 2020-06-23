package com.yunxian.design.pattern.structural.filter;



public class TestSendFileterChain {

    public static void main(String[] args) {
        String str = testSendMailFilter();
        System.out.println(str);
    }

    public static String  testSendMailFilter(){
        SendMailFileterChain fileterChain = new SendMailFileterChain();
        fileterChain.addFilter(new EmailCheckFilter());
        EmailDTO emailDTO = new EmailDTO().setEmail("test@sina.com");
        if(!fileterChain.doFilter(emailDTO)){
            return "fail";
        }else {
            return "success";
        }
    }




}
