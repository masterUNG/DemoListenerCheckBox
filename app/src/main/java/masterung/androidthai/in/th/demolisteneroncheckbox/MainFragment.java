package masterung.androidthai.in.th.demolisteneroncheckbox;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        CheckBox Controller
        checkBoxController();
    }

    private void checkBoxController() {
        final CheckBox checkBox = getView().findViewById(R.id.checkboxStatus);
        final ImageView imageView = getView().findViewById(R.id.imageViewShow);
        final int[] ints = new int[]{R.drawable.zoro, R.drawable.full};
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox.isChecked()) {
                    imageView.setImageResource(ints[1]);
                } else {
                    imageView.setImageResource(ints[0]);
                }

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
