package git.fatihy101.secondtask.controller;

import git.fatihy101.secondtask.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;

public abstract class BaseController<T> {

    BaseService<T> service;


    BaseController(BaseService<T> service) {
        this.service = service;
    }

    ResponseEntity<List<T>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    /**
     * @param id Add @PathVariable to while overriding as GetRequest
      */
    ResponseEntity<T> findById(int id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    /**
     * @param object Add @RequestBody while overriding as PostRequest
     * @return Returns the saved object with an id
     */
    T save(T object) {
        return service.save(object);
    }

    /**
     * @param id Add @PathVariable to while overriding as DeleteRequest
     */
    void deleteById(int id) {
        service.deleteById(id);
    }
}
