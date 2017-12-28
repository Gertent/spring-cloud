package com.gertent.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author wyf
 * @Date 2017/12/27
 */
public class AccessFilter extends ZuulFilter {
    private static Logger logger = Logger.getLogger(AccessFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info("send{"+request.getMethod()+"} request to {"+request.getRequestURL().toString()+"}");
        Object accessToken = request.getParameter("accessToken");
        if(accessToken == null){
            logger.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        logger.info("sccess token is OK");
        return null;
    }
}
