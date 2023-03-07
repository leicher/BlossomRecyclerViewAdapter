package leicher.blossom.recyclerview;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BlossomAdapter extends RecyclerView.Adapter<BlossomVH> {

   private final BlossomVHFactory mFactory;
   private List<BlossomDH> mData;

   public BlossomAdapter(BlossomVHFactory mFactory) {
      this.mFactory = mFactory;
   }

   public BlossomAdapter(BlossomVHFactory mFactory, List<BlossomDH> mData) {
      this.mFactory = mFactory;
      this.mData = mData;
   }

   public List<BlossomDH> getData() {
      return mData;
   }

   public void setData(List<BlossomDH> mData) {
      this.mData = mData;
   }

   @NonNull
   @Override
   public BlossomVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      return mFactory.createViewHolder(parent, viewType);
   }

   @Override
   public void onBindViewHolder(@NonNull BlossomVH holder, int position) {
      int count = 0, localPosition = 0;
      BlossomDH blossomDH = null;
      for (int i = 0; i < mData.size(); i++){
         blossomDH = mData.get(i);
         int total = count + blossomDH.getItemCount();
         if (position < total){
            localPosition = position - count;
            break;
         }
         count = total;
      }
      if (blossomDH != null){
         holder.onBindViewHolder(blossomDH.getDataHolder(position, localPosition), position, localPosition);
      }else {
         holder.onBindViewHolder(null, position, localPosition);
      }
   }

   @Override
   public int getItemViewType(int position) {
      int count = 0;
      for (int i = 0; i < mData.size(); i++){
         BlossomDH data = mData.get(i);
         int total = count + data.getItemCount();
         if (position < total){
            return data.getItemViewType(position, position - count);
         }
         count = total;
      }
      throw new RuntimeException("position is out of range");
   }

   @Override
   public int getItemCount() {
      int count = 0;
      if (mData != null){
         for (BlossomDH data: mData) {
            count += data.getItemCount();
         }
      }
      return count;
   }
}
