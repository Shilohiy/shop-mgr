package com.springboot.shopmgr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@MapperScan(basePackages = "com.springboot.shopmgr.*.mapper")
@SpringBootApplication
public class ShopMgrApplication {
	/**
	 * 入口方法
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ShopMgrApplication.class, args);
	}

}
