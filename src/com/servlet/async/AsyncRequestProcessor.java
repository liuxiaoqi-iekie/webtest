package com.servlet.async;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;

public class AsyncRequestProcessor implements Runnable {
	private AsyncContext asyncContext;

	public AsyncRequestProcessor() {
	}

	public AsyncRequestProcessor(AsyncContext asyncCtx) {
		this.asyncContext = asyncCtx;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ServletRequest request = asyncContext.getRequest();
		System.out.println(request.getAttribute("sub_keyword"));
	}
}
