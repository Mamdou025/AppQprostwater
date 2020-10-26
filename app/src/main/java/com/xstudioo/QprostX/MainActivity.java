package com.xstudioo.QprostX;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;
import java.util.Calendar;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button annuelb =findViewById(R.id.annuelb);
        annuelb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page2();
            }
        });
        Toolbar toolbar;
        Button mensuelb = findViewById(R.id.mensuelb);
        mensuelb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page1();
            }
        });
        Button blocnotes2 = findViewById(R.id.blocnotes2);
        blocnotes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                page4();
            }
        });
    }
    public void page2(){
        Intent intent =  new Intent(this,mensuels.class);
        startActivity(intent);
    }
    public void page1(){
        Intent intent = new Intent(this, annuelsb.class);
        startActivity(intent);
    }
    public void page4(){
        Intent intent = new Intent(this, Meno.class);
        startActivity(intent);
    }
    public void Calendrier  (View view) {
        Calendar calendarEvent = Calendar.getInstance();
        Intent i = new Intent(Intent.ACTION_EDIT);
        i.setType("vnd.android.cursor.item/event");
        i.putExtra("beginTime", calendarEvent.getTimeInMillis());
        i.putExtra("allDay", true);
        i.putExtra("rule", "FREQ=YEARLY");
        i.putExtra("endTime", calendarEvent.getTimeInMillis() + 60 * 60 * 1000);
        i.putExtra("title", "Programme");
        startActivity(i);}
}