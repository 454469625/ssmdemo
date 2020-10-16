package com.lcq.ssm;

import com.lcq.dao.GagDao;
import com.lcq.dao.ScoreDao;
import com.lcq.entity.Gag;
import com.lcq.entity.Score;
import com.lcq.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class) // 使用Springtest测试框架
@ContextConfiguration("/spring/spring-*.xml") // 加载配置
public class MyBatisTest {
    @Autowired
    private ScoreDao scoreDao;
    @Autowired
    private GagDao gagDao;
    private ShardedJedisPool shardedJedisPool;
    private ShardedJedis jedis;

    @Test
    public void testAddScore() {
        Score score = new Score();
        score.setChangeType("充一千万");
        score.setScore(100);
        int insert = scoreDao.insertScore(score);
        System.out.print("\n\n\n\ninsert :"+insert+"\n\n\n\n");
    }

    @Test
    public void testRedisData() {
        User user = new User();
        user.setId(Long.valueOf(1));
        user.setAccount(String.valueOf(666666666));
        Gag gag = new Gag();
        gag.setGagTime(new Date());
        gag.setUser(user);
        int insertSuccess = gagDao.insertGag(gag);
        System.out.print("\n\n\n\n\n insert :" + insertSuccess+"\n\n\n\n");
    }
}