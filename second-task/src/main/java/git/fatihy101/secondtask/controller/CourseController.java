package git.fatihy101.secondtask.controller;

import git.fatihy101.secondtask.model.Course;
import git.fatihy101.secondtask.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController extends BaseController<Course> {


    CourseController(BaseService<Course> service) {
        super(service);
    }

    @GetMapping("/{id}")
    @Override
    ResponseEntity<Course> findById(@PathVariable int id) {
        return super.findById(id);
    }

    @GetMapping("/")
    @Override
    ResponseEntity<List<Course>> findAll() {
        return super.findAll();
    }

    @DeleteMapping("/{id}")
    @Override
    void deleteById(@PathVariable int id) {
        super.deleteById(id);
    }

    @PostMapping("/")
    @Override
    Course save(@RequestBody Course object) {
        return super.save(object);
    }
}
