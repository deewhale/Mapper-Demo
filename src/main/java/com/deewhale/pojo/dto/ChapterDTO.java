package com.deewhale.pojo.dto;

public class ChapterDTO {
    private String chapterID;
    private String chapterName;
    private String type;

    public String getChapterID() {
        return chapterID;
    }

    public void setChapterID(String chapterID) {
        this.chapterID = chapterID;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "chapterID='" + chapterID + '\'' +
                ", chapterName='" + chapterName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
