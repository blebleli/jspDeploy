package kr.or.ddit.cookie.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CoocieUtilTest {

	private String cookie;
	
	@Before
	public void setUp(){
		cookie = "userId=brown;rememberMe=y;checkYn=n";
	}
	
	@Test
	public void cookieSplitTest(){
		/***Given***/
		String id = "rememberMe";
		String[] cookies = cookie.split(";");
		String result=null;
		
		for (int i=0; i<cookies.length; i++){
			String[] a= cookies[i].split("=");
			for (int j = 0; j < a.length; j++) {
				if (a[0].equals(id)) {
					result = a[1];
				}
			}
		}
		
		/***When***/
		/***Then***/
		assertEquals(3, cookies.length);
		assertEquals("userId=brown", cookies[0]);
		assertEquals("rememberMe=y", cookies[1]);
		assertEquals("checkYn=n", cookies[2]);
		assertEquals("y", result);
		
	}
	

	public void cookieNameValueSplitTest(){
		/***Given***/
		String cookie = "userId=brown";

		/***When***/
		//cookieArr[0] = userId;
		//cookieArr[1] = brown;
		String[] cookieArr = cookie.split("=");
		
		/***Then***/
		assertEquals("userId", cookieArr[0]);
		assertEquals("brown", cookieArr[1]);
	}

	
	@Test
	public void getCookietest() {
		//"userId=brown; rememberMe=y"
		//test 어노테이션이 붙어있는것을 실행한다. 
		//예상값/ 실제값 => 내가 결과값을 알고있는 것을 전제로 한다.

		/***Given***/
		CookieUtil cookieUtil = new CookieUtil();

		/***When***/
		//userId == > brown
		String cookieValue = cookieUtil.getCookie(cookie,"userId");
		String cookieValue2 = cookieUtil.getCookie(cookie,"rememberMe");
	
		/***Then***/
		assertEquals("brown", cookieValue);
		assertEquals("y", cookieValue2);
	}

}
