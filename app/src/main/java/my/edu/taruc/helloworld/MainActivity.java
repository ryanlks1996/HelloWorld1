package my.edu.taruc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    //refer to any UI components
    public void displayName(View v){

        TextView textViewName;
        EditText editTextName;
        EditText editTextAge;


        textViewName = (TextView) findViewById(R.id.textViewName);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        int age = Integer.parseInt(editTextAge.getText().toString())+1;

        textViewName.setText(getString(R.string.greeting) + editTextName.getText()+", you will be " + age + " in 2018");

    }

    public void clearText(View v){

        TextView textViewName;

        textViewName = (TextView) findViewById(R.id.textViewName);
        textViewName.setText(" ");
    }

    public void removeText(View v){

        TextView textViewName;

        textViewName = (TextView) findViewById(R.id.textViewName);
        textViewName.setText(" ");
    }


}
