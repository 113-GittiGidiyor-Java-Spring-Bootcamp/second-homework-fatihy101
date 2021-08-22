package git.fatihy101.secondtask.service;

import git.fatihy101.secondtask.dao.InstructorDAO;
import git.fatihy101.secondtask.model.Instructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor> {

    private final InstructorDAO instructorDAO;

    public InstructorService(InstructorDAO instructorDAO) {
        this.instructorDAO = instructorDAO;
    }

    @Override
    public List<Instructor> findAll() {
        return instructorDAO.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return instructorDAO.findById(id);
    }

    @Override
    public Instructor save(Instructor object) {
        return instructorDAO.save(object);
    }

    @Override
    public void deleteById(int id) {
        instructorDAO.deleteById(id);
    }
}
