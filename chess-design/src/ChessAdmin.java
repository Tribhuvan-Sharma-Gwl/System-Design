public class ChessAdmin {
    Board board;
    Player p1;
    Player p2;


    ChessAdmin(String p1,String p2){
        this.p1=new Player(p1,PeiceType.BLACK);
        System.out.println(p1+"is assigned black peices");
        this.p2=new Player(p2,PeiceType.WHITE);
        System.out.println(p2+"is assigned white peices");


        board=new Board();
    }


    Boolean validMove(Player p,Cell s,Cell d){
        if(s.getPeice()==null){
            System.out.println("Invalid move");
            return false;
        }
        if(d.getPeice()!=null&&s.getPeice().color==d.getPeice().color){
            System.out.println("Invalid move");
            return false;
        }

        if(p.color!=s.getPeice().color){
            System.out.println("Invalid move");
            return false;
        }

        return  true;
    }
}
