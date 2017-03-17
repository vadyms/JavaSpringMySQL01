package com.vss.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.vss.dao.UsersDao;
import com.vss.models.User;

@Controller
public class UsersController {
    @Autowired  
    UsersDao dao;
	
    @RequestMapping("/viewusers")  
    public ModelAndView viewusers(){ 
    	List<User> users = dao.getUsers();
        return new ModelAndView("viewusers", "users" , users);  
    }
    
}
