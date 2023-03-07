package leicher.blossom.recyclerview.viewholder;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.text.MessageFormat;

import leicher.blossom.databinding.LayoutLevel3Binding;
import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.ViewBindingVH;

public class BlossomViewHolderLevel3 extends ViewBindingVH<LayoutLevel3Binding> {
   public BlossomViewHolderLevel3(@NonNull ViewGroup parent, LayoutLevel3Binding binding) {
      super(parent, binding);
   }

   @Override
   protected void onBinding(LayoutLevel3Binding binding) {

   }

   @Override
   public void onBindViewHolder(BlossomDH data, int position, int localPosition) {
      binding.text.setText("BlossomViewHolderLevel3");
   }
}
