package vastralaya.clotheswear.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import vastralaya.clotheswear.R;
import vastralaya.clotheswear.activity.DetailActivity;
import vastralaya.clotheswear.activity.SuggestedActivity;
import vastralaya.clotheswear.activity.WebActivity;

public class SuggestionFragment extends Fragment implements View.OnClickListener{

    private Button btnBusiness, btnHealth, btnMarriage, btnEducation, btnRelationship, btnConsult;

    public SuggestionFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_suggestion, container, false);
        btnBusiness = (Button) view.findViewById(R.id.btnBusiness);
        btnHealth = (Button) view.findViewById(R.id.btnHealth);
        btnMarriage = (Button) view.findViewById(R.id.btnMarriage);
        btnEducation = (Button) view.findViewById(R.id.btnEducation);
        btnRelationship = (Button) view.findViewById(R.id.btnRelationship);
        btnConsult = (Button) view.findViewById(R.id.btnConsult);

        btnBusiness.setOnClickListener(this);
        btnHealth.setOnClickListener(this);
        btnMarriage.setOnClickListener(this);
        btnEducation.setOnClickListener(this);
        btnRelationship.setOnClickListener(this);


        btnConsult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WebActivity.class);
                getActivity().startActivity(intent);
            }
        });


        return view;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), SuggestedActivity.class);
        Button btn = (Button) v;
        intent.putExtra("title", btn.getText());
        getActivity().startActivity(intent);
    }
}
