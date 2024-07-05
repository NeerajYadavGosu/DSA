public class queueimpl {
    public static void main(String[] args) {
        queuemodel qm = new queuemodel(10);
        qm.enqueue(10);
        qm.enqueue(20);
        qm.show();
    }
}
