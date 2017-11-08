package com.zzu.oas.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by qinhao on 2017/11/8.
 */
@WebFilter(filterName = "filter", urlPatterns = "/*")
public class adminSessionFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        HttpSession session = req.getSession();
        String admin = (String) session.getAttribute("admin");
        if (admin != null) {
            resp.sendRedirect("/admin");
        } else {
            filterChain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {

    }
}
