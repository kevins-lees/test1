package com.sy.until;

public class ServletFactory {
    public static Object getServlet(Object object){
        return new TransactionInvocationHandler(object).getProxy();
    }
}
