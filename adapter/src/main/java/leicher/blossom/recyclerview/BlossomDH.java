package leicher.blossom.recyclerview;

public interface BlossomDH {

 int getItemCount();

 int getSelfViewType();

 default int getItemViewType(int position, int localPosition){
  return getSelfViewType();
 }

 default BlossomDH getParent(){
  return null;
 }

 BlossomDH getDataHolder(int position, int localPosition);

 BlossomData getData(int position, int localPosition);

}
