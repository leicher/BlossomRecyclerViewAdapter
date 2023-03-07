package leicher.blossom.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import leicher.blossom.databinding.LayoutLevel1Binding;
import leicher.blossom.databinding.LayoutLevel2Binding;
import leicher.blossom.databinding.LayoutLevel3Binding;
import leicher.blossom.recyclerview.viewholder.BlossomViewHolderLevel1;
import leicher.blossom.recyclerview.viewholder.BlossomViewHolderLevel2;
import leicher.blossom.recyclerview.viewholder.BlossomViewHolderLevel3;

public class BlossomVHFactoryImpl implements BlossomVHFactory {
   @Override
   public BlossomVH createViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater inflater = LayoutInflater.from(parent.getContext());
      switch (viewType) {
         case 0:
            return new BlossomViewHolderLevel1(parent, LayoutLevel1Binding.inflate(inflater, parent, false));
         case 1:
            return new BlossomViewHolderLevel2(parent, LayoutLevel2Binding.inflate(inflater, parent, false));
         case 2:
            return new BlossomViewHolderLevel3(parent, LayoutLevel3Binding.inflate(inflater, parent, false));
         default:
            return null;
      }
   }
}
