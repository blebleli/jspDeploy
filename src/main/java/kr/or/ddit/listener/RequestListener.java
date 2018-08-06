package kr.or.ddit.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

			
public class RequestListener implements ServletRequestListener{
	
	private Logger logger  = LoggerFactory.getLogger(SessionListener.class);


	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
		logger.debug("req.getRequestURI() Initialized : "+req.getRequestURI());
		
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		HttpServletRequest req = (HttpServletRequest)sre.getServletRequest();
		logger.debug("req.getRequestURI() Destroyed : "+req.getRequestURI());
		
	}
}
