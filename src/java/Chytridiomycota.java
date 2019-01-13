package java;

public abstract class Chytridiomycota implements God{
    @Override
    public Phylum phylum(){
        return new Fungi();
    }
}
