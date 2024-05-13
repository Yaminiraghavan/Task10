package org.tea;

public class HerbalTea extends Tea{
    @Override
    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing Herbal Tea with hot water and herbal tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Herbal Tea is already prepared.");
        }
    }
}
