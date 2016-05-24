package com.example.haroonghawsi.assignment6_1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
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
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText uName;
    Button btnDatePicker, btnTimePicker, submitForm;
    TextView txtDate, txtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;
    Vector<String> formData;

    String[] places;
    String info, place;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formData= new Vector<String>();

        uName = (EditText) findViewById(R.id.edit_eventName);
        btnDatePicker = (Button) findViewById(R.id.event_date);
        btnTimePicker = (Button) findViewById(R.id.event_time);
        txtDate = (TextView) findViewById(R.id.edit_date);
        txtTime = (TextView) findViewById(R.id.edit_time);
        submitForm=(Button) findViewById(R.id.btn_Submit) ;

        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);
        submitForm.setOnClickListener(this);

        places = getResources().getStringArray(R.array.event_placeArray);

        Spinner placeSpinner = (Spinner) findViewById(R.id.place_spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, places);

        placeSpinner.setAdapter(adapter);


        placeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                place = arg0.getSelectedItem().toString();
               // int index = arg0.getSelectedItemPosition();

               // Toast.makeText(getApplicationContext(), "Selected item: " + places[index], Toast.LENGTH_SHORT).show();;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

    @Override
    public void onClick(View v) {

        if( v == btnDatePicker){
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener(){
                public void onDateSet(DatePicker view, int year, int monthOfYear,int dayOfMonth){
                    txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                }
            }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
       else if(v == btnTimePicker){
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener(){

                public void onTimeSet(TimePicker view, int hourOfDay, int minute){
                    txtTime.setText(hourOfDay + ":" + minute);
                }
            }, mHour, mMinute, false);
            timePickerDialog.show();
        }
       else if(v == submitForm){

            info = uName.getText().toString() + " " + place + " " + txtDate.getText().toString() + " " + txtTime.getText().toString();

            Spinner formDateSpinner = (Spinner) findViewById(R.id.show_data);
            formData.add(info);
            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, formData);

            formDateSpinner.setAdapter(adapter1);
        }
    }
}
