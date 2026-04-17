package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    PaymentService service = new PaymentService();

    @Test
    public void testSuccess() {
        assertTrue(service.processPayment(100, "1234"));
    }

    @Test
    public void testFailure() {
        assertFalse(service.processPayment(-10, ""));
    }
}