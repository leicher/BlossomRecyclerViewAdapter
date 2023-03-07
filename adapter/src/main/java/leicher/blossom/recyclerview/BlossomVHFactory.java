package leicher.blossom.recyclerview;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

public interface BlossomVHFactory {
   BlossomVH createViewHolder(@NonNull ViewGroup parent, int viewType);
}
