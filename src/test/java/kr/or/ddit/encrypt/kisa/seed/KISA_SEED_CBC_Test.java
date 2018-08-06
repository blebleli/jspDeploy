package kr.or.ddit.encrypt.kisa.seed;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KISA_SEED_CBC_Test {
	
	//블록암호화는 : 비밀번호를 제외한 개인 정보를 암호화 할때 사용
	//복호화가 가능한 암호 방식
	
	private Logger logger = LoggerFactory.getLogger(KISA_SEED_CBC_Test.class);
	
		@Test
	public void encryTest(){
		/***Given***/
		String plainTest ="1234";
		

		/***When***/
		String encryptTest = KISA_SEED_CBC.Encrypt(plainTest);
		String decryptTest = KISA_SEED_CBC.Decrypt(encryptTest);
		
		logger.debug("encryptTest : "+ encryptTest);
		logger.debug("plainTest : "+ plainTest);
		
		/***Then***/
	
		assertEquals(plainTest,decryptTest);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
