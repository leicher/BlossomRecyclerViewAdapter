package leicher.blossom.recyclerview;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;

public abstract class ViewBindingVH<T extends ViewBinding> extends BlossomVH {

   protected T binding;

   public ViewBindingVH(@NonNull ViewGroup parent, T binding) {
      super(binding.getRoot());
      this.binding = binding;
      onBinding(binding);
   }

   protected abstract void onBinding(T binding);

   public abstract void onBindViewHolder(BlossomDH data, int position, int localPosition);

}

