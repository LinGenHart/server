package com.project.demo.controller;

import com.project.demo.entity.SafetyMonitoring;
import com.project.demo.service.SafetyMonitoringService;
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
 *安全监测：(SafetyMonitoring)表控制层
 *
 */
@RestController
@RequestMapping("/safety_monitoring_")
public class SafetyMonitoringController extends BaseController<SafetyMonitoring,SafetyMonitoringService> {

    /**
     *安全监测对象
     */
    @Autowired
    public SafetyMonitoringController(SafetyMonitoringService service) {
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
