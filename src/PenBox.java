public class PenBox {
    private static final int MAX_PENS_IN_BOX = 3;
    private int numberOfPens = 0;

    private PensFactory pensFactory = new PensFactory();
    private Pen[] pens = new Pen[MAX_PENS_IN_BOX];

    public void fillTheBox() {
        pens[0] = pensFactory.createPen();
        numberOfPens++;
        for (int i = numberOfPens; i < MAX_PENS_IN_BOX; i++) {
            Pen pen = pensFactory.createPen();
            if (!compare(pen)) {
                pens[i] = pen;
                numberOfPens++;
            } else {
                System.out.println("Duplikat! ");
                i--;
            }
        }
    }

    public boolean compare(Pen pen) {
        for (int i = 0; i < numberOfPens; i++) {
            boolean duplicate = pens[i].equals(pen);
            if (duplicate)
                return true;
        }
        return false;
    }
}
