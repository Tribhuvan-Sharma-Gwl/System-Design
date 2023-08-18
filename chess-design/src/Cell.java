public class Cell {
    Peice peice=null;


    Cell(Peice peice){
        if(peice!=null){
            this.peice=peice;
        }
    }

    public Peice getPeice() {
        return peice;
    }

    public void setPeice(Peice peice) {
        this.peice = peice;
    }

}
