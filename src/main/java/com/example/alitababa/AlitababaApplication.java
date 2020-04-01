package com.example.alitababa;

import moc.etz.zunit.ZUnit;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.alitababa.mapper")
public class AlitababaApplication {

	public static void main(String[] args) throws Exception {
		ZUnit.loadAgent();

		SpringApplication.run(AlitababaApplication.class, args);
	}

}
