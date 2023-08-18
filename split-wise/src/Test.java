public class Test {


    public static void  main(String[] args){
        System.out.println("-----starting splitwise------------");

        SplitWiseSystem system=new SplitWiseSystem();
        User tribhuvan=new User(system);
        User tushar=new User(system);
        User ashu=new User(system);

        tribhuvan.createPtoPTransaction(tushar,500);

        Group g1=new Group(system);

        g1.registerUSer(tribhuvan);
        g1.registerUSer(tushar);
        g1.registerUSer(ashu);


        tribhuvan.createPtoGroupTransaction(g1,300);

        g1.removeUSer(tushar);
        tribhuvan.createPtoGroupTransaction(g1,600);
    }
}
