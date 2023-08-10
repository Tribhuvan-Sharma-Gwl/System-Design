import java.util.ArrayList;
import java.util.List;

public class User implements  Observer{
    int UserID;
    SplitWiseSystem system;
    List<Transaction>transactions=new ArrayList<Transaction>();
    int totalAmount;

    public User(SplitWiseSystem system){
        this.system=system;
        this.UserID=system.generateNewUserID();
        this.totalAmount=0;
    }

    public void updateAmount(Transaction transaction){
        this.transactions.add(transaction);
        totalAmount+=transaction.amount;
        System.out.println(this.UserID+" updated amount is "+totalAmount+" requested by "+transaction.user.UserID);
    }

    public void createPtoPTransaction(User user,int amount){
        Transaction newTransaction=new PToPTransaction(this,amount,user.UserID);
        user.updateAmount(newTransaction);
    }

    public void createPtoGroupTransaction(Group group,int amount){
        Transaction newTransaction=new PToGroupTransaction(this,amount,group.GroupID);
        group.update(newTransaction);
    }

}
