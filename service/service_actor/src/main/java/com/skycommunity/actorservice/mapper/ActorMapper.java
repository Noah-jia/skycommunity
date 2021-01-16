package com.skycommunity.actorservice.mapper;


import com.skycommunity.actorservice.entity.ActorEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ActorMapper {

    @Select("select *from actor")
    List<ActorEntity> findAll();
    @Insert("insert into actor(id,name,birthday,country,gmt_create,gmt_modified) values(#{id},#{name},#{birthday},#{country},#{gmtCreate},#{gmtModified})")
    Boolean add(ActorEntity actorEntity);
}
