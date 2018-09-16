package com.example.a1.bestnosister.util;

import android.text.TextUtils;

import com.example.a1.bestnosister.db.DataStorage;
import com.example.a1.bestnosister.gson.BestSister;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {

    public static boolean handleData(String response)
    {
        if(!TextUtils.isEmpty(response))
        {
            try
            {
                JSONArray datas = new JSONArray(response);
                for(int i = 0;i < datas.length();i++)
                {
                    JSONObject jsonObject = datas.getJSONObject(i);
                    DataStorage dataStorage = new DataStorage();
                    dataStorage.setAllNum(jsonObject.getString("allNum"));
                    dataStorage.setAllPages(jsonObject.getString("allPages"));
                    dataStorage.setCreateTime(jsonObject.getString("maxResult"));
                    dataStorage.setCurrentPage(jsonObject.getString("currentPage"));
                    dataStorage.setCreateTime(jsonObject.getString("create_time"));
                    dataStorage.setLove(jsonObject.getString("love"));
                    dataStorage.setHate(jsonObject.getString("hate"));
                    dataStorage.setPicHeight(jsonObject.getString("height"));
                    dataStorage.setPicWidth(jsonObject.getString("width"));
                    dataStorage.setPicId(jsonObject.getString("id"));
                    dataStorage.setImageSize0(jsonObject.getString("image0"));
                    dataStorage.setImageSize1(jsonObject.getString("image1"));
                    dataStorage.setImageSize2(jsonObject.getString("image2"));
                    dataStorage.setImageSize3(jsonObject.getString("image3"));
                    dataStorage.setInfoText(jsonObject.getString("text"));
                    dataStorage.setTypeFile(jsonObject.getString("type"));
                    dataStorage.setVideoTime(jsonObject.getString("videotime"));
                    dataStorage.setVideoUri(jsonObject.getString("video_uri"));
                    dataStorage.setVoiceLength(jsonObject.getString("voicelength"));
                    dataStorage.setVoiceTime(jsonObject.getString("voicetime"));
                    dataStorage.setVoiceUri(jsonObject.getString("voiceuri"));
                    dataStorage.setWechatUrl(jsonObject.getString("weixin_url"));
                    dataStorage.setUserHeadImg(jsonObject.getString("profile_image"));

                    dataStorage.save();
                }
                return true;
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static BestSister handleBestSisterResponse(String response)
    {
        try
        {
            return new Gson().fromJson(response,BestSister.class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
