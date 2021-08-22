package git.fatihy101.secondtask.dao;

import git.fatihy101.secondtask.model.Instructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class InstructorDAO implements BaseDAO<Instructor> {
    private final EntityManager manager;

    public InstructorDAO(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<Instructor> findAll() {
        return manager.createQuery("select s from Instructor s", Instructor.class).getResultList();
    }

    @Override
    public Instructor findById(int id) {
        return manager.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return manager.merge(instructor);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Instructor instructor = this.findById(id);
        manager.remove(instructor);
    }

    @Override
    public Instructor update(Instructor instructor) {
        return manager.merge(instructor);
    }
}
