package com.example.DashBoard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.DashBoard.mapper")
public class DashBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashBoardApplication.class, args);
	}

}
