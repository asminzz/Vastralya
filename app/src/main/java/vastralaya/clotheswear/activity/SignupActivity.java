package vastralaya.clotheswear.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import vastralaya.clotheswear.R;

public class SignupActivity extends AppCompatActivity {

    private Context mContext;
    private Spinner spinnerDay, spinnerMonth, spinnerYear,spinnerSecond,spinnerMinute,spinnerHour, spinnerPlace;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mContext = this;
        // Spinner element
        spinnerDay = (Spinner) findViewById(R.id.spinnerDay);
        spinnerMonth = (Spinner) findViewById(R.id.spinnerMonth);
        spinnerYear = (Spinner) findViewById(R.id.spinnerYear);

        spinnerSecond = (Spinner) findViewById(R.id.spinnerSec);
        spinnerMinute = (Spinner) findViewById(R.id.spinnerMin);
        spinnerHour = (Spinner) findViewById(R.id.spinnerHr);

        spinnerPlace = (Spinner) findViewById(R.id.spinnerPlace);

        btnSignUp = (Button) findViewById(R.id.btnSignup);

        day();
        month();
        year();
        second();
        minute();
        hour();
        place();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void day() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> days = new ArrayList<Integer>();
        for (int i=1;i<=31;i++) {
            days.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, days);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerDay.setAdapter(dataAdapter);
    }

    private void month() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> months = new ArrayList<Integer>();
        for (int i=1;i<=12;i++) {
            months.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, months);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerMonth.setAdapter(dataAdapter);
    }

    private void year() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> years = new ArrayList<Integer>();
        for (int i=1940;i<=2018;i++) {
            years.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, years);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerYear.setAdapter(dataAdapter);
    }

    private void second() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> second = new ArrayList<Integer>();
        for (int i=0;i<60;i++) {
            second.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, second);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerSecond.setAdapter(dataAdapter);
    }

    private void minute() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> minute = new ArrayList<Integer>();
        for (int i=0;i<60;i++) {
            minute.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, minute);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerMinute.setAdapter(dataAdapter);
    }

    private void hour() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<Integer> hour = new ArrayList<Integer>();
        for (int i=0;i<=23;i++) {
            hour.add(i);
        }

        // Creating adapter for spinner
        ArrayAdapter<Integer> dataAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, hour);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerHour.setAdapter(dataAdapter);
    }
    private void place() {
        // Spinner click listener
        //spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String > place = new ArrayList<String>();
            place.add("Kathmandu, Nepal");
            place.add("Lalitpur, Nepal");
            place.add("Bhaktapur, Nepal");
            place.add("Delhi, India");
            place.add("Beijing, China");
            place.add("Shanghai, China");
            place.add("Bali, Indonesia");
            place.add("Kuala Lumpur, Malaysia");
            place.add("Sydney, Australia");
            place.add("Silicon Valley, USA");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, place);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerPlace.setAdapter(dataAdapter);
    }
}
