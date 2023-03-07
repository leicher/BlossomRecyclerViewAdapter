package leicher.blossom.recyclerview.viewholder;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.MessageFormat;

import leicher.blossom.databinding.LayoutLevel1Binding;
import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.ViewBindingVH;
import leicher.blossom.recyclerview.dataholder.BlossomDataHolderLevel1;

public class BlossomViewHolderLevel1 extends ViewBindingVH<LayoutLevel1Binding> {

   public BlossomViewHolderLevel1(@NonNull ViewGroup parent, LayoutLevel1Binding binding) {
      super(parent, binding);
   }

   @Override
   protected void onBinding(LayoutLevel1Binding binding) {

   }

   @Override
   public void onBindViewHolder(BlossomDH data, int position, int localPosition) {
      binding.text.setText("BlossomViewHolderLevel1");
      binding.getRoot().setOnClickListener(v -> {
         BlossomDataHolderLevel1 holder = (BlossomDataHolderLevel1) data;
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
