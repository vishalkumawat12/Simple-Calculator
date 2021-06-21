package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.faendir.rhino_android.RhinoAndroidHelper;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    TextView t;
    AppCompatButton ac,zero,one,two,three,four,five,six,seven,eight,nine,dot,open,close,plus,sub,mul,div,result,back;
    String data="";
    Context context;
    Scriptable scope;
    RhinoAndroidHelper rhinoAndroidHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back=findViewById(R.id.back);
        result=findViewById(R.id.result);
        t=findViewById(R.id.textView);
       ac=findViewById(R.id.ac);
        zero=findViewById(R.id.zero);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        dot=findViewById(R.id.dot);
        open=findViewById(R.id.open);
        close=findViewById(R.id.close);
        plus=findViewById(R.id.plus);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data="";
                t.setText(data);


            }
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(open.getTag());
                t.setText(data);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(close.getTag());
                t.setText(data);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    StringBuffer sb= new StringBuffer(data);
                    sb.deleteCharAt(sb.length()-1);
                    data=sb.toString();
                    t.setText(data);
                }
                catch (Exception e){

                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(zero.getTag());
                t.setText(data);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(one.getTag());
                t.setText(data);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(two.getTag());
                t.setText(data);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(three.getTag());
                t.setText(data);

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(four.getTag());
                t.setText(data);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(five.getTag());
                t.setText(data);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(six.getTag());
                t.setText(data);

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(seven.getTag());
                t.setText(data);
            }
        });



        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(eight.getTag());
                t.setText(data);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(nine.getTag());
                t.setText(data);

            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(dot.getTag());
                t.setText(data);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(plus.getTag());
                t.setText(data);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(sub.getTag());
                t.setText(data);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(mul.getTag());
                t.setText(data);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=data+(div.getTag());
                t.setText(data);
            }
        });




        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    rhinoAndroidHelper=new RhinoAndroidHelper(MainActivity.this);
                    context = rhinoAndroidHelper.enterContext();
                    context.setOptimizationLevel(1);
                    scope = new ImporterTopLevel(context);
                    String  finalAns=context.evaluateString(scope,data,"javascript",1,null).toString();
                    t.setText(finalAns);
                    data=finalAns;
                }
                catch (Exception exception){
                    t.setText("Error");
                    data="";

                }


            }
        });

    }
}