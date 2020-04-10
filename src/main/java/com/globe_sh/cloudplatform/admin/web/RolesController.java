package com.globe_sh.cloudplatform.admin.web;

import com.globe_sh.cloudplatform.admin.entity.FactoryEntity;
import com.globe_sh.cloudplatform.admin.dao.FactoryDAO;
import com.globe_sh.cloudplatform.admin.entity.StationEntity;
import com.globe_sh.cloudplatform.admin.dao.StationDAO;
import com.globe_sh.cloudplatform.admin.entity.DeviceEntity;
import com.globe_sh.cloudplatform.admin.dao.DeviceDAO;
import com.globe_sh.cloudplatform.admin.entity.DataBlockEntity;
import com.globe_sh.cloudplatform.admin.dao.DataBlockDAO;

import java.util.ArrayList;
import java.util.List;

import java.sql.Timestamp;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.globe_sh.cloudplatform.common.cache.JedisOperater;
import com.globe_sh.cloudplatform.common.util.StaticMethod;
import com.globe_sh.cloudplatform.common.util.StaticOperater;
import com.globe_sh.cloudplatform.common.util.StaticVariable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.apache.logging.log4j.*;

@Controller
public class RolesController {

	@Autowired
	private FactoryDAO factoryDao;
	
    @RequestMapping(value = "/factory", method = RequestMethod.GET)
    public String factoryList(Model model) throws Exception {
         model.addAttribute("title", "管理后台: 工厂列表");
         model.addAttribute("hello","Hello, Spring Boot!");
         List<FactoryEntity> fs = factoryDao.getFactoryAll();
         model.addAttribute("userList", fs);
         return "factory";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) throws Exception {
         model.addAttribute("title", "管理后台: 主页");
         model.addAttribute("hello","Hello, Spring Boot!");
         return "index";
    }    
}