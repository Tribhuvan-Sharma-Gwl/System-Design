import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Group implements Subject {

    int GroupID;
    SplitWiseSystem system;
    List<Transaction> transactions=new ArrayList<Transaction>();
    List<Observer>users=new ArrayList<Observer>();

    public Group(SplitWiseSystem system){
        this.system=system;
        this.GroupID=system.generateNewGroupID();
    }



    public void registerUSer(Observer observer) {
        users.add(observer);
    }


    public void removeUSer(Observer observer) {
        users.remove(observer);
    }


    public void update(Transaction transaction) {
        boolean isAuthorized=false;
        for(int i=0;i<users.size();i++){
            if(users.get(i)==transaction.user){
                isAuthorized=true;
            }
        }

        if (!isAuthorized){
            System.out.println("you are not authorized");
            return;
        }

        for(int i=0;i<users.size();i++){
            if(users.get(i)==transaction.user){continue;}
            users.get(i).updateAmount(transaction);
        }
    }


}
