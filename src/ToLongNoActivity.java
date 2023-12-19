public class ToLongNoActivity extends RuntimeException {
    @Override
    public String getMessage() {
        return "\nПриставка завершила работу из-за отсутствия активности";
    }
}
