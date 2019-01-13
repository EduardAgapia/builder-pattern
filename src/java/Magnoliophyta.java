package java;

public abstract class Magnoliophyta implements God {
    @Override
    public Phylum phylum(){
        return new Plants();
    }
}
