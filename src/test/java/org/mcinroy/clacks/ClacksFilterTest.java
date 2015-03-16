package org.mcinroy.clacks;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ClacksFilterTest {
	
	private ClacksFilter filter;
	
	@Before
	public void setUp() {
		filter = new ClacksFilter();
	}
	
	@Test
	public void init() throws ServletException {
		FilterConfig mockFilterConfig = Mockito.mock(FilterConfig.class);
		filter.init(mockFilterConfig);
		Mockito.verifyZeroInteractions(mockFilterConfig);
	}
	
	@Test
	public void destroy() {
		filter.destroy();
	}
	
	@Test
	public void addClacksHeader() throws ServletException, IOException {
		ServletRequest mockRequest = Mockito.mock(ServletRequest.class);
		HttpServletResponse mockResponse = Mockito.mock(HttpServletResponse.class);
		FilterChain mockChain = Mockito.mock(FilterChain.class);
		filter.doFilter(mockRequest, mockResponse, mockChain);
	
		Mockito.verify(mockResponse).addHeader("X-Clacks-Overhead", "GNU Terry Pratchett");
		Mockito.verify(mockChain).doFilter(mockRequest, mockResponse);
	}
}
