package leicher.blossom.recyclerview.dataholder;

import java.util.List;

import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.data.BlossomDataLevel2;
import leicher.blossom.recyclerview.impl.BlossomParentDHImpl;

public class BlossomDataHolderLevel2 extends BlossomParentDHImpl<BlossomDataLevel2, BlossomDataHolderLevel3> {

   public BlossomDataHolderLevel2() {
   }

   public BlossomDataHolderLevel2(BlossomDataLevel2 mSelfBlossomData) {
      super(mSelfBlossomData);
   }

   public BlossomDataHolderLevel2(BlossomDH mParent) {
      super(mParent);
   }

   public BlossomDataHolderLevel2(List<BlossomDataHolderLevel3> mChildren) {
      super(mChildren);
   }

   public BlossomDataHolderLevel2(BlossomDataLevel2 mSelfBlossomData, List<BlossomDataHolderLevel3> mChildren) {
      super(mSelfBlossomData, mChildren);
   }

   public BlossomDataHolderLevel2(BlossomDH mParent, List<BlossomDataHolderLevel3> mChildren) {
      super(mParent, mChildren);
   }

   public BlossomDataHolderLevel2(BlossomDataLevel2 mSelfBlossomData, BlossomDH mParent, List<BlossomDataHolderLevel3> mChildren) {
      super(mSelfBlossomData, mParent, mChildren);
   }

   @Override
   public int getSelfViewType() {
      return 1;
   }
}
