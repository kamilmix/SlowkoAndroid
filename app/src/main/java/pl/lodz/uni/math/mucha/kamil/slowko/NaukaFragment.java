package pl.lodz.uni.math.mucha.kamil.slowko;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NaukaFragment extends Fragment {
    TextView textView;

    public NaukaFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nauka, container, false);

        textView = view.findViewById(R.id.textView3);
        textView.setText("ABC");
        return inflater.inflate(R.layout.fragment_nauka, container, false);
    }



    public static void setTextView(String text){


    }
}
