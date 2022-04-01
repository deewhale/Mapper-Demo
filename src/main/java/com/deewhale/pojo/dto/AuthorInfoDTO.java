package com.deewhale.pojo.dto;

public class AuthorInfoDTO {
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
