package leicher.blossom.recyclerview.data;

import leicher.blossom.recyclerview.BlossomData;

public class BlossomDataLevel2 implements BlossomData {

   private int index;

   public BlossomDataLevel2(int index) {
      this.index = index;
   }

   public int getIndex() {
      return index;
   }

   public void setIndex(int index) {
      this.index = index;
   }
}
