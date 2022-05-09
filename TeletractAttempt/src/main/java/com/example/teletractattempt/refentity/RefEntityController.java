package com.example.teletractattempt.refentity;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RefEntityController {

    private final RefEntityRepository repository;

    RefEntityController(RefEntityRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/nocontent")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void postNoContent(RefEntity newRefEntity) {
        repository.save(newRefEntity);
    }

    @PostMapping( "/echo")
    RefEntity postEcho(@Valid @RequestBody  RefEntity newRefEntity) {
        return repository.save(newRefEntity);
    }

    @PostMapping( "/device")
    Map<String, String> postDevice(@Valid @RequestBody  RefEntity newRefEntity) {
        repository.save(newRefEntity);
        Map<String, String> data = new HashMap<>();
        data.put("deviceId", newRefEntity.getDeviceId());
        return data;
    }

    @GetMapping("/all")
    List<RefEntity> all() {
        return repository.findAll();
    }

//    @PostMapping("/employees")
//    RefEntity newEmployee(@RequestBody RefEntity newEmployee) {
//        return repository.save(newEmployee);
//    }

    // Single item

//    @GetMapping("/employees/{id}")
//    RefEntity one(@PathVariable Long id) {
//
//        return repository.findById(id)
//                .orElseThrow(() -> new RefEntityNotFoundException(id));
//    }

//    @PutMapping("/employees/{id}")
//    RefEntity replaceEmployee(@RequestBody RefEntity newEmployee, @PathVariable Long id) {
//
//        return repository.findById(id)
//                .map(employee -> {
//                    employee.setName(newEmployee.getName());
//                    employee.setRole(newEmployee.getRole());
//                    return repository.save(employee);
//                })
//                .orElseGet(() -> {
//                    newEmployee.setId(id);
//                    return repository.save(newEmployee);
//                });
//    }

//    @DeleteMapping("/employees/{id}")
//    void deleteEmployee(@PathVariable Long id) {
//        repository.deleteById(id);
//    }

}
