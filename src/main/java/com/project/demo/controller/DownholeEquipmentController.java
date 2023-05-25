package com.project.demo.controller;

import com.project.demo.entity.DownholeEquipment;
import com.project.demo.service.DownholeEquipmentService;
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
 *井下设备：(DownholeEquipment)表控制层
 *
 */
@RestController
@RequestMapping("/downhole_equipment")
public class DownholeEquipmentController extends BaseController<DownholeEquipment,DownholeEquipmentService> {

    /**
     *井下设备对象
     */
    @Autowired
    public DownholeEquipmentController(DownholeEquipmentService service) {
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
