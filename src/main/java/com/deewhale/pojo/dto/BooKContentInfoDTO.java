package com.deewhale.pojo.dto;

import com.deewhale.pojo.AuthorInfo;
import com.deewhale.pojo.Chapter;
import com.deewhale.pojo.Volumns;

import java.util.List;

public class BooKContentInfoDTO {
    private String contentID;

    /**
     * 内容名称
     */
    private String contentName;

    /**
     * 内容作家ID，当内容为杂志时，该字段为空
     */
    private String authorID;

    /**
     * 内容作家名称，当内容为杂志时，该字段为空
     */
    private String authorName;

    /**
     * 作家列表
     */
    private List<AuthorInfo> authorList;

    /**
     * 译者列表
     */
    private List<AuthorInfo> translatorList;

    /**
     * 内容描述（短简介），当内容类型杂志时，该字段使用\r\n表示换行分割符
     */
    private String description;

    /**
     * 内容描述（长简介），当内容类型杂志时，该字段使用\r\n表示换行分割符
     */
    private String longDescription;

    /**
     * 内容类型, 1：书籍（只支持1 图书）、2：漫画、3：杂志、5：听书
     */
    private String contentType;

    /**
     * 内容封面大图片URL地址
     */
    private String bigLogo;

    /**
     * 内容封面小图片URL地址
     */
    private String smallLogo;

    /**
     * 编辑内容评分1~9分
     */
    private String mark;



    /**
     * 是否允许下载，连载完本的书，用户必须订购所有章节后才支持下载
     */
    private boolean canDownload;

    /**
     * 是否连载
     */
    private boolean isSerial;

    /**
     * 内容计费模式 ，0：免费、1：按本计费、2：按章计费、3：按字计费
     */
    private String chargeMode;

    /**
     * 资费描述
     * 增加赠送书券X.XX元，充值书券X.XX元的通配符
     */
    private String chargeDesc;


    /**
     * 连载类书籍最新章节信息，非连载类书籍不包含此字段
     */
    private Chapter LastestChapter;

    /**
     * 总章节数
     */
    private Integer totalChapterCount;

    /**
     * 卷列表，杂志时该字段为空，不需要装填章节信息
     */
    private List<Volumns> VolumnInfoList;

    /**
     * 是否完成，1 完成、0 未完成
     */
    private String isFinished;

    /**
     * 图书总字数，当漫画和杂志时为空
     */
    private String count;

    /**
     * 图书免费阅读章节数
     */
    private String freeChapterSize;

    public String getContentID() {
        return contentID;
    }

    public void setContentID(String contentID) {
        this.contentID = contentID;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<AuthorInfo> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<AuthorInfo> authorList) {
        this.authorList = authorList;
    }

    public List<AuthorInfo> getTranslatorList() {
        return translatorList;
    }

    public void setTranslatorList(List<AuthorInfo> translatorList) {
        this.translatorList = translatorList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBigLogo() {
        return bigLogo;
    }

    public void setBigLogo(String bigLogo) {
        this.bigLogo = bigLogo;
    }

    public String getSmallLogo() {
        return smallLogo;
    }

    public void setSmallLogo(String smallLogo) {
        this.smallLogo = smallLogo;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public boolean isCanDownload() {
        return canDownload;
    }

    public void setCanDownload(boolean canDownload) {
        this.canDownload = canDownload;
    }

    public boolean isSerial() {
        return isSerial;
    }

    public void setSerial(boolean serial) {
        isSerial = serial;
    }

    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public String getChargeDesc() {
        return chargeDesc;
    }

    public void setChargeDesc(String chargeDesc) {
        this.chargeDesc = chargeDesc;
    }

    public Chapter getLastestChapter() {
        return LastestChapter;
    }

    public void setLastestChapter(Chapter lastestChapter) {
        LastestChapter = lastestChapter;
    }

    public Integer getTotalChapterCount() {
        return totalChapterCount;
    }

    public void setTotalChapterCount(Integer totalChapterCount) {
        this.totalChapterCount = totalChapterCount;
    }

    public List<Volumns> getVolumnInfoList() {
        return VolumnInfoList;
    }

    public void setVolumnInfoList(List<Volumns> volumnInfoList) {
        VolumnInfoList = volumnInfoList;
    }

    public String getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(String isFinished) {
        this.isFinished = isFinished;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getFreeChapterSize() {
        return freeChapterSize;
    }

    public void setFreeChapterSize(String freeChapterSize) {
        this.freeChapterSize = freeChapterSize;
    }

    @Override
    public String toString() {
        return "BookContentInfo{" +
                "contentID='" + contentID + '\'' +
                ", contentName='" + contentName + '\'' +
                ", authorID='" + authorID + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorList=" + authorList +
                ", translatorList=" + translatorList +
                ", description='" + description + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", contentType='" + contentType + '\'' +
                ", bigLogo='" + bigLogo + '\'' +
                ", smallLogo='" + smallLogo + '\'' +
                ", mark='" + mark + '\'' +
                ", canDownload=" + canDownload +
                ", isSerial=" + isSerial +
                ", chargeMode='" + chargeMode + '\'' +
                ", chargeDesc='" + chargeDesc + '\'' +
                ", LastestChapter=" + LastestChapter +
                ", totalChapterCount=" + totalChapterCount +
                ", VolumnInfoList=" + VolumnInfoList +
                ", isFinished='" + isFinished + '\'' +
                ", count='" + count + '\'' +
                ", freeChapterSize='" + freeChapterSize + '\'' +
                '}';
    }
}
