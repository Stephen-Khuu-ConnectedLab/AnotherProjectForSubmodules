package example.controllers;

import common.models.Project;
import example.services.AnotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnotherController {

    private final AnotherService anotherService;

    @Autowired
    public AnotherController(AnotherService anotherService) {
        this.anotherService = anotherService;
    }

    @RequestMapping("/")
    public List<Project> index() {
        return this.anotherService.getAllProjects();
    }
}
