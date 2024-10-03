package ie.atu.week3openfeign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServiceController {
    @PostMapping("/confirmMessage")
    public String paymentConfirm(@RequestBody Product product) {
        String confirmMessage = String.format("Recieved payment for %i, Product %s at Price %f",
                product.getId(), product.getName(), product.getPrice());
        return confirmMessage;
    }
}
