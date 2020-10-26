package com.xstudioo.QprostX;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextWatcher;
import android.text.Editable;

public class mensuels extends AppCompatActivity {
    private Button menu1;
    int number, number2, number3,number4,number5 , number6;
    EditText editText , editText2, editText3 , editText4, jours2,nmois ;
    TextView textView , textView2, textView5 ;
    @SuppressLint({"ResourceType", "SetTextI18n"})
    public void Calcul() {
        if(!editText.getText().toString().equals("") && editText.getText().length() > 0) {
            number = Integer.parseInt(editText.getText().toString());
        }
        else {
            number = 0;
        }
        if(!editText2.getText().toString().equals("") && editText2.getText().length() > 0) {
            number2 = Integer.parseInt(editText2.getText().toString());
        } else {
            number2 = 0;
        }
        if(!editText3.getText().toString().equals("") && editText3.getText().length() > 0) {
            number3 = Integer.parseInt(editText3.getText().toString());
        } else {
            number3 = 0;
        }
        if(!editText4.getText().toString().equals("") && editText4.getText().length() > 0) {
            number4 = Integer.parseInt(editText4.getText().toString());
        } else {
            number4 = 0;
        }
        if(!jours2.getText().toString().equals("") && jours2.getText().length() > 0) {
            number5 = Integer.parseInt(jours2.getText().toString());
        } else {
            number5 = 0;
        }
        if(!nmois.getText().toString().equals("") && nmois.getText().length() > 0) {
            number6 = Integer.parseInt(nmois.getText().toString());
        } else {
            number6 = 0;
        }
        textView.setText(" fontaines à bonbonne :  "+number6*(number4*number*number2*number3));
        textView2.setText(" fontaines Qprost :  "+ ((int)(number6* (number4*(number5 + 3.6*number2*number)))));
        textView5.setText("Difference : "+((int)(number4*number6*(number*number2*number3-number*number2*3.6-number5))));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensuels);
        Button menup = findViewById(R.id.menup);
        menup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                couleurs();
            }
        });
        menu1 =findViewById(R.id.menu1);
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQprostpage2();
            }
        });
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        nmois= findViewById(R.id.nmois);
        jours2= findViewById(R.id.jours2);
        textView = findViewById(R.id.qprost);
        textView2 = findViewById(R.id.bonbonne);
        textView5 = findViewById(R.id.difference);


        TextWatcher kholalm = new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @SuppressLint({"SetTextI18n", "ResourceType"})
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                Calcul();
            }
            public void afterTextChanged(Editable s) {
            }
        };

        editText.addTextChangedListener(kholalm);
        editText2.addTextChangedListener(kholalm);
        editText3.addTextChangedListener(kholalm);
        editText4.addTextChangedListener(kholalm);
        jours2.addTextChangedListener(kholalm);
        nmois.addTextChangedListener(kholalm);

    }


    public void openQprostpage2(){
        Intent intent =  new Intent(this, annuelsb.class);
        startActivity(intent);
    }
    public void couleurs(){
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}