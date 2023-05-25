package com.project.demo.controller;

import com.project.demo.entity.PersonalInformation;
import com.project.demo.service.PersonalInformationService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *个人信息：(PersonalInformation)表控制层
 *
 */
@RestController
@RequestMapping("/personal_information")
public class PersonalInformationController extends BaseController<PersonalInformation,PersonalInformationService> {

    /**
     *个人信息对象
     */
    @Autowired
    public PersonalInformationController(PersonalInformationService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
