package com.mphasis.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class Prefilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		
		RequestContext context= RequestContext.getCurrentContext();
		HttpServletRequest request=context.getRequest();
		System.out.println("------------------- In Prefilter------------------");
		System.out.println("Request URI :"+request.getRequestURL());
		
		System.out.println("------------------");
		return null;
	}

	@Override
	public String filterType() {
		
		return null;
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

}
