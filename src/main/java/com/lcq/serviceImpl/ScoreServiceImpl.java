package com.lcq.serviceImpl;

import com.lcq.dao.ScoreDao;
import com.lcq.entity.Score;
import com.lcq.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreDao scoreDao;

    public int insertScore(Score score) {
        return scoreDao.insertScore(score);
    }
}
