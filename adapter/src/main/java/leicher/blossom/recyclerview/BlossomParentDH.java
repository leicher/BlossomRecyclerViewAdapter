package leicher.blossom.recyclerview;

public interface BlossomParentDH<T extends BlossomData, V extends BlossomDH> extends BlossomGenericDH<T>{

    boolean isExpanded();

    void setExpanded(boolean expanded);

}
