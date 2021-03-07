package com.ensialligence.dao;

import java.util.ArrayList;

import com.ensialligence.model.User;
import com.ensialligence.model.UserPlusToken;

public interface UserDao {
	
	/**
	 * 
	 * @param userName le nom d'utilisateur lors d'authentification
	 * @param password le password    "       "      "
	 * @return l'utilisateur qu'on cherche
	 */
	 UserPlusToken findUser(String userName,String password);
	/**
	 * 
	 * @param user c'est l'utilieateur qu'on va ajouté
	 * @return token pour session sous form de string
	 */
	String addUser (User user);
	
	/**
	 * 
	 * @param idUser1,idUser2 the id of the user that we want to add to our friend's list
	 * @return false cas d'erreur d'ajout; true sinon
	 */
	boolean followUser(Long idUser1,Long idUser2);
	
	/**
	 * 
	 * @param idUser est l'id de l'utilisateur qu'on veut returner sa list des amis
	 * @return list des amis de l'utilisateur "idUser"
	 */
	ArrayList<User> listFriends(Long idUser);

	/**
	 * 
	 * @param idUser l'id de user qu'on cherche
	 * @return l'utilsateur ou leur id is idUser 
	 */
	User findUserById(Long idUser);

}
