/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.test.webapptest.actions;

import com.fvgprinc.app.web.test.webapptest.bean.User;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */

@Namespace(value = "/")
@Action(value ="useraction", results = {
    @Result(name = SUCCESS, location = "/success.jsp")})

public class UserAction extends ActionSupport {
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
      
    
    
     
}
