package com.zzu.oas.repository;

import com.zzu.oas.bean.QueBank;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by qinhao on 2017/10/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class QueBankRepositoryTest {

    @Autowired
    private QueBankRepository queBankRepository;

    @Test
    public void getQuesByTemplate() throws Exception {
        List<QueBank> queBanks = queBankRepository.getQuesByTemplate(0, 1);
        Assert.assertNotNull(queBanks);
    }

}