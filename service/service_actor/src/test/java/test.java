import com.skycommunity.actorservice.entity.ActorEntity;
import com.skycommunity.actorservice.mapper.ActorMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class test {


    @Autowired
    private ActorMapper actorMapper;
    @Test
    public void main1(){
       List<ActorEntity> list=actorMapper.findAll();
        System.out.println(list);
    }
}
