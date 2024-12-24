package com.abhishek;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class StudentService {

	private final RestTemplate restTemplate;

	public StudentService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public List<Map<String, Object>> getStudentsFromProjectB() {
		String url = "http://localhost:8081/api/students";
		return restTemplate.getForObject(url, List.class);
	}
}
