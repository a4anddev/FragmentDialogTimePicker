package c.verbswithexample.fragmentdialogtimepicker;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShow, dialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShow = findViewById(R.id.btnShow);
        dialogBuilder = findViewById(R.id.dialogBuilder);



        dialogBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);

                alert.setMessage("are you sure you want to delete")
                .setTitle("Confirmation")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Toast.makeText(MainActivity.this, "Removed", Toast.LENGTH_SHORT).show();
                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Canceled", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();



            }
        });


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












