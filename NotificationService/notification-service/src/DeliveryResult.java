public class DeliveryResult {

    private Boolean success;
    private String errorMessage;

    public DeliveryResult(Boolean success, String errorMessage) {
        this.success = success;
        this.errorMessage = errorMessage;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
