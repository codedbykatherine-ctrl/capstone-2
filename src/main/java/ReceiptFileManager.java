import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReceiptFileManager {
           // somebody must GIVE me an Order object
    public void saveReceipt(Order order) throws IOException {
        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("receipts/receipt.txt"));
        writer.write(order.receiptSummary());
        writer.close();
    }
}
