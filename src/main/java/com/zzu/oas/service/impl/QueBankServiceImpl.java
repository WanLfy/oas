package com.zzu.oas.service.impl;

import com.zzu.oas.bean.QueBank;
import com.zzu.oas.repository.QueBankRepository;
import com.zzu.oas.service.QueBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qinhao on 2017/10/29.
 */
@Service
public class QueBankServiceImpl implements QueBankService {

    @Autowired
    private QueBankRepository queBankRepository;

    @Override
    public List<QueBank> getQuesByTemplate(int tempId) {
        List<QueBank> queBanks = new ArrayList<QueBank>();

        return null;
    }
}
