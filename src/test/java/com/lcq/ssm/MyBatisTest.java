package com.lcq.ssm;

import com.lcq.dao.ScoreDao;
import com.lcq.entity.Score;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 使用Springtest测试框架
@ContextConfiguration(locations = {"classpath:/spring/spring-dao.xml", "classpath:/spring/spring-service.xml","classpath:/spring/spring-web.xml"}) // 加载配置
public class MyBatisTest {
    @Autowired
    private ScoreDao scoreDao;

    @Test
    public void testAddScore() {
        Score score = new Score();
        score.setChangeType("充一千万");
        score.setScore(100);
        int insert = scoreDao.insertScore(score);
        System.out.print("\n\n\n\ninsert :"+insert+"\n\n\n\n");
    }
}