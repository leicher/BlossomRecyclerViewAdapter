package leicher.blossom.recyclerview.dataholder;

import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.data.BlossomDataLevel3;
import leicher.blossom.recyclerview.impl.BlossomDHImpl;

public class BlossomDataHolderLevel3 extends BlossomDHImpl<BlossomDataLevel3> {

   public BlossomDataHolderLevel3() {
   }

   public BlossomDataHolderLevel3(BlossomDataLevel3 mSelfBlossomData) {
      super(mSelfBlossomData);
   }

   public BlossomDataHolderLevel3(BlossomDH mParent) {
      super(mParent);
   }

   public BlossomDataHolderLevel3(BlossomDataLevel3 mSelfBlossomData, BlossomDH mParent) {
      super(mSelfBlossomData, mParent);
   }

   @Override
   public int getSelfViewType() {
      return 2;
   }
}
