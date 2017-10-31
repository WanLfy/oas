package com.zzu.oas.util;

import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * 选择题题目和待选项合并
 * Created by qinhao on 2017/10/30.
 */
public class MergeQueOptions {

    // 题目
    private QueBank queBank;
    // 待选项
    private List<QueOptions> queOptionsList;

    public MergeQueOptions() {
    }

    // 合并选择体题目和待选项
    public static List<MergeQueOptions> getMergeQueOptionsList(List<QueBank> queBanks, List<QueOptions> optionsList) {
        List<MergeQueOptions> mergeQueOptionsList = new ArrayList<MergeQueOptions>();
        for (QueBank queBank : queBanks) {
            MergeQueOptions mergeQueOptions = new MergeQueOptions();
            List<QueOptions> matchOptionsList = new ArrayList<QueOptions>();
            for (QueOptions options : optionsList) {
                if (queBank.getQueId() == options.getQueId()) {
                    matchOptionsList.add(options);
                }
            }
            // 合并添加
            mergeQueOptions.setQueBank(queBank);
            mergeQueOptions.setQueOptionsList(matchOptionsList);
            mergeQueOptionsList.add(mergeQueOptions);
        }
        return mergeQueOptionsList;
    }

    public QueBank getQueBank() {
        return queBank;
    }

    public void setQueBank(QueBank queBank) {
        this.queBank = queBank;
    }

    public List<QueOptions> getQueOptionsList() {
        return queOptionsList;
    }

    public void setQueOptionsList(List<QueOptions> queOptionsList) {
        this.queOptionsList = queOptionsList;
    }

    @Override
    public String toString() {
        return "MergeQueOptions{" +
                "queBank=" + queBank +
                ", queOptionsList=" + queOptionsList +
                '}';
    }
}
