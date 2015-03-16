package org.mcinroy.clacks;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 'We keep that name moving in the Overhead,' he said, and it seemed to Princess that the wind in the 
 * shutter arrays above her blew more forlornly, and the everlasting clicking of the shutters grew more 
 * urgent. 'He'd never have wanted to go home. He was a real linesman. His name is in the code, in the 
 * wind in the rigging and the shutters. Haven't you ever heard the saying “A man's not dead while his name is still spoken”?'
 * 
 * @author Terry Pratchett
 *
 */
public class ClacksFilter implements Filter {
	
	/** The clacks overhead. */
	private static final String CLACKS_HEADER = "X-Clacks-Overhead";
	
	/** Keep moving in the overhead. */
	private static final String KEEP_ALIVE = "GNU Terry Pratchett";

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	public void init(FilterConfig filterconfig) throws ServletException {}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	 */
	public void doFilter(
			ServletRequest request,
			ServletResponse response,
			FilterChain chain) throws ServletException, IOException {
		((HttpServletResponse)response).addHeader(CLACKS_HEADER, KEEP_ALIVE);
		chain.doFilter(request, response);
	}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.Filter#destroy()
	 */
	public void destroy() {}	
}
