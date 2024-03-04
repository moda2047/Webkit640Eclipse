package com.example.day06;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class EncodingFilter implements Filter {

	private String encoding;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		encoding = filterConfig.getInitParameter("encoding");
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
		response.setContentType("text/html; charset="+encoding);

        // 다음 필터 또는 서블릿 호출
        System.out.println("request 필터 실행 완료");
		// chain.doFilter() 호출 위는 request 필터 영역
					
		chain.doFilter(request, response); // 다음 요청 단계로 넘어 간다.
					
		// chain.doFilter() 호출 아래는 response 필터 영역
		System.out.println("response 필터 실행 완료");

	}

}
