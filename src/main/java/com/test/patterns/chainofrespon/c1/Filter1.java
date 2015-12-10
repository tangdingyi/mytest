package com.test.patterns.chainofrespon.c1;

public class Filter1 implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {

		String str = request.getRequestStr();
		request.setRequestStr(str + "1");
		filterChain.doFilter(request, response, filterChain);
		response.setResponseStr(request.getRequestStr()+"Filter1");
		
	}

}
