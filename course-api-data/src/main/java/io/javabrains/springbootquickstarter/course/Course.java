package io.javabrains.springbootquickstarter.course;

import io.javabrains.springbootquickstarter.topic.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;

	@ManyToOne
	private Topic topic;

	public Course() {
	}

	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
