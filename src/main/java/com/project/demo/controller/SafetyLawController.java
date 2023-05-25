package com.project.demo.controller;

import com.project.demo.entity.SafetyLaw;
import com.project.demo.service.SafetyLawService;
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
 *安全法律：(SafetyLaw)表控制层
 *
 */
@RestController
@RequestMapping("/safety_law")
public class SafetyLawController extends BaseController<SafetyLaw,SafetyLawService> {

    /**
     *安全法律对象
     */
    @Autowired
    public SafetyLawController(SafetyLawService service) {
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
