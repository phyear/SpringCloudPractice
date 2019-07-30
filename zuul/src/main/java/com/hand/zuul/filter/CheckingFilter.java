package com.hand.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import javax.servlet.http.HttpServletRequest;

public class CheckingFilter extends ZuulFilter {
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
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

          String token=request.getParameter("token");

          if(token==null){
              currentContext.setSendZuulResponse(false);
              currentContext.setResponseStatusCode(401);
              currentContext.setResponseBody("unAuthrized");
              return  null;
          }


        return null;


    }
}
