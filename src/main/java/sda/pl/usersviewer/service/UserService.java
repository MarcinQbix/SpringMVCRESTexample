package sda.pl.usersviewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.pl.usersviewer.connector.ReqresSampleUserDataConnector;
import sda.pl.usersviewer.connector.ReqresSampleUsersDataResponse;
import sda.pl.usersviewer.connector.User;
import sda.pl.usersviewer.model.UserDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService {
    private ReqresSampleUserDataConnector reqresSampleUserDataConnector;
@Autowired
    public UserService(ReqresSampleUserDataConnector reqresSampleUserDataConnector) {
        this.reqresSampleUserDataConnector = reqresSampleUserDataConnector;
    }
    public List<UserDTO> showall(Integer page, Integer perPage){
    List<User> users= reqresSampleUserDataConnector.connect(page,perPage).getUsers();
    return users.stream().map(b->new UserDTO(b.getId(),b.getFirstName(),b.getLastName(),b.getAvatar(),null,0)).collect(Collectors.toList());
    }
}
