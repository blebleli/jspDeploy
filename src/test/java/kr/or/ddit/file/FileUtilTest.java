package kr.or.ddit.file;

import static org.junit.Assert.*;
import kr.or.ddit.cookie.util.CookieUtil;

import org.junit.Before;
import org.junit.Test;

public class FileUtilTest {

	private String contentDisposition;
	
	@Before
	public void setup(){
		contentDisposition ="form-data; name=\"uploadFile\"; filename=\"sally.png\"";
	}
	
	@Test
	public void test() {

//		String[] content = contentDisposition.split(";");
//		String[] contentNameValue = content[1].split("=");
//		String contentName = contentNameValue[0];
//		String contentValue = contentNameValue[1];
		
		String[] content = contentDisposition.split(";");
		String result="";
		String contentName="";
		String contentValue="";
		for (String contentStr : content) {
			String[] contentNameValue = contentStr.split("=");
			if (contentNameValue[0].trim().equals("filename")) {
				contentName = contentNameValue[0].trim();
				contentValue = contentNameValue[1].trim();
				result = contentValue;
				break;
			}
		}	

		assertEquals("filename", contentName);
		//assertEquals("userId=brown", content[0]);
		//assertEquals("rememberMe=y", content[1]);
		//assertEquals("checkYn=n", content[2]);
		//assertEquals("y", result);
	}
	
	@Test
	public void contentNameValueSplitTest(){
		/***Given***/
		String content = "name=\"uploadFile\"";

		/***When***/

		String[] contentArr = content.split("=");
		
		/***Then***/
		assertEquals("name", contentArr[0]);
		assertEquals("\"uploadFile\"", contentArr[1]);
	}

	
	@Test
	public void getContenttest() {
		//"userId=brown; rememberMe=y"
		//test 어노테이션이 붙어있는것을 실행한다. 
		//예상값/ 실제값 => 내가 결과값을 알고있는 것을 전제로 한다.

		
		/***When***/
		//userId == > brown
		String cookieValue = FileUtil.getFileName(contentDisposition);
	
		/***Then***/
		assertEquals("\"sally.png\"", cookieValue);
	
	}

}
