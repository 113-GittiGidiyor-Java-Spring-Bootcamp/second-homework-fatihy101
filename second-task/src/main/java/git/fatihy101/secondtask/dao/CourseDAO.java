package git.fatihy101.secondtask.dao;

import git.fatihy101.secondtask.model.Course;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CourseDAO implements BaseDAO<Course> {

    private final EntityManager manager;

    public CourseDAO(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Course> findAll() {
        return manager.createQuery("select s from Course s", Course.class).getResultList();
    }

    @Override
    public Course findById(int id) {
        return manager.find(Course.class, id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return manager.merge(course);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Course course = this.findById(id);
        manager.remove(course);
    }

    @Override
    public Course update(Course course) {
        return manager.merge(course);
    }
}
