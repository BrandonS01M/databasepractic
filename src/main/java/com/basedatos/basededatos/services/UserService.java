package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.UserDao;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@CrossOrigin
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<UserModel> getAll(){
        return userDao.getAll();
    }

    public UserModel get( long id){

        return userDao.get(id);
    }

    public UserModel register( UserModel userModel){
        return userDao.register(userModel);
    }

    public UserModel update(@RequestBody UserModel userModel){
          return userDao.update(userModel);
    }

    public void delete(@PathVariable long id){
          userDao.delete(id);
    }

}
