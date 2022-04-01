package com.deewhale.pojo;

/********************************************
 * @author     ：pepper
 * @date       ：Created in 2021/7/19 下午4:21
 * @description：
 * ******************************************/
public class AuthorInfo {
    private String authorId;
    private String authorName;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "AuthorInfo{" +
                "authorId='" + authorId + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
