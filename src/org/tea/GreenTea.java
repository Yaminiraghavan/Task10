package org.tea;

public class GreenTea extends Tea{
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Green Tea with hot water and green tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Green Tea is already prepared.");
        }
    }
}
