package com.yedam.app;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor; 
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		String[] dataList = { "jdbc:oracle:thin:@127.0.0.1:1521/xe", "hr", "hr" };
		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setPassword("im0997");
		config.setAlgorithm("PBEWithMD5AndDES");
		config.setKeyObtentionIterations("1000");
		config.setPoolSize("1");
		config.setProviderName("SunJCE");
		config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
		config.setIvGeneratorClassName("org.jasypt.iv.NoIvGenerator");
		config.setStringOutputType("base64");
		encryptor.setConfig(config);

		for (String data : dataList) {
			String encryText = encryptor.encrypt(data);
			System.out.println(encryText);
		}
	        
	}

}
