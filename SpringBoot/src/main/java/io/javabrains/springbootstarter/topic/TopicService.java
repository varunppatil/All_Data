package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics = Arrays.asList(new Topic("1654646", "newdata", "version"), 
			 new Topic("2dfdsf", "Java Selendsfsfium", "required"));

	public List<Topic> getAllTopics()
	{
		return topics;
	}
}
