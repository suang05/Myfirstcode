package com.example.demo.student;



import com.example.demo.DemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;


@RestController
@RequestMapping(path = "api/v1")
public class StudentController {

    private final StudentService studentService;

    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    long beginTime = System.currentTimeMillis();
    @RequestMapping(path="/student", method=RequestMethod.GET)
    public List<Student> getStudent() {
        log.info("------success-------");
        long endtime = System.currentTimeMillis() - beginTime;
        log.info("------endtime-------" + endtime);
        return studentService.getStudent();
    }

    @RequestMapping(path="/", method=RequestMethod.GET)
    public String goHome(){
        return "index";
    }

}
