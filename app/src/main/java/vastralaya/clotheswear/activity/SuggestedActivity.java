package vastralaya.clotheswear.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import vastralaya.clotheswear.R;

public class SuggestedActivity extends AppCompatActivity {

    private TextView tvShirtTitle, tvShirtDescription,
            tvPantTitle, tvPantDescription, tvShoeTitle, tvShoeDescription;
    private ImageView ivShirt, ivPant, ivShoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggested);
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

        tvShirtTitle = (TextView) findViewById(R.id.tvShirtTitle);
        tvShirtDescription = (TextView) findViewById(R.id.tvShirtDescription);
        tvPantTitle = (TextView) findViewById(R.id.tvPantTitle);
        tvPantDescription = (TextView) findViewById(R.id.tvPantDescription);
        tvShoeTitle = (TextView) findViewById(R.id.tvShoeTitle);
        tvShoeDescription = (TextView) findViewById(R.id.tvShoeDescription);

        ivShirt = (ImageView) findViewById(R.id.ivShirt);
        ivPant = (ImageView) findViewById(R.id.ivPant);
        ivShoe = (ImageView) findViewById(R.id.ivShoe);

        if (title.equalsIgnoreCase("relationships")) {
            tvShirtTitle.setText("Color : Red");
            tvShirtDescription.setText("Planet : SUN will be strengthen your romantic side");
            tvPantTitle.setText("Color : Black");
            tvPantDescription.setText("Planet Saturn will be beneficial to keep away obstacles");
            tvShoeTitle.setText("Color : Mix");
            tvShoeDescription.setText("North Node Rahu will keep things full of excitement !");
            drawImage("shirt_seven", ivShirt);
            drawImage("pant", ivPant);
            drawImage("shoe", ivShoe);

        } else if (title.equalsIgnoreCase("education")) {
            tvShirtTitle.setText("Color : Yellow");
            tvShirtDescription.setText("Plant : JUPITER will be favorable for gaining knowledge");
            tvPantTitle.setText("Color : Blue");
            tvPantDescription.setText("Planet : VENUS will make you research oriented");
            tvShoeTitle.setText("Color : Black and Blue");
            tvShoeDescription.setText("South Node Ketu will keep your focus");
            drawImage("shirt", ivShirt);
            drawImage("pant_two", ivPant);
            drawImage("shoe_two", ivShoe);
        } else {
            tvShirtTitle.setText("Color : Yellow");
            tvShirtDescription.setText("Plant : JUPITER will be favorable for this activity");
            tvPantTitle.setText("Color : Blue");
            tvPantDescription.setText("Planet : VENUS will make you skillful");
            tvShoeTitle.setText("Color : Black and blue");
            tvShoeDescription.setText("South Node Ketu will keep focused");
            drawImage("shirt_four", ivShirt);
            drawImage("pant", ivPant);
            drawImage("shoe", ivShoe);
        }
    }

    private void drawImage(String imageName, ImageView imageView) {
        Picasso.with(this).load(getResources().getIdentifier(imageName, "drawable", getPackageName())).into(imageView);
    }
}
