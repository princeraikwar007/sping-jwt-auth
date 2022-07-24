package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.entity.AuthRequest;
import com.javatechie.jwt.api.entity.ExceptionMsg;
import com.javatechie.jwt.api.entity.User;
import com.javatechie.jwt.api.service.UserCrudOp;
import com.javatechie.jwt.api.util.JwtUtil;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
    UserCrudOp userCrudOp;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to javatechie !!";
    }

    @GetMapping("/user/{id}")
    public User getData(@PathVariable int id) {
        return  userCrudOp.getUser(id);
    }
    
    @GetMapping("/user")
    public List<User> getData() {
        return  userCrudOp.getAllUser();
    }
    
    @PostMapping("/authenticate")
    public ResponseEntity<ExceptionMsg> generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
            String token = jwtUtil.generateToken(authRequest.getUserName());
           ExceptionMsg msg = new ExceptionMsg("0","success",token);
            return new ResponseEntity<ExceptionMsg>(msg,HttpStatus.OK);
        } catch (Exception ex) {
        	return new ResponseEntity<ExceptionMsg>(new ExceptionMsg("401","invaild username or password","null"),HttpStatus.OK);
        }
        
    }
}
