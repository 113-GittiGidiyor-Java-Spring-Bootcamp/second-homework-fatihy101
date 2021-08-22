package git.fatihy101.secondtask.controller;

import git.fatihy101.secondtask.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class BaseController<T> {

    BaseService<T> service;

    BaseController(BaseService<T> service) {
        this.service = service;
    }

    ResponseEntity<List<T>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    ResponseEntity<T> findById(int id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    T save(T object) {
        System.out.println("Data saved");
        return service.save(object);
    }

    void deleteById(int id) {
        service.deleteById(id);
    }
}
