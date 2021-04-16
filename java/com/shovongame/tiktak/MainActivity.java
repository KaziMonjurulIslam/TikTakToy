package com.shovongame.tiktak;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

ImageView a,b,c,d,e,f,g,h,i,img,cross,sircle;
LinearLayout hide;
Button btnc;
TextView textv,to,tx;
RelativeLayout reone,retow;

 boolean x,o,xx,oo;
 boolean oa,ob,oc,od,oe,of,og,oh,oi;
 boolean xa,xb,xc,xd,xe,xf,xg,xh,xi;
 boolean oka,okb,okc,okd,oke,okf,okg,okh,oki;

 int xwin,owin,draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        xwin = 0;
        owin = 0;
        draw = 0;

        //boolen..
        //x and o
        x = false;
        o = true;
        oo = true;
        xx = false;

        //oa-oi
        oa = false;
        ob = false;
        oc = false;
        od = false;
        oe = false;
        of = false;
        og = false;
        oh = false;
        oi = false;
        //xa - xi
        xa = false;
        xb = false;
        xc = false;
        xd = false;
        xe = false;
        xf = false;
        xg = false;
        xh = false;
        xi = false;
        //itemokk
        oka  = false;
        okb = false;
        okc  = false;
        okd = false;
        oke = false;
        okf  = false;
        okg = false;
        okh = false;
        oki = false;






        //item ins..
        a =(ImageView) findViewById(R.id.a);
        b =(ImageView) findViewById(R.id.b);
        c =(ImageView) findViewById(R.id.c);
        d =(ImageView) findViewById(R.id.d);
        e =(ImageView) findViewById(R.id.e);
        f =(ImageView) findViewById(R.id.f);
        g =(ImageView) findViewById(R.id.g);
        h =(ImageView) findViewById(R.id.h);
        i =(ImageView) findViewById(R.id.i);
        img = (ImageView)findViewById(R.id.img) ;
        cross = (ImageView) findViewById(R.id.cross);
        sircle = (ImageView) findViewById(R.id.sircle);
        hide =(LinearLayout)findViewById(R.id.hide);
        reone = (RelativeLayout) findViewById(R.id.reone);
        retow = (RelativeLayout) findViewById(R.id.retwo);
        textv =(TextView) findViewById(R.id.textv);
        to =(TextView) findViewById(R.id.to);
        tx =(TextView) findViewById(R.id.tx);
        btnc =(Button) findViewById(R.id.btnc);

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clear();
                hide.setVisibility(View.GONE);
            }
        });

        Shovon(R.raw.newgame);
        check();

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);
                if(x == true){
                    a.setImageResource(R.drawable.cross);
                    a.setClickable(false);
                    xa = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    a.setImageResource(R.drawable.sircel);
                    a.setClickable(false);
                    oa = true;
                    o = false;
                    x = true;
                    checko();
                }

                oka = true;
                okkcheck();

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    b.setImageResource(R.drawable.cross);
                    b.setClickable(false);
                    xb = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    b.setImageResource(R.drawable.sircel);
                    b.setClickable(false);
                    ob = true;
                    o = false;
                    x = true;
                    checko();
                }
            okb = true;
                okkcheck();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    c.setImageResource(R.drawable.cross);
                    c.setClickable(false);
                    xc = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    c.setImageResource(R.drawable.sircel);
                    c.setClickable(false);
                    oc = true;
                    o = false;
                    x = true;
                    checko();
                }

            okc = true;
                okkcheck();
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    d.setImageResource(R.drawable.cross);
                    d.setClickable(false);
                    xd = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    d.setImageResource(R.drawable.sircel);
                    d.setClickable(false);
                    od = true;
                    o = false;
                    x = true;
                    checko();
                }

                okd = true;
                okkcheck();
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    e.setImageResource(R.drawable.cross);
                    e.setClickable(false);
                    x = false;
                    xe = true;
                    o = true;
                    checkx();

                }else{
                    e.setImageResource(R.drawable.sircel);
                    e.setClickable(false);
                    oe = true;
                    o = false;
                    x = true;
                    checko();
                }

                oke = true;
                okkcheck();
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    f.setImageResource(R.drawable.cross);
                    f.setClickable(false);
                    xf = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    f.setImageResource(R.drawable.sircel);
                    f.setClickable(false);
                    of = true;
                    o = false;
                    x = true;
                    checko();
                }

                okf = true;
                okkcheck();

            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    g.setImageResource(R.drawable.cross);
                    g.setClickable(false);
                    xg = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    g.setImageResource(R.drawable.sircel);
                    g.setClickable(false);
                    og = true;
                    o = false;
                    x = true;
                    checko();
                }

                okg = true;
                okkcheck();

            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    h.setImageResource(R.drawable.cross);
                    h.setClickable(false);
                    xh = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    h.setImageResource(R.drawable.sircel);
                    h.setClickable(false);
                    oh = true;
                    o = false;
                    x = true;
                    checko();
                }

                okh = true;
                okkcheck();

            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Shovon(R.raw.click);

                if(x == true){
                    i.setImageResource(R.drawable.cross);
                    i.setClickable(false);
                    xi = true;
                    x = false;
                    o = true;
                    checkx();

                }else{
                    i.setImageResource(R.drawable.sircel);
                    i.setClickable(false);
                    oi = true;
                    o = false;
                    x = true;
                    checko();
                }

                oki = true;
                okkcheck();

            }
        });



    }

    private void clickable(){

        a.setClickable(false);
        b.setClickable(false);
        c.setClickable(false);
        d.setClickable(false);
        e.setClickable(false);
        f.setClickable(false);
        g.setClickable(false);
        h.setClickable(false);
        i.setClickable(false);



    }

private void check(){

        if(o == true){
            sircle.setImageResource(R.drawable.sircel_red);

        }else {
            sircle.setImageResource(R.drawable.sircel);
        }


        if(x == true){
                cross.setImageResource(R.drawable.cross_red);

        }else {
                cross.setImageResource(R.drawable.cross);
            }

}

    public void checko(){
        check();

        if(oa == true && ob == true && oc == true){
            a.setImageResource(R.drawable.sircel_red);
            b.setImageResource(R.drawable.sircel_red);
            c.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();

        }else if (od ==true && oe==true && of==true){

            d.setImageResource(R.drawable.sircel_red);
            e.setImageResource(R.drawable.sircel_red);
            f.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();

        }else if(og ==true && oh == true && oi == true){

            g.setImageResource(R.drawable.sircel_red);
            h.setImageResource(R.drawable.sircel_red);
            i.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();


        }else if(oa ==true && od ==true && og ==true){
            a.setImageResource(R.drawable.sircel_red);
            d.setImageResource(R.drawable.sircel_red);
            g.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();


        }else if(ob ==true && oe == true && oh ==true){
            b.setImageResource(R.drawable.sircel_red);
            e.setImageResource(R.drawable.sircel_red);
            h.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();

        }else if(oc == true && of == true && oi == true){
            c.setImageResource(R.drawable.sircel_red);
            f.setImageResource(R.drawable.sircel_red);
            i.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();

        }else if(oc ==true && oe == true && og ==true){
            c.setImageResource(R.drawable.sircel_red);
            e.setImageResource(R.drawable.sircel_red);
            g.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();

        }else if(oa == true && oe == true && oi == true){
            a.setImageResource(R.drawable.sircel_red);
            e.setImageResource(R.drawable.sircel_red);
            i.setImageResource(R.drawable.sircel_red);
            win("1");
            clickable();
        }

    }

    public void checkx(){
        check();

        if(xa == true && xb == true && xc == true){
            a.setImageResource(R.drawable.cross_red);
            b.setImageResource(R.drawable.cross_red);
            c.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();

        }else if (xd ==true && xe==true && xf==true){

            d.setImageResource(R.drawable.cross_red);
            e.setImageResource(R.drawable.cross_red);
            f.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();
        }else if(xg ==true && xh == true && xi == true){

            g.setImageResource(R.drawable.cross_red);
            h.setImageResource(R.drawable.cross_red);
            i.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();

        }else if(xa ==true && xd ==true && xg ==true){

            a.setImageResource(R.drawable.cross_red);
            d.setImageResource(R.drawable.cross_red);
            g.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();

        }else if(xb ==true && xe == true && xh ==true){
            b.setImageResource(R.drawable.cross_red);
            e.setImageResource(R.drawable.cross_red);
            h.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();

        }else if(xc == true && xf == true && xi == true){
            c.setImageResource(R.drawable.cross_red);
            f.setImageResource(R.drawable.cross_red);
            i.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();

        }else if(xc ==true && xe == true && xg ==true){
            c.setImageResource(R.drawable.cross_red);
            e.setImageResource(R.drawable.cross_red);
            g.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();

        }else if(xa == true && xe == true && xi == true){
            a.setImageResource(R.drawable.cross_red);
            e.setImageResource(R.drawable.cross_red);
            i.setImageResource(R.drawable.cross_red);
            win("2");
            clickable();

        }

    }

    private void win(String v){
        Shovon(R.raw.win);
        reone.setVisibility(View.GONE);
        retow.setVisibility(View.GONE);
        if(v == "1"){
            hide.setVisibility(View.VISIBLE);
            img.setImageResource(R.drawable.sircel);
            textv.setText("Winer Is Sircle !");
            owin = owin + 1 ;


        } else if (v =="2") {
            hide.setVisibility(View.VISIBLE);
            img.setImageResource(R.drawable.cross);
            textv.setText("Winer Is Cross !");
            xwin = xwin + 1 ;
        }
    }

    private void okkcheck(){
        if(oka ==true && okb ==true && okc ==true && okd ==true && oke ==true && okf ==true && okg ==true && okh ==true && oki ==true){

            reone.setVisibility(View.GONE);
            retow.setVisibility(View.GONE);

            if(hide.getVisibility() == View.GONE){
                hide.setVisibility(View.VISIBLE);
                img.setImageResource(R.mipmap.ic_launcher_round);
                textv.setText("Game Over .. Try Again..");
                draw = draw + 1;
            }else{
                Toast.makeText(this, "Game Over..", Toast.LENGTH_SHORT).show();
            }

        }
    }


    private void clear(){

        if(oo == true){
            oo = false;
            xx = true;
            x = true;
            o = false;

        }else if(xx == true){
            xx = false;
            oo = true;
            x = false;
            o = true;
        }


        //oa-oi
        oa = false;
        ob = false;
        oc = false;
        od = false;
        oe = false;
        of = false;
        og = false;
        oh = false;
        oi = false;
        //xa - xi
        xa = false;
        xb = false;
        xc = false;
        xd = false;
        xe = false;
        xf = false;
        xg = false;
        xh = false;
        xi = false;

        //okk false
        oka  = false;
        okb = false;
        okc  = false;
        okd = false;
        oke = false;
        okf  = false;
        okg = false;
        okh = false;
        oki = false;

        //clear bg

        a.setImageResource(R.drawable.clear);
        b.setImageResource(R.drawable.clear);
        c.setImageResource(R.drawable.clear);
        d.setImageResource(R.drawable.clear);
        e.setImageResource(R.drawable.clear);
        f.setImageResource(R.drawable.clear);
        g.setImageResource(R.drawable.clear);
        h.setImageResource(R.drawable.clear);
        i.setImageResource(R.drawable.clear);

        a.setClickable(true);
        b.setClickable(true);
        c.setClickable(true);
        d.setClickable(true);
        e.setClickable(true);
        f.setClickable(true);
        g.setClickable(true);
        h.setClickable(true);
        i.setClickable(true);

        reone.setVisibility(View.VISIBLE);
        retow.setVisibility(View.VISIBLE);
        to.setText("Wins = "+ owin +"    Draw = "+ draw + " ");
        tx.setText("Wins = "+ xwin +"    Draw = "+ draw + " ");


        check();
    Shovon(R.raw.newgame);


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
