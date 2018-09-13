package edu.niu.z1829451.temporaryaccomodation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {

    private EditText emailEt, phoneEt, descEt, addressEt;
    private Button submitBtn;


    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add, container, false);

        emailEt = view.findViewById(R.id.email_et_id);
        phoneEt = view.findViewById(R.id.phone_et_id);
        descEt = view.findViewById(R.id.desc_et_id);
        addressEt = view.findViewById(R.id.address_et_id);
        submitBtn = view.findViewById(R.id.detail_submit_button);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailEt.getText().toString().equals("") || descEt.getText().toString().equals("")
                        || addressEt.getText().toString().equals("")){
                    Toast.makeText(getContext(), "Please enter Required details", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Success", Toast.LENGTH_SHORT).show();
                    //Upload the details here and close the fragment
                }
            }
        });
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_add, container, false);
        return view;
    }

//    private void submitDetails(View view){
//
//    }
}
