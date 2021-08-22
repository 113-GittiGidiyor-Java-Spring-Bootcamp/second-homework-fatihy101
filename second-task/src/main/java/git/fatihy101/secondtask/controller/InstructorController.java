package git.fatihy101.secondtask.controller;

import git.fatihy101.secondtask.model.Instructor;
import git.fatihy101.secondtask.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController extends BaseController<Instructor> {
    InstructorController(BaseService<Instructor> service) {
        super(service);
    }

    @GetMapping("/{id}")
    @Override
    ResponseEntity<Instructor> findById(@PathVariable int id) {
        return super.findById(id);
    }

    @GetMapping("/")
    @Override
    ResponseEntity<List<Instructor>> findAll() {
        return super.findAll();
    }

    @DeleteMapping("/{id}")
    @Override
    void deleteById(@PathVariable int id) {
        super.deleteById(id);
    }

    @PostMapping("/")
    @Override
    Instructor save(@RequestBody Instructor object) {
        return super.save(object);
    }
}
