package git.fatihy101.secondtask.controller;

import git.fatihy101.secondtask.model.Student;
import git.fatihy101.secondtask.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController extends BaseController<Student> {

    public StudentController(StudentService service) {
        super(service);
    }

    @GetMapping("/")
    @Override
    ResponseEntity<List<Student>> findAll() {
        return super.findAll();
    }

    @GetMapping("/{id}")
    @Override
    ResponseEntity<Student> findById(@PathVariable int id) {
        return super.findById(id);
    }

    @PostMapping("/")
    @Override
    Student save(@RequestBody Student object) {
        return super.save(object);
    }

    @DeleteMapping("/{id}")
    @Override
    void deleteById(@PathVariable int id) {
        super.deleteById(id);
    }
}
