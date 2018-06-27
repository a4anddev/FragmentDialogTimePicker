package c.verbswithexample.fragmentdialogtimepicker;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

public class DialogTime extends DialogFragment implements View.OnClickListener{

    View view;
    TimePicker tm;
    Button btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.time_picker, container,false);

        tm = view.findViewById(R.id.tm);
        btn = view.findViewById(R.id.btn);

        btn.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {

        this.dismiss();
        String timeOn = tm.getHour() + " : " + tm.getMinute();

        // get mainactivity here and call method of mainactivity here
        MainActivity ma = (MainActivity)getActivity();
        ma.SetTime(timeOn);

    }
}



