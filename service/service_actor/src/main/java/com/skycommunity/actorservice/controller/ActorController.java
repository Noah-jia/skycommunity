package com.skycommunity.actorservice.controller;


import com.skycommunity.actorservice.entity.ActorEntity;
import com.skycommunity.actorservice.service.ActorService;
import com.skycommunity.commonutils.R;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Api(description = "讲师列表")
@RestController
@RequestMapping("/actorservice/actor")
@CrossOrigin
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping("findAll")
    public R findAll(){
        List<ActorEntity> list=actorService.findAll();
        System.out.println(list);
        return R.ok().data("list",list);
    }
    @PostMapping("add")
    public R add(
            @RequestBody ActorEntity actorEntity
    ){
         String id= UUID.randomUUID().toString();
         actorEntity.setId(id);
         actorEntity.setGmtCreate(new Date());
         actorEntity.setGmtModified(new Date());
         Boolean flag=actorService.add(actorEntity);
         if(flag)
         return R.ok().message("插入成功");
         else
         return R.error().message("插入失败");
    }
}
