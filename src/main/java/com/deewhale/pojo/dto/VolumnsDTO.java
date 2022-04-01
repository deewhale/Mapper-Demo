package com.deewhale.pojo.dto;

import com.deewhale.pojo.Chapter;

import java.util.List;

public class VolumnsDTO {
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
