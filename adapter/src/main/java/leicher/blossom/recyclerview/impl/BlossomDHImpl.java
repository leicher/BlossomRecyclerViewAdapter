package leicher.blossom.recyclerview.impl;


import leicher.blossom.recyclerview.BlossomDH;
import leicher.blossom.recyclerview.BlossomData;
import leicher.blossom.recyclerview.BlossomGenericDH;

public abstract class BlossomDHImpl<T extends BlossomData> implements BlossomGenericDH<T> {

    private T mSelfBlossomData;
    private BlossomDH mParent;

    public BlossomDHImpl() {}

    public BlossomDHImpl(T mSelfBlossomData) {
        this.mSelfBlossomData = mSelfBlossomData;
    }

    public BlossomDHImpl(BlossomDH mParent) {
        this.mParent = mParent;
    }

    public BlossomDHImpl(T mSelfBlossomData, BlossomDH mParent) {
        this.mSelfBlossomData = mSelfBlossomData;
        this.mParent = mParent;
    }

    public T getSelfBlossomData() {
        return mSelfBlossomData;
    }

    public void setSelfBlossomData(T mSelfBlossomData) {
        this.mSelfBlossomData = mSelfBlossomData;
    }

    @Override
    public int getItemCount() {
        return mSelfBlossomData == null ? 0 : 1;
    }

    @Override
    public BlossomDH getDataHolder(int position, int localPosition) {
        return this;
    }

    @Override
    public BlossomDH getParent() {
        return mParent;
    }

    @Override
    public BlossomData getData(int position, int localPosition) {
        return mSelfBlossomData;
    }
}
