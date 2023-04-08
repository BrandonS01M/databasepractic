package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.ProducerDao;
import com.basedatos.basededatos.dao.UserDao;
import com.basedatos.basededatos.models.ProducerModel;
import com.basedatos.basededatos.models.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@CrossOrigin
@Service
public class ProducerServices {
    @Autowired
    ProducerDao producerDao;

    public List<ProducerModel> getAll(){
        return producerDao.getAll();
    }

    public ProducerModel get( long id){

        return producerDao.get(id);
    }

    public ProducerModel register( ProducerModel producerModel){
        return producerDao.register(producerModel);
    }

    public ProducerModel update(@RequestBody ProducerModel producerModel){
        return producerDao.update(producerModel);
    }

    public void delete(@PathVariable long id){
        producerDao.delete(id);
    }
}
