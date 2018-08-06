package kr.or.ddit.cookie.util;

public class CookieUtil {


	/**
	 * 
	 * Method   : getCookie 
	 * 최초작성일  : 2018. 7. 6. 
	 * 작성자 : PC06 
	 * 변경이력 : 
	 * @param cookie
	 * @param string
	 * @return 
	 * Method 설명 : 쿠키 조회
	 */
	public String getCookie(String cookie, String name) {
		//cookie:userId=brown;rememberMe=checkYn=n;


		String[] cookies = cookie.split(";");
		String result="";

		for (String cookieStr : cookies) {
			String[] cookieNameValue = cookieStr.split("=");
			String cookieName = cookieNameValue[0];
			String cookieValue = cookieNameValue[1];
			
			if (name.equals(cookieName)) {
				result=cookieValue;
				break;
			}
		}
			
		return result;
	}
	

	public static void main(String[] args) {
		CookieUtil u = new CookieUtil();
		String result = u.getCookie("cookie:userId=brown;rememberMe=y;checkYn=n", "userId");
		System.out.println(result);

	}

}
