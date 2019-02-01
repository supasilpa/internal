package com.sup.administrator.internalmarkcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11;
    Button b;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
    Integer n1,n2,n3,n4,n5,n6,n7,n8,n9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.rno);
        e2=(EditText)findViewById(R.id.subname);
        e3=(EditText)findViewById(R.id.submark);
        e4=(EditText)findViewById(R.id.subtot);
        e5=(EditText)findViewById(R.id.sub2name);
        e6=(EditText)findViewById(R.id.sub2mark);
        e7=(EditText)findViewById(R.id.subtot2);
        e8=(EditText)findViewById(R.id.sub3name);
        e9=(EditText)findViewById(R.id.sub3mark);
        e10=(EditText)findViewById(R.id.subtot3);
        e11=(EditText)findViewById(R.id.res);
        b=(Button)findViewById(R.id.calc);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();
                s7=e7.getText().toString();
                s8=e8.getText().toString();
                s9=e9.getText().toString();
                s10=e10.getText().toString();


                n1=Integer.parseInt(s3);
                n2=Integer.parseInt(s4);
                n3=Integer.parseInt(s6);
                n4=Integer.parseInt(s7);
                n5=Integer.parseInt(s9);
                n6=Integer.parseInt(s10);

                n7=n1+n3+n5;
                n8=n2+n4+n6;
                n9=((n7*100)/n8);
//                s11=String.valueOf(n9);
//                s12=String.valueOf(n8);
//                Intent i=new Intent(getApplicationContext(),calculation.class);
//                startActivity(i);
               if(n9 >= 95)
               {
                   s11=String.valueOf(n9);
                    e11.setVisibility(View.VISIBLE);
                   e11.setText(s11);
                   Toast.makeText(getApplicationContext(),"S",Toast.LENGTH_LONG).show();

               }
                else if(n9<=95 &&n9>80)
               {
                   s11=String.valueOf(n9);
                   e11.setVisibility(View.VISIBLE);
                   e11.setText(s11);
                   Toast.makeText(getApplicationContext(),"A+",Toast.LENGTH_LONG).show();
               }
                else if (n9<=80 && n9>70)
               {
                   s11=String.valueOf(n9);
                   e11.setVisibility(View.VISIBLE);
                   e11.setText(s11);
                   Toast.makeText(getApplicationContext(),"A",Toast.LENGTH_LONG).show();
               }
               else if (n9<=70 && n9>60)
               {
                   s11=String.valueOf(n9);
                   e11.setVisibility(View.VISIBLE);
                   e11.setText(s11);
                   Toast.makeText(getApplicationContext(),"b+",Toast.LENGTH_LONG).show();
               }
               else if (n9<=60 && n9>50)
               {
                   s11=String.valueOf(n9);
                   e11.setVisibility(View.VISIBLE);
                   e11.setText(s11);
                   Toast.makeText(getApplicationContext(),"B",Toast.LENGTH_LONG).show();
               }
               else if (n9<=50 && n9>40)
               {
                   s11=String.valueOf(n9);
                   e11.setVisibility(View.VISIBLE);
                   e11.setText(s11);
                   Toast.makeText(getApplicationContext(),"c+",Toast.LENGTH_LONG).show();
               }
                else
               {
                   s11=String.valueOf(n9);
                   e11.setVisibility(View.VISIBLE);
                   e11.setText(s11);
                   Toast.makeText(getApplicationContext(),"failed",Toast.LENGTH_LONG).show();
               }



            }
        });
    }
}
