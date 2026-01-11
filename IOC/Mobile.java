package IOC;

public class Mobile {
    public static void main(String arg[]){
        Sim sim=new Vi();
        sim.calling();
        sim.data();
    }
}
/*
for this there is tightly couping because every thime we need to create object for
sim what we need...but it is done at compiletime insted of runtime for this we use DI
to overcom this problem...


* */
