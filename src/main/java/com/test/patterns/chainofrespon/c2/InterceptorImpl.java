package com.test.patterns.chainofrespon.c2;

public class InterceptorImpl implements Interceptor {

	@Override
	public void interceptor(ActionInvocation invocation) {
           System.out.println("interceptor1   之前处理");
           invocation.invoke();
           System.out.println("interceptor1   之后处理");
	}

}
