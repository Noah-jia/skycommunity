package com.skycommunity.actorservice.service;

import com.skycommunity.actorservice.entity.ActorEntity;

import java.util.List;

public interface ActorService {
    List<ActorEntity> findAll();

    Boolean add(ActorEntity actorEntity);
}
