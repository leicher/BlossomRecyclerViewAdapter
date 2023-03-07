package leicher.blossom.recyclerview.viewholder;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.MessageFormat;

import leicher.blossom.databinding.LayoutLevel2Binding;
import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.ViewBindingVH;
import leicher.blossom.recyclerview.dataholder.BlossomDataHolderLevel2;

public class BlossomViewHolderLevel2 extends ViewBindingVH<LayoutLevel2Binding> {
   public BlossomViewHolderLevel2(@NonNull ViewGroup parent, LayoutLevel2Binding binding) {
      super(parent, binding);
   }

   @Override
   protected void onBinding(LayoutLevel2Binding binding) {

   }

   @Override
   public void onBindViewHolder(BlossomDH data, int position, int localPosition) {
      binding.text.setText("BlossomViewHolderLevel2");
      binding.getRoot().setOnClickListener(v -> {
         BlossomDataHolderLevel2 holder = (BlossomDataHolderLevel2) data;
         boolean expanded = holder.isExpanded();
         int itemCount = holder.getItemCount();
         holder.setExpanded(!expanded);
         RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter = getBindingAdapter();
         if (adapter != null) {
            if (expanded){
               adapter.notifyItemRangeRemoved(position + 1, itemCount - 1);
            }else {
               adapter.notifyItemRangeInserted(position + 1, holder.getItemCount() - 1);
            }
         }
      });
   }
}
