public interface Subject {

    public void registerUSer(Observer observer);
    public void removeUSer(Observer observer);
    public void update(Transaction transaction);
}
