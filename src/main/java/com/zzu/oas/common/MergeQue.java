package com.zzu.oas.common;

import com.zzu.oas.bean.QueBank;
import com.zzu.oas.bean.QueOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * 选择题题目和待选项合并
 * Created by qinhao on 2017/10/30.
 */
public class MergeQue {

    // 题目
    private QueBank queBank;
    // 待选项
    private List<QueOptions> queOptionsList;

    public MergeQue() {
    }

    // 合并选择体题目和待选项
    public static List<MergeQue> getMergeQueList(List<QueBank> queBankList, List<QueOptions> optionsList) throws Exception {
        List<MergeQue> mergeQueList = new ArrayList<MergeQue>();
        if (queBankList != null && optionsList != null) {
            for (QueBank queBank : queBankList) {
                MergeQue mergeQue = new MergeQue();
                List<QueOptions> matchOptionsList = new ArrayList<QueOptions>();
                for (QueOptions options : optionsList) {
                    if (queBank.getQueId() == options.getQueId()) {
                        QueOptions qo = new QueOptions();
                        qo.setQueId(options.getQueId());
                        qo.setOptions(options.getOptions().trim());
                        matchOptionsList.add(qo);
                    }
                }
                // 合并添加
                mergeQue.setQueBank(queBank);
                mergeQue.setQueOptionsList(matchOptionsList);
                mergeQueList.add(mergeQue);
            }
        } else {
            throw new Exception("选择题(题目、选项)合并失败");
        }
        return mergeQueList;
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
        return "MergeQue{" +
                "queBank=" + queBank +
                ", queOptionsList=" + queOptionsList +
                '}';
    }
}
