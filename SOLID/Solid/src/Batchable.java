public interface Batchable {

    public void processBatch();

    public int getBatchSize();

    private void logBatchProcessing() {
        System.out.println("Batch processing started.");
    }
}
