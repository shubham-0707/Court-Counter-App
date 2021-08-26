package android.example.courtcounter;

import android.app.Activity;
import android.example.courtcounter.R;
import android.os.Bundle;
import android.view.View;

import java.text.NumberFormat;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int number = 0;
    int message = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(int message1) {
        TextView basket1TextView = (TextView) findViewById(
                R.id.basket1_text_view);
        basket1TextView.setText("" + message1);
    }

    private void displayMessage(int message2) {
        TextView basket2TextView = (TextView) findViewById(R.id.basket2_text_view);
        basket2TextView.setText("" + message2);
    }

    public void incrementby1A(View view) {
        number = number + 1;
        display(number);
    }

    public void incrementby2A(View view) {
        number = number + 2;
        display(number);
    }

    public void incrementby3A(View view) {
        number = number + 3;
        display(number);
    }

    public void incrementby1B(View view) {
        message = message + 1;
        displayMessage(message);
    }

    public void incrementby2B(View view) {
        message = message + 2;
        displayMessage(message);
    }

    public void incrementby3B(View view) {
        message = message + 3;
        displayMessage(message);
    }

    public void reset(View view) {
        message = 0;
        number = 0;
        display(message);
        displayMessage(number);
    }

}
