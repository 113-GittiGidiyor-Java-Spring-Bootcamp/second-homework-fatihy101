package git.fatihy101.secondtask.dao;

import git.fatihy101.secondtask.model.Student;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


@Service
public class StudentDAO implements  BaseDAO<Student> {

    private final EntityManager manager;

    public StudentDAO(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Student> findAll() {
        return manager.createQuery("select s from Student s", Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {
        return manager.find(Student.class, id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return manager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Student student = this.findById(id);
        manager.remove(student);
    }

    @Override
    public Student update(Student student) {
        return manager.merge(student);
    }

}
