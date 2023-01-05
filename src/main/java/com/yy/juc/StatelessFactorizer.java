package com.yy.juc;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @author gongcy
 * @date 2022/12/27 10:02 下午
 * @Description
 */
public class StatelessFactorizer implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        BigInteger i = extractFromRequest(req);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
