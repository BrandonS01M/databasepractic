package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.MakerDao;
import com.basedatos.basededatos.models.MakerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@CrossOrigin
@Service
public class MakerService {
    @Autowired
    MakerDao makerDao;

    public List<MakerModel> getAll(){
        return makerDao.getAll();
    }

    public MakerModel get(long id){

        return makerDao.get(id);
    }

    public MakerModel register(MakerModel makerModel){
        return makerDao.register(makerModel);
    }

    public MakerModel update(@RequestBody MakerModel makerModel){
        return makerDao.update(makerModel);
    }

    public void delete(@PathVariable long id){
        makerDao.delete(id);
    }
}
