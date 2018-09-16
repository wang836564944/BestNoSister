package com.example.a1.bestnosister.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Body {
    @SerializedName("pagebean")
    public PageBean pageBean;

    public class PageBean
    {
        @SerializedName("allNum")
        public String allNum;

        @SerializedName("allPages")
        public String allPages;

        @SerializedName("maxResult")
        public String maxResultOfPage;//每页最大数量

        @SerializedName("currentPage")
        public String currentPage;//当前页

        @SerializedName("contentlist")
        public List<ContentList> mContentList;

        public class ContentList
        {
            @SerializedName("create_time")
            public String createTime;

            @SerializedName("love")
            public String love;

            @SerializedName("hate")
            public String hate;

            @SerializedName("height")
            public String picHeight;

            @SerializedName("width")
            public String picWidth;

            @SerializedName("id")
            public String picId;

            @SerializedName("image0")
            public String imgSize0;

            //数字越大图片越大
            @SerializedName("image1")
            public String imgSize1;

            @SerializedName("image2")
            public String imgSize2;

            @SerializedName("image3")
            public String imgSize3;

            @SerializedName("text")
            public String textInfo;//正文文字

            @SerializedName("type")
            public String typeFile;//类型

            @SerializedName("videotime")
            public String videoTime;

            @SerializedName("video_uri")
            public String videoUrl;

            @SerializedName("voicelength")
            public String voiceLength;

            @SerializedName("voicetime")
            public String voiceTime;

            @SerializedName("voiceuri")
            public String voiceUrl;

            @SerializedName("weixin_url")
            public String weChatUrl;

            @SerializedName("profile_image")
            public String UserHeadImg;


        }
    }
}
