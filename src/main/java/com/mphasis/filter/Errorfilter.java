package com.mphasis.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class Errorfilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		
		return false;
	}

	@Override
	public Object run() throws ZuulException {
		System.out.println("------------------- In Errorfilter------------------");
		return null;
	}

	@Override
	public String filterType() {
		
		return "error";
	}

	@Override
	public int filterOrder() {
		
		return 0;
	}

}
