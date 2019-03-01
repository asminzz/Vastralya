package vastralaya.clotheswear.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import vastralaya.clotheswear.R;
import vastralaya.clotheswear.activity.DetailActivity;
import vastralaya.clotheswear.adapter.ClothAdapter;
import vastralaya.clotheswear.entity.Cloth;


public class TrendingFragment extends Fragment {
    private RecyclerView rvShirt, rvPant, rvShoe;

    public TrendingFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_trending, container, false);
        rvShirt = (RecyclerView) view.findViewById(R.id.rvShirt);
        rvPant = (RecyclerView) view.findViewById(R.id.rvPant);
        rvShoe = (RecyclerView) view.findViewById(R.id.rvShoe);

        shirt();
        pant();
        shoe();

        return view;
    }

    private void shirt() {
        List<Cloth> shirts = new ArrayList<>();
        for(int i=0;i<8;i++) {
             Cloth cloth = new Cloth();
             switch (i)
             {
                 case 0: {
                     cloth.setTitle("Black");
                     cloth.setDescription("Made in Japan");
                     cloth.setImageName("shirt_two");
                     cloth.setSize(28);
                     break;
                 }
                 case 1: {
                     cloth.setTitle("Light");
                     cloth.setDescription("Made in Italy");
                     cloth.setImageName("shirt");
                     cloth.setSize(28);
                     break;
                 }
                 case 2: {
                     cloth.setTitle("Green");
                     cloth.setDescription("Made in Italy");
                     cloth.setImageName("shirt_three");
                     cloth.setSize(28);
                     break;
                 }
                 case 5: {
                     cloth.setTitle("Yellow");
                     cloth.setDescription("Made in Italy");
                     cloth.setImageName("shirt_four");
                     cloth.setSize(28);
                     break;
                 }
                 case 3: {
                     cloth.setTitle("Grey");
                     cloth.setDescription("Made in Italy");
                     cloth.setImageName("shirt_five");
                     cloth.setSize(28);
                     break;
                 }
                 case 6: {
                     cloth.setTitle("White");
                     cloth.setDescription("Made in Italy");
                     cloth.setImageName("shirt_six");
                     cloth.setSize(28);
                     break;
                 }
                 case 4: {
                     cloth.setTitle("Red");
                     cloth.setDescription("Made in Italy");
                     cloth.setImageName("shirt_seven");
                     cloth.setSize(28);
                     break;
                 }
                 case 7: {
                     cloth.setTitle("White");
                     cloth.setDescription("Made in Italy");
                     cloth.setImageName("shirt");
                     cloth.setSize(28);
                     break;
                 }

             }
                 shirts.add(cloth);
                 rvShirt.setAdapter(new ClothAdapter(shirts,
                         new ClothAdapter.OnItemClickListener() {
                             @Override
                             public void onItemClick(Cloth item) {
                                 showDetailActivity(item);
                             }
                         }));

        }
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvShirt.setLayoutManager(layoutManager);
    }

    private void pant() {
        List<Cloth> pant = new ArrayList<>();
        for(int i=0;i<10;i++) {
            Cloth cloth = new Cloth();
            if (i%3== 0) {
                cloth.setTitle("Black");
                cloth.setDescription("Made in Japan");
                cloth.setImageName("pant");
            }else if(i%2==0){
                cloth.setTitle("Blue");
                cloth.setDescription("Made in Italy");
                cloth.setImageName("pant_two");
            }
            else{
                cloth.setTitle("White");
                cloth.setDescription("Made in Italy");
                cloth.setImageName("pant_three");
            }


            pant.add(cloth);
            rvPant.setAdapter(new ClothAdapter(pant,
                    new ClothAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(Cloth item) {
                            showDetailActivity(item);
                        }
                    }));
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvPant.setLayoutManager(layoutManager);
    }

    private void shoe() {
        List<Cloth> shoe = new ArrayList<>();
        for(int i=0;i<10;i++) {
            Cloth cloth = new Cloth();
            if (i%2 == 0) {
                cloth.setTitle("Black");
                cloth.setDescription("Made in Japan");
                cloth.setImageName("shoe");
            }else {
                cloth.setTitle("White");
                cloth.setDescription("Made in Italy");
                cloth.setImageName("shoe_two");
            }
            shoe.add(cloth);
            rvShoe.setAdapter(new ClothAdapter(shoe,
                    new ClothAdapter.OnItemClickListener() {
                        @Override
                        public void onItemClick(Cloth item) {
                            showDetailActivity(item);
                        }
                    }));
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvShoe.setLayoutManager(layoutManager);
    }

    private void showDetailActivity(Cloth item) {
        Intent intent = new Intent(getActivity(), DetailActivity.class);
        intent.putExtra("title", "Trending");
        intent.putExtra("cloth", item);
        getActivity().startActivity(intent);
    }
}
