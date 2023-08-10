public class PToPTransaction extends Transaction{
    int recieverUserId;


    PToPTransaction(User user,int amount,int recieverUserId){
        this.user=user;
        this.transactionId=user.system.generateTransactionID();
        this.amount=amount;
        this.recieverUserId=recieverUserId;
    }


}
