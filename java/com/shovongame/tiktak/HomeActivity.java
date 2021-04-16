package com.shovongame.tiktak;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class HomeActivity extends AppCompatActivity {

    Button friend,bot;
    private InterstitialAd mInterstitialAd;
    boolean a ,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        a = false;
        b = false;
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override public void onAdClosed() {
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

                if(a = true){
                    a = false;
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }else if(b = true){
                    b = false;
                    startActivity(new Intent(getApplicationContext(), GameWithBotActivity.class));
                }

            } });

        friend = (Button) findViewById(R.id.friend);
        bot = (Button) findViewById(R.id.bot);

        friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);
                a = true;
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    a = false;
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                }
            }
        });

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);
                b= true;
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    b = false;
                    startActivity(new Intent(getApplicationContext(), GameWithBotActivity.class));
                }
            }
        });


    }

    public void Shovon(int soundID){
        final MediaPlayer mp = MediaPlayer.create(this,soundID);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mp.release();
            }
        });
    }
}
