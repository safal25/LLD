public class SlotBatch implements Batchable {

    private int batchSize;

    public SlotBatch(int batchSize) {
        this.batchSize = batchSize;
    }

    @Override
    public void processBatch() {
        System.out.println("Processing slot batch of size: " + batchSize);
    }

    @Override
    public int getBatchSize() {
        return batchSize;
    }

}
