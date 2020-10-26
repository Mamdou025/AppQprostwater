package com.xstudioo.QprostX;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class annuelsb extends AppCompatActivity {
    EditText meditText , meditText2, meditText3 , meditText4 ,annee2;
    TextView mqprost , mbonbonne, mdifference;
    @SuppressLint({"ResourceType", "SetTextI18n"})
    public void Calcul2() {
        int mnumber;
        if(!meditText.getText().toString().equals("") && meditText.getText().length() > 0) {
            mnumber = Integer.parseInt(meditText.getText().toString());
        }
        else {
            mnumber = 0;
        }
        int mnumber2;
        if(!meditText2.getText().toString().equals("") && meditText2.getText().length() > 0) {
            mnumber2 = Integer.parseInt(meditText2.getText().toString());
        } else {
            mnumber2 = 0;
        }
        int mnumber3;
        if(!meditText3.getText().toString().equals("") && meditText3.getText().length() > 0) {
            mnumber3 = Integer.parseInt(meditText3.getText().toString());
        } else {
            mnumber3 = 0;
        }
        int mnumber4;
        if(!meditText4.getText().toString().equals("") && meditText4.getText().length() > 0) {
            mnumber4 = Integer.parseInt(meditText4.getText().toString());
        } else {
            mnumber4 = 0;
        }
        int mnumber5;
        if(!annee2.getText().toString().equals("") && annee2.getText().length() > 0) {
            mnumber5 = Integer.parseInt(annee2.getText().toString());
        } else {
            mnumber5 = 0;
        }
        mqprost.setText(" fontaines à bonbonne :  "+(mnumber3 +mnumber5*12* mnumber));
        mbonbonne.setText(" fontaines Qprost :  "+ ( (mnumber4+mnumber5*12* mnumber2)));
        mdifference.setText("Difference : "+ ((mnumber3 + mnumber5*12* mnumber)-(mnumber4+mnumber5*12* mnumber2)));
    }
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_annuels);
        Button mmenup = findViewById(R.id.mmenup);
        mmenup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                couleurs();
            }
        });
        Button menu2 = findViewById(R.id.menu2);
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqprost();
            }
        });
        meditText = findViewById(R.id.meditText);
        meditText2 = findViewById(R.id.meditText2);
        meditText3 = findViewById(R.id.meditText3);
        meditText4 = findViewById(R.id.meditText4);
        annee2= findViewById(R.id.annee2);
        mqprost = findViewById(R.id.mqprost);
        mbonbonne = findViewById(R.id.mbonbonne);
        mdifference = findViewById(R.id.mdifference);

        TextWatcher kholal = new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
            @SuppressLint({"SetTextI18n", "ResourceType"})
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                Calcul2();
            }
            public void afterTextChanged(Editable s) {
            }
        };

        meditText.addTextChangedListener(kholal);
        meditText2.addTextChangedListener(kholal);
        meditText3.addTextChangedListener(kholal);
        meditText4.addTextChangedListener(kholal);
        annee2.addTextChangedListener(kholal);

    }




    public void openqprost(){
        Intent intent =  new Intent(this,mensuels.class);
        startActivity(intent);
    }
    public void couleurs(){
        Intent intent =  new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}