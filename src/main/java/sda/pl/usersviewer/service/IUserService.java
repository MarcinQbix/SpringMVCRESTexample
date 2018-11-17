package sda.pl.usersviewer.service;

import sda.pl.usersviewer.model.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> showall(Integer page,Integer perPage);
}
