package shubhangi.arrayadapter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spnCountries;
    AutoCompleteTextView txtBranch;

    String [] countries = {"Select country","India","USA","Japan","China"};
    String [] branch = {"Select branch","Mechanical","E&C","Civil"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnCountries = findViewById(R.id.spnCountries);
        txtBranch = findViewById(R.id.txtBranch);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>
                (this,android.R.layout.simple_dropdown_item_1line,countries);

        spnCountries.setAdapter(countryAdapter);

        ArrayAdapter<String> branchAdapter = new ArrayAdapter<>
                (this,android.R.layout.simple_dropdown_item_1line,branch);

        txtBranch.setThreshold(1);
        txtBranch.setTextColor(Color.RED);
        txtBranch.setAdapter(branchAdapter);



    }
}
