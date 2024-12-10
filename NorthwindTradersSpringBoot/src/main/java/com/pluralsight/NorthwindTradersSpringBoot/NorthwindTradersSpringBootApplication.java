package com.pluralsight.NorthwindTradersSpringBoot;

import com.abdurraheem.utils.Console;
import com.pluralsight.NorthwindTradersSpringBoot.dao.interfaces.ProductDao;
import com.pluralsight.NorthwindTradersSpringBoot.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
	}

}