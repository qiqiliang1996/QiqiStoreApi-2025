package com.codewithmosh.store.payments;

import com.codewithmosh.store.orders.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;

public interface PaymentGateway {
    CheckoutSession createCheckoutSession(Order order);
    Optional<PaymentResult> parseWebhookRequest(WebhookRequest request);
}
