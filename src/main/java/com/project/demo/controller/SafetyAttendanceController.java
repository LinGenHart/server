package com.project.demo.controller;

import com.project.demo.entity.SafetyAttendance;
import com.project.demo.service.SafetyAttendanceService;
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
 *安全考勤：(SafetyAttendance)表控制层
 *
 */
@RestController
@RequestMapping("/safety_attendance")
public class SafetyAttendanceController extends BaseController<SafetyAttendance,SafetyAttendanceService> {

    /**
     *安全考勤对象
     */
    @Autowired
    public SafetyAttendanceController(SafetyAttendanceService service) {
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
