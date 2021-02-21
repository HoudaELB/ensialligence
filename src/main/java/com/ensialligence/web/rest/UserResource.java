package com.ensialligence.web.rest;

import com.ensialligence.config.PersistenceConfig;
import com.ensialligence.model.User;
import com.ensialligence.service.UserService;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	UserService userService=new UserService();
    
    @GET
    @Path("/user")
    @Produces("application/json")
    public User getUser(@QueryParam(value="username") String username,@QueryParam(value="password") String password) {
        return userService.findUser(username, password);
    }

    @POST
    @Path("/addUser")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes({"application/x-www-form-urlencoded","multipart/form-data",MediaType.APPLICATION_JSON})
    public boolean addUser(@FormParam("username") String username,
    					   @FormParam("password") String password,
    					   @FormParam("firstname") String firstname,
    					   @FormParam("lastname")String lastname,
    					   @FormParam("email") String email,
    					   @FormParam("date_nais") String date_nais) {
    	return userService.addUser(new User(username,password,firstname,lastname,email,date_nais));
    }
    
    @GET
    @Path("/user/1")
    @Produces("application/json")
    public User getUser2() {
        return new User(1l, "med", "123","med", "edd", "med@gmail.com", "12455544545");
    }

    @GET
    @Path("/users")
    @Produces("application/json")
    public ArrayList<User> getListUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1l, "med", "123","med", "edd", "med@gmail.com", "12455544545"));
        users.add(new User(2l, "med", "123","med", "edd", "med@gmail.com", "12455544545"));
        return users;
    }
}