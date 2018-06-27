package c.verbswithexample.fragmentdialogtimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get fragment manager
                android.app.FragmentManager fm = getFragmentManager();
                // Add fragment class name
                DialogTime dialogTime = new DialogTime();

                // show Fragment here
                dialogTime.show(fm, "Show Fragment");
            }
        });
    }

    public void SetTime (String Time){

        Toast.makeText(this, "" + Time, Toast.LENGTH_SHORT).show();

    }



}












