public class Board {
    Cell[][] board;


    Board(){
        board=new Cell[8][8];
        Peice rook1=new Peice(PeiceType.ROOK,PeiceType.BLACK);
        Peice rook2=new Peice(PeiceType.ROOK,PeiceType.BLACK);
        Peice rook3=new Peice(PeiceType.ROOK,PeiceType.WHITE);
        Peice rook4=new Peice(PeiceType.ROOK,PeiceType.WHITE);

        board[0][0]=new Cell(rook1);
        board[0][7]=new Cell(rook2);
        board[7][0]=new Cell(rook3);
        board[7][7]=new Cell(rook4);

        Peice bishop1=new Peice(PeiceType.BISHOP,PeiceType.BLACK);
        Peice bishop2=new Peice(PeiceType.BISHOP,PeiceType.BLACK);
        Peice bishop3=new Peice(PeiceType.BISHOP,PeiceType.WHITE);
        Peice bishop4=new Peice(PeiceType.BISHOP,PeiceType.WHITE);

        board[0][2]=new Cell(bishop1);
        board[0][5]=new Cell(bishop2);
        board[7][2]=new Cell(bishop3);
        board[7][5]=new Cell(bishop4);

        Peice p1=new Peice(PeiceType.KNIGHT,PeiceType.BLACK);
        Peice p2=new Peice(PeiceType.KNIGHT,PeiceType.BLACK);
        Peice p3=new Peice(PeiceType.KNIGHT,PeiceType.WHITE);
        Peice p4=new Peice(PeiceType.KNIGHT,PeiceType.WHITE);

        board[0][1]=new Cell(p1);
        board[0][6]=new Cell(p2);
        board[7][1]=new Cell(p3);
        board[7][6]=new Cell(p4);

        Peice king1=new Peice(PeiceType.KING,PeiceType.BLACK);
        Peice king2=new Peice(PeiceType.KING,PeiceType.WHITE);

        board[0][3]=new Cell(king1);
        board[7][4]=new Cell(king2);

        Peice queen1=new Peice(PeiceType.QUEEN,PeiceType.BLACK);
        Peice queen2=new Peice(PeiceType.QUEEN,PeiceType.WHITE);

        board[0][4]=new Cell(queen1);
        board[7][3]=new Cell(queen2);

        for(int i=0;i<8;i++){
            Peice pawn=new Peice(PeiceType.PAWN,PeiceType.BLACK);
            board[1][i]=new Cell(pawn);
        }

        for(int i=0;i<8;i++){
            Peice pawn=new Peice(PeiceType.PAWN,PeiceType.WHITE);
            board[6][i]=new Cell(pawn);
        }

        for(int i=2;i<6;i++){
            for(int j=0;j<8;j++){
                board[i][j]=new Cell(null);
            }
        }

    }

    public void printBoard(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j].getPeice()==null){
                    System.out.printf("- ");
                }else{
                    System.out.printf(board[i][j].getPeice().peiceType+"_"+board[i][j].getPeice().color+" ");
                }
            }
            System.out.printf("\n");
        }
    }
}
//--rook,knight,bishop,king,quuen,bishop,knight,rook----//
//--