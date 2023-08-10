public class PToGroupTransaction extends Transaction{
    int recieverGroupId;

    PToGroupTransaction(User user,int amount,int recieverGroupId){
        this.user=user;
        this.transactionId=user.system.generateTransactionID();
        this.amount=amount;
        this.recieverGroupId=recieverGroupId;
    }
}
