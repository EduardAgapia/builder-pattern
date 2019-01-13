package java;

public class BeingBuilder {

    public LivingBeings construct(){
        LivingBeings livingBeings = new LivingBeings();
        livingBeings.addBeing(new Liliaceae());
        return livingBeings;

    }
}
