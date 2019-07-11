package com.xj.web.controller;

import com.xj.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
//@EnableAutoConfiguration
@RequestMapping("stu")
public class StudentController {
    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("username","xj");
        model.addAttribute("age",20);
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student(1001,"zjzjzj","男"));
        stuList.add(new Student(1002,"zjzj","男"));
        stuList.add(new Student(1003,"jzjzj","男"));

        model.addAttribute("stuList",stuList);

        return "stu/list";


    }


}
