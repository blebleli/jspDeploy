package kr.or.ddit.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet Filter implementation class requestCountFilter
 */
@WebFilter("/requestCountFilter")
public class RequestCounterFilter implements Filter {

	
	private Logger logger = LoggerFactory.getLogger(RequestCounterFilter.class);
	private Map<String, Integer> requestCountMap = new HashMap<String, Integer>();
 
	/**
     * Default constructor. 
     */
    public RequestCounterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		ServletContext sc = request.getServletContext();
		sc.setAttribute("requestCounter", requestCountMap);
		
		HttpServletRequest req = (HttpServletRequest)request;
		//전처리
		logger.debug("doFilter");
		
		// map 객체에 uri를 키로하고, 값 : 해당 uri 요청된 횟수
		Integer count = requestCountMap.get(req.getRequestURI());

		count = count == null? 0 :count;
		
		requestCountMap.put(req.getRequestURI(), ++count);
		//필터등록필요. web
		//다른필터 , 혹은 더이상의 필터가 없을 경우 요청에 대한 serclet 으로 전달
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
