package com.run;

import java.util.List;

public interface Internal {
	
	 public User findById(long id);
    
   public  User findByName(String name);
     
    public void saveUser(User user);
     
    public void updateUser(User user);
     
    public void deleteUserById(long id);
 
    public List<User> findAllUsers(); 
     
    public void deleteAllUsers();
     
    public boolean isUserExist(User user);

}
