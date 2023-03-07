package leicher.blossom.recyclerview.data;

import leicher.blossom.recyclerview.BlossomData;

public class BlossomDataLevel1 implements BlossomData {

   private int index;

   public BlossomDataLevel1(int index) {
      this.index = index;
   }

   public int getIndex() {
      return index;
   }

   public void setIndex(int index) {
      this.index = index;
   }
}
