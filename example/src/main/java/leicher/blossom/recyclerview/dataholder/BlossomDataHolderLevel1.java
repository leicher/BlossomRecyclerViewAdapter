package leicher.blossom.recyclerview.dataholder;

import java.util.List;

import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.data.BlossomDataLevel1;
import leicher.blossom.recyclerview.impl.BlossomParentDHImpl;

public class BlossomDataHolderLevel1 extends BlossomParentDHImpl<BlossomDataLevel1, BlossomDataHolderLevel2> {

   public BlossomDataHolderLevel1() {
   }

   public BlossomDataHolderLevel1(BlossomDataLevel1 mSelfBlossomData) {
      super(mSelfBlossomData);
   }

   public BlossomDataHolderLevel1(BlossomDH mParent) {
      super(mParent);
   }

   public BlossomDataHolderLevel1(List<BlossomDataHolderLevel2> mChildren) {
      super(mChildren);
   }

   public BlossomDataHolderLevel1(BlossomDataLevel1 mSelfBlossomData, List<BlossomDataHolderLevel2> mChildren) {
      super(mSelfBlossomData, mChildren);
   }

   public BlossomDataHolderLevel1(BlossomDH mParent, List<BlossomDataHolderLevel2> mChildren) {
      super(mParent, mChildren);
   }

   public BlossomDataHolderLevel1(BlossomDataLevel1 mSelfBlossomData, BlossomDH mParent, List<BlossomDataHolderLevel2> mChildren) {
      super(mSelfBlossomData, mParent, mChildren);
   }

   @Override
   public int getSelfViewType() {
      return 0;
   }
}
