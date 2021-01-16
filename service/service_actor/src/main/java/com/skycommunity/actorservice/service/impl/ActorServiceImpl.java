package com.skycommunity.actorservice.service.impl;


import com.skycommunity.actorservice.entity.ActorEntity;
import com.skycommunity.actorservice.mapper.ActorMapper;
import com.skycommunity.actorservice.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorMapper actorMapper;
    @Override
    public List<ActorEntity> findAll() {
       List<ActorEntity> actorList=actorMapper.findAll();
       return actorList;
    }

    @Override
    public Boolean add(ActorEntity actorEntity) {
        Boolean flag=actorMapper.add(actorEntity);
        return flag;
    }
}
