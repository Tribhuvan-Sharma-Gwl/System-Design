import java.util.List;

public class SplitWiseSystem {
    List<User>users;
    List<Group>groups;
    int userIdGenerator;
    int groupIdGenerator;

    int transactionIdGenerator;

    public SplitWiseSystem(){
        this.userIdGenerator=0;
        this.groupIdGenerator=0;
        this.transactionIdGenerator=0;
    }

    public int generateNewUserID(){
        return this.userIdGenerator++;
    }

    public int generateNewGroupID(){
        return this.groupIdGenerator++;
    }

    public int generateTransactionID(){
        return this.transactionIdGenerator++;
    }

}
