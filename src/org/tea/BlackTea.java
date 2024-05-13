package org.tea;

public class BlackTea extends Tea{
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Black Tea with hot water and black tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Black Tea is already prepared.");
        }
    }
}
