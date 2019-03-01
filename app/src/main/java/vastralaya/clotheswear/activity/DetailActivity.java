package vastralaya.clotheswear.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.squareup.picasso.Picasso;

import vastralaya.clotheswear.R;
import vastralaya.clotheswear.entity.Cloth;

public class DetailActivity extends AppCompatActivity {

    private TextView color;
    private TextView size;
    private TextView luck;
    private TextView availability;

    private Button btnAddToCollection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView ivImage = (ImageView) findViewById(R.id.ivImage);
        color = (TextView) findViewById(R.id.color);
        size = (TextView) findViewById(R.id.size);
        luck = (TextView) findViewById(R.id.lucky_for);
        btnAddToCollection = (Button) findViewById(R.id.btnAddToCollection);
        availability=(TextView) findViewById(R.id.availability);

        Context context=this;
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        String title = getIntent().getStringExtra("title");
        setTitle(title);
        Cloth cloth = (Cloth) getIntent().getSerializableExtra("cloth");
        if (!title.equalsIgnoreCase("trending")) {
            btnAddToCollection.setVisibility(View.GONE);
        }else  {
            btnAddToCollection.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    btnAddToCollection.setText("Added");
                    btnAddToCollection.setClickable(false);
                    Toast.makeText(DetailActivity.this, "Added to your collection", Toast.LENGTH_LONG).show();
                }
            });
        }
        if(cloth!=null) {
            Picasso.with(context).load(context.getResources().getIdentifier(cloth.getImageName(), "drawable", context.getPackageName())).into(ivImage);

            color.setText(cloth.getTitle());
            size.setText(String.valueOf(cloth.getSize()));

            if(cloth.getTitle().equalsIgnoreCase("yellow")){
                luck.setText(" Lucky for MONEY ");
                availability.setText("5th Floor Bishal Bazar, Dahal Boys Collection");
            }
            else{
                luck.setText(" Lucky for RELATIONSHIP ");
                availability.setText("2nd Floor UWTC, Baral's Collection");

            }
        }else {
            if (title.equalsIgnoreCase("business")) {

            }
        }



    }
}