package git.fatihy101.secondtask.service;

import git.fatihy101.secondtask.dao.CourseDAO;
import git.fatihy101.secondtask.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements BaseService<Course>{
    private final CourseDAO courseDAO;

    CourseService(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public List<Course> findAll() {
        return courseDAO.findAll();
    }

    @Override
    public Course findById(int id) {
        return courseDAO.findById(id);
    }

    @Override
    public Course save(Course object) {
        return courseDAO.save(object);
    }

    @Override
    public void deleteById(int id) {
        courseDAO.deleteById(id);
    }
}
