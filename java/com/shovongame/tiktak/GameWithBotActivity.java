package com.shovongame.tiktak;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GameWithBotActivity extends AppCompatActivity {

    ImageView a,b,c,d,e,f,g,h,i,img,cross,sircle;
    LinearLayout hide;
    Button btnc;
    TextView textv,to,tx;
    RelativeLayout reone,retow;

    boolean x,o,xx,oo;
    boolean oa,ob,oc,od,oe,of,og,oh,oi;
    boolean xa,xb,xc,xd,xe,xf,xg,xh,xi;
    boolean oka,okb,okc,okd,oke,okf,okg,okh,oki;

    int xwin,owin,draw,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_with_bot);
        xwin = 0;
        owin = 0;
        draw = 0;
        time = 0;

        //boolen..
        //x and o
        x = true;
        o = false;
        oo = false; //first o true
        xx = true; // first x is false

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
                if(o == true){
                    time = time + 1;
                    Shovon(R.raw.click); //sound
                    a.setImageResource(R.drawable.sircel); //set image
                    a.setClickable(false); // clicable false
                    oa = true; // detect a is full by O
                    o = false; // o is not selected
                    x = true; // x is selected
                    oka = true; // a is full for game drow
                    checko(); // check win  for o
                    okkcheck(); // game drow check  game is full

                }

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(o == true){
                    time = time + 1;
                    Shovon(R.raw.click);
                    b.setImageResource(R.drawable.sircel);
                    b.setClickable(false);
                    ob = true;
                    o = false;
                    x = true;
                    okb = true;
                    checko();
                    okkcheck();
                }
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(o == true){
                    time = time + 1;
                Shovon(R.raw.click);
                    c.setImageResource(R.drawable.sircel);
                    c.setClickable(false);
                    oc = true;
                    o = false;
                    x = true;
                    okc = true;
                    checko();
                    okkcheck();
                }

            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(o == true){
                    time = time + 1;
                Shovon(R.raw.click);
                    d.setImageResource(R.drawable.sircel);
                    d.setClickable(false);
                    od = true;
                    o = false;
                    x = true;
                    okd = true;
                    checko();
                    okkcheck();
                }

            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(o == true){
                   time = time + 1;
                Shovon(R.raw.click);
                    e.setImageResource(R.drawable.sircel);
                    e.setClickable(false);
                    oe = true;
                    o = false;
                    x = true;
                   oke = true;
                    checko();
                    okkcheck();
                }
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(o == true){
                    time = time + 1;
                Shovon(R.raw.click);
                    f.setImageResource(R.drawable.sircel);
                    f.setClickable(false);
                    of = true;
                    o = false;
                    x = true;
                    okf = true;
                    checko();
                    okkcheck();
                }

            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(o == true){
                   time = time + 1;
                Shovon(R.raw.click);
                    g.setImageResource(R.drawable.sircel);
                    g.setClickable(false);
                    og = true;
                    o = false;
                    x = true;
                   okg = true;
                    checko();
                    okkcheck();
                }
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(o == true){
                    time = time + 1;
                Shovon(R.raw.click);
                    h.setImageResource(R.drawable.sircel);
                    h.setClickable(false);
                    oh = true;
                    o = false;
                    x = true;
                    okh = true;
                    checko();
                    okkcheck();
                }

            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(o == true){
                    time = time + 1;
                Shovon(R.raw.click);
                    i.setImageResource(R.drawable.sircel);
                    i.setClickable(false);
                    oi = true;
                    o = false;
                    x = true;
                    oki = true;
                    checko();
                    okkcheck();
                }

            }
        });

        if(x == true){
            checko();
        }

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
            cross.setImageResource(R.drawable.bot_red);

        }else {
            cross.setImageResource(R.drawable.bot);
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
        }else{
            firstbot(time);
        }

    }

    public void checkx(){
        check();

        if(xa == true && xb == true && xc == true){
            a.setImageResource(R.drawable.bot_red);
            b.setImageResource(R.drawable.bot_red);
            c.setImageResource(R.drawable.bot_red);
            win("2");
            clickable();

        }else if (xd ==true && xe==true && xf==true){

            d.setImageResource(R.drawable.bot_red);
            e.setImageResource(R.drawable.bot_red);
            f.setImageResource(R.drawable.bot_red);
            win("2");
            clickable();
        }else if(xg ==true && xh == true && xi == true){

            g.setImageResource(R.drawable.bot_red);
            h.setImageResource(R.drawable.bot_red);
            i.setImageResource(R.drawable.bot_red);
            win("2");
            clickable();

        }else if(xa ==true && xd ==true && xg ==true){

            a.setImageResource(R.drawable.bot_red);
            d.setImageResource(R.drawable.bot_red);
            g.setImageResource(R.drawable.bot_red);
            win("2");
            clickable();

        }else if(xb ==true && xe == true && xh ==true){
            b.setImageResource(R.drawable.bot_red);
            e.setImageResource(R.drawable.bot_red);
            h.setImageResource(R.drawable.bot_red);
            win("2");
            clickable();

        }else if(xc == true && xf == true && xi == true){
            c.setImageResource(R.drawable.bot_red);
            f.setImageResource(R.drawable.bot_red);
            i.setImageResource(R.drawable.bot_red);
            win("2");
            clickable();

        }else if(xc ==true && xe == true && xg ==true){
            c.setImageResource(R.drawable.bot_red);
            e.setImageResource(R.drawable.bot_red);
            g.setImageResource(R.drawable.bot_red);
            win("2");
            clickable();

        }else if(xa == true && xe == true && xi == true){
            a.setImageResource(R.drawable.bot_red);
            e.setImageResource(R.drawable.bot_red);
            i.setImageResource(R.drawable.bot_red);
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
            img.setImageResource(R.drawable.bot);
            textv.setText("Winer Is Bot !");
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

        time = 0;
        if(oo == true){
            oo = false;
            xx = true;
            x = true;
            o = false;
            firstbot(time);


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

    private void setBotClick(String PositionX){

        if(PositionX == "a"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        a.setImageResource(R.drawable.bot);
                        a.setClickable(false);
                        xa = true;
                        x = false;
                        o = true;
                        checkx();
                        oka = true;
                        okkcheck();
                }

            } ,1000*2);
        }
        else if(PositionX == "b"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        b.setImageResource(R.drawable.bot);
                        b.setClickable(false);
                        xb = true;
                        x = false;
                        o = true;
                        checkx();
                        okb = true;
                        okkcheck();
                }

            } ,1000*2);
        }
        else if(PositionX == "c"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        c.setImageResource(R.drawable.bot);
                        c.setClickable(false);
                        xc = true;
                        x = false;
                        o = true;
                        checkx();
                        okc = true;
                        okkcheck();
        }

    } ,1000*2);
        }
        else if(PositionX == "d"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        d.setImageResource(R.drawable.bot);
                        d.setClickable(false);
                        xd = true;
                        x = false;
                        o = true;
                        checkx();
                        okd = true;
                        okkcheck();
                }

                } ,1000*2);
        }
        else if(PositionX == "e"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        e.setImageResource(R.drawable.bot);
                        e.setClickable(false);
                        x = false;
                        xe = true;
                        o = true;
                        checkx();
                        oke = true;
                        okkcheck();
                }

                } ,1000*2);

        }
        else if(PositionX == "f"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        f.setImageResource(R.drawable.bot);
                        f.setClickable(false);
                        xf = true;
                        x = false;
                        o = true;
                        checkx();
                        okf = true;
                        okkcheck();
                }

                } ,1000*2);
        }
        else if(PositionX == "g"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        g.setImageResource(R.drawable.bot);
                        g.setClickable(false);
                        xg = true;
                        x = false;
                        o = true;
                        checkx();
                        okg = true;
                        okkcheck();
                }

                } ,1000*2);
        }
        else if(PositionX == "h"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        h.setImageResource(R.drawable.bot);
                        h.setClickable(false);
                        xh = true;
                        x = false;
                        o = true;
                        checkx();
                        okh = true;
                        okkcheck();
                }

                } ,1000*2);
        }
        else if(PositionX == "i"){
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                        Shovon(R.raw.click);
                        i.setImageResource(R.drawable.bot);
                        i.setClickable(false);
                        xi = true;
                        x = false;
                        o = true;
                        checkx();
                        oki = true;
                        okkcheck();
                }

                } ,1000*2);
        }


    }

    private void firstbot(int t){

        if(t == 0){
            // for 1st time
            setBotClick("e");

        } else if(t == 1) {

                        if(oa == true){

                            if(oke == true) {
                                setBotClick("g");// x first
                            }else{
                                setBotClick("e"); // o first
                            }

                        }
                        else if(ob == true){

                            if(oke == true) {
                                setBotClick("a");
                            }else{
                                setBotClick("e");
                            }
                        }
                        else if(oc == true){

                            if(oke == true) {
                                setBotClick("i");
                            }else{
                                setBotClick("e");
                            }
                        }
                        else if(od == true){

                            if(oke == true) {
                                setBotClick("a");
                            }else{
                                setBotClick("e");
                            }
                        }
                        else if(oe == true){

                            if(oke == true) {
                                setBotClick("g");
                            }else{
                                setBotClick("g");
                            }
                        }
                        else if(of == true){

                            if(oke == true) {
                                setBotClick("c");
                            }else{
                                setBotClick("e");
                            }
                        }
                        else if(og == true){

                            if(oke == true) {
                                setBotClick("i");
                            }else{
                                setBotClick("e");
                            }
                        }
                        else if(oh == true){

                            if(oke == true) {
                                setBotClick("g");
                            }else{
                                setBotClick("e");
                            }
                        }
                        else if(oi == true){

                            if(oke == true) {
                                setBotClick("c");
                            }else{
                                setBotClick("e");
                            }
                        }

        }else if (t == 2){
            //middle first e
                 if( oe == true && oa == true ){ if(oki == false){setBotClick("i");} else{ auto(); }  }
            else if( oe == true && ob == true ){ if(okh == false){setBotClick("h");} else{ auto();}  }
            else if( oe == true && oc == true ){ if(okg == false){setBotClick("g");} else if(oka == false){setBotClick("a"); }  }
            else if( oe == true && od == true ){ if(okf == false){setBotClick("f");} else{ auto();}  }
            else if( oe == true && of == true ){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if( oe == true && og == true ){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if( oe == true && oh == true ){ if(okb == false){setBotClick("b");} else{auto(); }  }
            else if( oe == true && oi == true ){ if(oka == false){setBotClick("a");} else{auto(); }  }
            // a
            else if(oa == true && ob == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if(oa == true && oc == true){ if(okb == false){setBotClick("b");} else{ auto();}  }
            else if(oa == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(oa == true && of == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if(oa == true && og == true){ if(okd == false){setBotClick("d");} else{ auto();}  }
            else if(oa == true && oh == true){ if(okg == false){setBotClick("g");} else{auto(); }  }
            else if(oa == true && oi == true){ if(okc == false){setBotClick("c");} else if(okg == false){setBotClick("g");}  }
            //b
            else if(ob == true && oc == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(ob == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(ob == true && of == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            else if(ob == true && og == true){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if(ob == true && oh == true){ if(oka == false){setBotClick("a");} else{auto(); }  }
            else if(ob == true && oi == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            //c
            else if(oc == true && od == true){ if(oka == false){setBotClick("a");} else{auto(); }  }
            else if(oc == true && of == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && og == true){ if(oki == false){setBotClick("i");} else if(oka == false){setBotClick("a");}  }
            else if(oc == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && oi == true){ if(okf == false){setBotClick("f");} else{auto(); }  }
            //d
            else if(od == true && of == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(od == true && og == true){ if(oka == false){setBotClick("a");} else{auto(); }  }
            else if(od == true && oh == true){ if(okg == false){setBotClick("g");} else{auto(); }  }
            else if(od == true && oi == true){ if(okg == false){setBotClick("g");} else{auto(); }  }
            //f
            else if(of == true && og == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(of == true && oh == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(of == true && oi == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            //g
            else if(og == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(og == true && oi == true){ if(okh == false){setBotClick("h");} else{ auto();}  }
            //h
            else if(oh == true && oi == true){ if(okg == false){setBotClick("g");} else{ auto();}  }





        }else if (t == 3){
            //middle first e
            if( oe == true && oa == true ){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if( oe == true && ob == true ){ if(okh == false){setBotClick("h");} else{ auto();}  }
            else if( oe == true && oc == true ){ if(okg == false){setBotClick("g");} else{auto(); }  }
            else if( oe == true && od == true ){ if(okf == false){setBotClick("f");} else{auto(); }  }
            else if( oe == true && of == true ){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if( oe == true && og == true ){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if( oe == true && oh == true ){ if(okb == false){setBotClick("b");} else{ auto();}  }
            else if( oe == true && oi == true ){ if(oka == false){setBotClick("a");} else{ auto();}  }
            // a
            else if(oa == true && ob == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if(oa == true && oc == true){ if(okb == false){setBotClick("b");} else{auto(); }  }
            else if(oa == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(oa == true && of == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            else if(oa == true && og == true){ if(okd == false){setBotClick("d");} else{ auto();}  }
            else if(oa == true && oh == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(oa == true && oi == true){ if(okc == false){setBotClick("c");} else if(okg == false){setBotClick("g");}else{auto();}  }
            //b
            else if(ob == true && oc == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(ob == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(ob == true && of == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            else if(ob == true && og == true){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if(ob == true && oh == true){ if(oka == false){setBotClick("a");} else{auto(); }  }
            else if(ob == true && oi == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            //c
            else if(oc == true && od == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(oc == true && of == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && og == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(oc == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && oi == true){ if(okf == false){setBotClick("f");} else{ auto();}  }
            //d
            else if(od == true && of == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(od == true && og == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(od == true && oh == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(od == true && oi == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            //f
            else if(of == true && og == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(of == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(of == true && oi == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            //g
            else if(og == true && oh == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(og == true && oi == true){ if(okh == false){setBotClick("h");} else{ auto();}  }
            //h
            else if(oh == true && oi == true){ if(okg == false){setBotClick("g");} else{ auto();}  }

        }else if (t == 4){
            //middle first e
            if( oe == true && oa == true ){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if( oe == true && ob == true ){ if(okh == false){setBotClick("h");} else{ auto();}  }
            else if( oe == true && oc == true ){ if(okg == false){setBotClick("g");} else{auto(); }  }
            else if( oe == true && od == true ){ if(okf == false){setBotClick("f");} else{auto(); }  }
            else if( oe == true && of == true ){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if( oe == true && og == true ){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if( oe == true && oh == true ){ if(okb == false){setBotClick("b");} else{ auto();}  }
            else if( oe == true && oi == true ){ if(oka == false){setBotClick("a");} else{ auto();}  }
            // a
            else if(oa == true && ob == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if(oa == true && oc == true){ if(okb == false){setBotClick("b");} else{auto(); }  }
            else if(oa == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(oa == true && of == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            else if(oa == true && og == true){ if(okd == false){setBotClick("d");} else{ auto();}  }
            else if(oa == true && oh == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(oa == true && oi == true){ if(okc == false){setBotClick("c");} else if(okg == false){setBotClick("g");}else{auto();}  }
            //b
            else if(ob == true && oc == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(ob == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(ob == true && of == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            else if(ob == true && og == true){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if(ob == true && oh == true){ if(oka == false){setBotClick("a");} else{auto(); }  }
            else if(ob == true && oi == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            //c
            else if(oc == true && od == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(oc == true && of == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && og == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(oc == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && oi == true){ if(okf == false){setBotClick("f");} else{ auto();}  }
            //d
            else if(od == true && of == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(od == true && og == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(od == true && oh == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(od == true && oi == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            //f
            else if(of == true && og == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(of == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(of == true && oi == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            //g
            else if(og == true && oh == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(og == true && oi == true){ if(okh == false){setBotClick("h");} else{ auto();}  }
            //h
            else if(oh == true && oi == true){ if(okg == false){setBotClick("g");} else{ auto();}  }

        }else if (t == 5){
            //middle first e
            if( oe == true && oa == true ){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if( oe == true && ob == true ){ if(okh == false){setBotClick("h");} else{ auto();}  }
            else if( oe == true && oc == true ){ if(okg == false){setBotClick("g");} else{auto(); }  }
            else if( oe == true && od == true ){ if(okf == false){setBotClick("f");} else{auto(); }  }
            else if( oe == true && of == true ){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if( oe == true && og == true ){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if( oe == true && oh == true ){ if(okb == false){setBotClick("b");} else{ auto();}  }
            else if( oe == true && oi == true ){ if(oka == false){setBotClick("a");} else{ auto();}  }
            // a
            else if(oa == true && ob == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            else if(oa == true && oc == true){ if(okb == false){setBotClick("b");} else{auto(); }  }
            else if(oa == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(oa == true && of == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            else if(oa == true && og == true){ if(okd == false){setBotClick("d");} else{ auto();}  }
            else if(oa == true && oh == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(oa == true && oi == true){ if(okc == false){setBotClick("c");} else if(okg == false){setBotClick("g");}else{auto();}  }
            //b
            else if(ob == true && oc == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(ob == true && od == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(ob == true && of == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            else if(ob == true && og == true){ if(okd == false){setBotClick("d");} else{auto(); }  }
            else if(ob == true && oh == true){ if(oka == false){setBotClick("a");} else{auto(); }  }
            else if(ob == true && oi == true){ if(okc == false){setBotClick("c");} else{ auto();}  }
            //c
            else if(oc == true && od == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(oc == true && of == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && og == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(oc == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(oc == true && oi == true){ if(okf == false){setBotClick("f");} else{ auto();}  }
            //d
            else if(od == true && of == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(od == true && og == true){ if(oka == false){setBotClick("a");} else{ auto();}  }
            else if(od == true && oh == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            else if(od == true && oi == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
            //f
            else if(of == true && og == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(of == true && oh == true){ if(oki == false){setBotClick("i");} else{ auto();}  }
            else if(of == true && oi == true){ if(okc == false){setBotClick("c");} else{auto(); }  }
            //g
            else if(og == true && oh == true){ if(oki == false){setBotClick("i");} else{auto(); }  }
            else if(og == true && oi == true){ if(okh == false){setBotClick("h");} else{ auto();}  }
            //h
            else if(oh == true && oi == true){ if(okg == false){setBotClick("g");} else{ auto();}  }
        }
    }

    private void auto(){
        if(oka == false){setBotClick("a");}
        else if (okb == false){setBotClick("b");}
        else if (okc == false){setBotClick("c");}
        else if (okd == false){setBotClick("d");}
        else if (oke == false){setBotClick("e");}
        else if (okf == false){setBotClick("f");}
        else if (okg == false){setBotClick("g");}
        else if (okh == false){setBotClick("h");}
        else if (oki == false){setBotClick("i");}
    }




}

