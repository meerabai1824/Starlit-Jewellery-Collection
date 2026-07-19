package com.jewellery.dao;

import com.jewellery.dto.UserDTO;

public interface UserDAO {

    boolean registerUser(UserDTO user);

    UserDTO loginUser(String email, String password);

    boolean updateUser(UserDTO user);

    UserDTO getUserById(int userId);

}