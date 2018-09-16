package com.example.a1.bestnosister.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a1.bestnosister.R;
import com.example.a1.bestnosister.gson.BestSister;
import com.example.a1.bestnosister.gson.Body;
import com.example.a1.bestnosister.util.HttpUtil;
import com.example.a1.bestnosister.util.Utility;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    protected Handler mHandler = new Handler();
    private String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView)findViewById(R.id.text_view);

                String url = "http://route.showapi.com/255-1?showapi_appid=75139&showapi_sign=78d959c1d72941968d1e4af1da34f03c";
                String appId = "";
                String secret = "";
                HttpUtil.sendOkHttpRequest(url, new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Toast.makeText(MainActivity.this,"请求失败",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        final String text = response.body().string();
                        final BestSister bestSister = Utility.handleBestSisterResponse(text);
                        //Log.d(TAG,"Reponse :" + bestSister.showApiCode);
                        runOnUiThread(new Runnable()
                        {
                            @Override
                            public void run() {

                                if (bestSister != null && "0".equals(bestSister.showApiCode)) {

                                    for (Body.PageBean.ContentList contentList : bestSister.showApiBody.pageBean.mContentList) {
                                        textView.setText(contentList.UserHeadImg);
                                    }
                                    //textView.setText(text);
                                }
                            }
                        });

                        Log.d(TAG,text);
                        /*
                        if(bestSister!= null && "0".equals(bestSister.showApiCode))
                        {
                            textView.setText(text);
                        }
                        */
                    }
                });
                /*
                final String response = new ShowApiRequest(url,appId,secret)
                        .addTextPara("type","29")
                        .addTextPara("title","")
                        .addTextPara("page","1")
                        .post();

                System.out.print(response);
                Log.d("MainActivity",response);
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(response + "  " + new Date());
                    }
                });
                */


    }
}
