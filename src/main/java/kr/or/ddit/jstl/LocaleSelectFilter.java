package kr.or.ddit.jstl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet Filter implementation class LocaleSelectFilter
 */
@WebFilter("/localeSelect")
public class LocaleSelectFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(LocaleSelectFilter.class);
	
    public LocaleSelectFilter() {
    
    }


	public void destroy() {
	
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//전처리
		HttpServletRequest req = (HttpServletRequest)request;
		logger.debug(req.getRequestURI() + " : LocaleSelectFilter doFilter");
		LocaleSelectWrapper localeSelectWrapper = new LocaleSelectWrapper(req);

		//fileter - servlet 요청 처리
		chain.doFilter(localeSelectWrapper, response);

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
