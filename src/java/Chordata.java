package java;

public abstract class Chordata implements God {

    @Override
    public Phylum phylum(){
        return new Animals();
    }
}
