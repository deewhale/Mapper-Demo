package com.deewhale.pojo;

import java.util.List;

/********************************************
 * @author     ：pepper
 * @date       ：Created in 2021/7/19 下午4:19
 * @description：卷列表
 * ******************************************/
public class Volumns {

    /**
     * 卷名称
     */
    private String volumnName;

    private List<Chapter> chapters;

    public String getVolumnName() {
        return volumnName;
    }

    public void setVolumnName(String volumnName) {
        this.volumnName = volumnName;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Volumns{" +
                "volumnName='" + volumnName + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
