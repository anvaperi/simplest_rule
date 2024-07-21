package com.example.age_restricted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

@SpringBootApplication
public class AgeRestrictedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgeRestrictedApplication.class, args);
		try {
			printClassPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void printClassPath() throws IOException {
		ClassLoader cl = Thread.currentThread().getContextClassLoader();
		Enumeration<URL> resources = cl.getResources("");
		while (resources.hasMoreElements()) {
			URL url = resources.nextElement();
			System.out.println(url.getFile());
		}
	}
}
