package io.javabrains.springbootquickstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	public List<Course> getByTopicId(String topicId);

}
