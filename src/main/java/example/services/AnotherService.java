package example.services;

import common.models.Person;
import common.models.Project;
import common.models.Task;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class AnotherService {
    public List<Project> getAllProjects() {
        Person person = new Person("Anita", "ThingToDo", "Another");
        Task task = new Task("A task", "Do this task", person, new Date());
        Project project = new Project("A project", Arrays.asList(task));

        return Arrays.asList(project);
    }
}
