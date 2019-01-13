package java;

public abstract class Mollusca implements God {

    @Override
    public Phylum phylum(){
        return new Animals();
    }
}
