package leicher.blossom.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BlossomVH extends RecyclerView.ViewHolder {

   public BlossomVH(@NonNull View itemView) {
      super(itemView);
   }

   public abstract void onBindViewHolder(BlossomDH blossomDH, int position, int localPosition);

}
