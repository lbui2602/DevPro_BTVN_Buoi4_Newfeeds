package com.example.devpro_btvn_buoi4_newfeeds;

public class NewFeeds {
    private Boolean check;
    private String tenTK;
    private String content;
    private int anh,avt;
    private String like,comment,share;

    public NewFeeds(Boolean check, String tenTK, String content, int anh, int avt, String like, String comment, String share) {
        this.check = check;
        this.tenTK = tenTK;
        this.content = content;
        this.anh = anh;
        this.avt = avt;
        this.like = like;
        this.comment = comment;
        this.share = share;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public int getAvt() {
        return avt;
    }

    public void setAvt(int avt) {
        this.avt = avt;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public NewFeeds() {
    }


}
