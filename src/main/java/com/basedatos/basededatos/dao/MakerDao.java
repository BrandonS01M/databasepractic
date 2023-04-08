package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.MakerModel;

import java.util.List;

public interface MakerDao {

    List<MakerModel> getAll();
    MakerModel get(long id);
    MakerModel register(MakerModel makerModel);
    MakerModel update(MakerModel makerModel);
    void delete(  long id);
}
