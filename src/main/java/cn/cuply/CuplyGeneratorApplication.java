package cn.cuply;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lu
 */
@SpringBootApplication
@MapperScan("cn.cuply.dao")
public class CuplyGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuplyGeneratorApplication.class, args);
		System.out.println("http://localhost:8090");
		System.out.println(System.getenv().toString());
	}
}
