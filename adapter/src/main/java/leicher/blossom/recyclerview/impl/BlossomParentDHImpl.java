package leicher.blossom.recyclerview.impl;

import java.util.List;

import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.BlossomData;
import leicher.blossom.recyclerview.BlossomParentDH;

public abstract class BlossomParentDHImpl<T extends BlossomData, V extends BlossomDH>
        extends BlossomDHImpl<T> implements BlossomParentDH<T, V> {

   private List<V> mChildren;
   private boolean expanded;

   public BlossomParentDHImpl() {}

   public BlossomParentDHImpl(T mSelfBlossomData) {
      super(mSelfBlossomData);
   }

   public BlossomParentDHImpl(BlossomDH mParent) {
      super(mParent);
   }

   public BlossomParentDHImpl(List<V> mChildren) {
      this.mChildren = mChildren;
   }

   public BlossomParentDHImpl(T mSelfBlossomData, List<V> mChildren) {
      super(mSelfBlossomData);
      this.mChildren = mChildren;
   }

   public BlossomParentDHImpl(BlossomDH mParent, List<V> mChildren) {
      super(mParent);
      this.mChildren = mChildren;
   }

   public BlossomParentDHImpl(T mSelfBlossomData, BlossomDH mParent, List<V> mChildren) {
      super(mSelfBlossomData, mParent);
      this.mChildren = mChildren;
   }

   public List<V> getChildren() {
      return mChildren;
   }

   public void setChildren(List<V> mChildren) {
      this.mChildren = mChildren;
   }

   @Override
   public boolean isExpanded() {
      return expanded;
   }

   @Override
   public void setExpanded(boolean expanded) {
      this.expanded = expanded;
   }

   @Override
   public int getItemCount() {
      int base = super.getItemCount();
      int child = 0;
      if (isExpanded()){
         if (mChildren != null){
            for (int i = 0; i < mChildren.size(); i++) {
               child += mChildren.get(i).getItemCount();
            }
         }
      }
      return base + child;
   }

   @Override
   public BlossomDH getDataHolder(int position, int localPosition) {
      int base = super.getItemCount();
      if (base > 0 && localPosition == 0) return super.getDataHolder(position, localPosition);
      if (isExpanded()){
         if (mChildren!= null){
            int total = base, count = base;
            for (int i = 0; i < mChildren.size(); i++) {
               V bean = mChildren.get(i);
               total += bean.getItemCount();
               if (total > localPosition){
                  return bean.getDataHolder(position, localPosition - count);
               }
               count = total;
            }
         }
      }
      throw new RuntimeException("position is out of range");
   }

   @Override
   public int getItemViewType(int position, int localPosition) {
      int base = super.getItemCount();
      if (base > 0 && localPosition == 0) return getSelfViewType();
      if (isExpanded()){
         if (mChildren != null){
            int total = base, count = base;
            for (int i = 0; i < mChildren.size(); i++) {
               V bean = mChildren.get(i);
               total += bean.getItemCount();
               if (total > localPosition){
                  return bean.getItemViewType(position, localPosition - count);
               }
               count = total;
            }
         }
      }
      throw new RuntimeException("position is out of range");
   }

   @Override
   public BlossomData getData(int position, int localPosition) {
      int base = super.getItemCount();
      if (base > 0 && localPosition == 0) return getSelfBlossomData();
      if (isExpanded()){
         if (mChildren != null){
            int total = base, count = base;
            for (int i = 0; i < mChildren.size(); i++) {
               V bean = mChildren.get(i);
               total += bean.getItemCount();
               if (total > localPosition){
                  return bean.getData(position, localPosition - count);
               }
               count = total;
            }
         }
      }
      throw new RuntimeException("position is out of range");
   }
}
