package vastralaya.clotheswear.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import vastralaya.clotheswear.R;
import vastralaya.clotheswear.entity.Cloth;

public class ClothAdapter extends RecyclerView.Adapter<ClothAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(Cloth item);
    }

    private final List<Cloth> items;
    private final OnItemClickListener listener;

    public ClothAdapter(List<Cloth> items, OnItemClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    @Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_cloth, parent, false);
        return new ViewHolder(v);
    }

    @Override public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(items.get(position), listener);
    }

    @Override public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;
        private ImageView ivImage;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);
        }

        public void bind(final Cloth item, final OnItemClickListener listener) {
            Context context = itemView.getContext();
            tvTitle.setText(item.getTitle());
            Picasso.with(context).load(context.getResources().getIdentifier(item.getImageName(), "drawable", context.getPackageName())).into(ivImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
