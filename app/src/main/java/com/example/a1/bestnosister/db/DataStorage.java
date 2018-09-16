package com.example.a1.bestnosister.db;

import org.litepal.crud.DataSupport;

public class DataStorage extends DataSupport {
    private String allNum;//所有数量
    private String allPages;//所有页
    private String maxResult;//每页最大数量
    private String currentPage;//当前页

    private String createTime;//创建时间
    private String love;//点赞的数量
    private String hate;//点踩的数量
    private String picHeight;//图片高度
    private String picWidth;//图片宽度
    private String picId;//图片id
    private String imageSize0;//0号图，数字越大，尺寸越大
    private String imageSize1;//
    private String imageSize2;//
    private String imageSize3;//
    private String infoText;//段子正文
    private String typeFile;//类型
    private String videoTime;//视频时长
    private String videoUri;//视频url
    private String voiceLength;//声音文件大小
    private String voiceTime;//声音时长
    private String voiceUri;//声音url
    private String wechatUrl;//微信链接地址
    private String userHeadImg;//用户头像

    public String getAllNum() {
        return allNum;
    }

    public String getAllPages() {
        return allPages;
    }

    public String getMaxResult() {
        return maxResult;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getLove() {
        return love;
    }

    public String getHate() {
        return hate;
    }

    public String getPicHeight() {
        return picHeight;
    }

    public String getPicWidth() {
        return picWidth;
    }

    public String getPicId() {
        return picId;
    }

    public String getImageSize0() {
        return imageSize0;
    }

    public String getImageSize1() {
        return imageSize1;
    }

    public String getImageSize2() {
        return imageSize2;
    }

    public String getImageSize3() {
        return imageSize3;
    }

    public String getInfoText() {
        return infoText;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public String getVoiceLength() {
        return voiceLength;
    }

    public String getVoiceTime() {
        return voiceTime;
    }

    public String getVoiceUri() {
        return voiceUri;
    }

    public String getWechatUrl() {
        return wechatUrl;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setAllNum(String allNum) {
        this.allNum = allNum;
    }

    public void setAllPages(String allPages) {
        this.allPages = allPages;
    }

    public void setMaxResult(String maxResult) {
        this.maxResult = maxResult;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public void setHate(String hate) {
        this.hate = hate;
    }

    public void setPicHeight(String picHeight) {
        this.picHeight = picHeight;
    }

    public void setPicWidth(String picWidth) {
        this.picWidth = picWidth;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public void setImageSize0(String imageSize0) {
        this.imageSize0 = imageSize0;
    }

    public void setImageSize1(String imageSize1) {
        this.imageSize1 = imageSize1;
    }

    public void setImageSize2(String imageSize2) {
        this.imageSize2 = imageSize2;
    }

    public void setImageSize3(String imageSize3) {
        this.imageSize3 = imageSize3;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }

    public void setVoiceLength(String voiceLength) {
        this.voiceLength = voiceLength;
    }

    public void setVoiceTime(String voiceTime) {
        this.voiceTime = voiceTime;
    }

    public void setVoiceUri(String voiceUri) {
        this.voiceUri = voiceUri;
    }

    public void setWechatUrl(String wechatUrl) {
        this.wechatUrl = wechatUrl;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }
}
