package com.example.haroonghawsi.assignment72;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.haroonghawsi.assignment72.R;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Vector;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText eName;
    Button datePicker, timePicker, submit, location;
    TextView dateView, timeView;
    private int mYear, mMonth, mDay, mHour, mMinute;
    Vector<String> allData;
    String[] places;
    String place, allFormData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = (EditText) findViewById(R.id.edit_eventName);
        datePicker = (Button) findViewById(R.id.pick_date);
        timePicker = (Button) findViewById(R.id.pick_time);
        submit = (Button) findViewById(R.id.event_Submit);
        location = (Button) findViewById(R.id.placesArray);
        dateView = (TextView) findViewById(R.id.edit_dateView);
        timeView = (TextView) findViewById(R.id.edit_timeView);
        allData = new Vector<String>();

        datePicker.setOnClickListener(this);
        timePicker.setOnClickListener(this);
        submit.setOnClickListener(this);
        location.setOnClickListener(this);


        places = getResources().getStringArray(R.array.placesArray);
    }

    public void onClick(View v){

        if (v == location) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Select Event Places");
            builder.setItems(places, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int item) {
                    place = places[item];
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        } else if (v == datePicker) {
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    dateView.setText(dayOfMonth + " - " + (monthOfYear + 1) + " - " + year);
                }
            }, mYear, mMonth, mDay);
            datePickerDialog.show();

        } else if (v == timePicker) {
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    timeView.setText(hourOfDay + " : " + minute);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();

        } else if (v == submit) {

            allFormData = eName.getText().toString() + " " + place + " " + dateView.getText().toString() + " " + timeView.getText().toString();
            Spinner formDataSpinner = (Spinner) findViewById(R.id.formData);
            allData.add(allFormData);

            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, allData);
            formDataSpinner.setAdapter(adapter1);
        }
    }



  /*  public void onActivityResult(int requestCode, int resultCode, Intent data){

        if(requestCode == loginRequestCode){
            if(resultCode == RESULT_OK){

            }
        }
    }*/
}
