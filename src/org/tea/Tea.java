package org.tea;

public class Tea {
    protected boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    // Constructor
    public Tea() {
        isPrepared = false;
        hasMilk = false;
        hasSugar = false;
    }


    public void prepareTea() {
        if (!isPrepared) {
            System.out.println("Preparing basic tea with hot water and tea leaves...");
            isPrepared = true;
        } else {
            System.out.println("Tea is already prepared.");
        }
    }


    public void addMilk() {
        if (isPrepared && !hasMilk) {
            System.out.println("Adding milk to the tea...");
            hasMilk = true;
        } else if (!isPrepared) {
            System.out.println("Tea has not been prepared yet.");
        } else {
            System.out.println("Milk has already been added to the tea.");
        }
    }


    public void addSugar() {
        if (isPrepared && !hasSugar) {
            System.out.println("Adding sugar to the tea...");
            hasSugar = true;
        } else if (!isPrepared) {
            System.out.println("Tea has not been prepared yet.");
        } else {
            System.out.println("Sugar has already been added to the tea.");
        }
    }


    public void serveTea() {
        if (isPrepared && (hasMilk || hasSugar)) {
            System.out.println("Tea is served.");
        } else if (!isPrepared) {
            System.out.println("Tea has not been prepared yet.");
        } else {
            System.out.println("Tea is prepared but it needs some additives like milk or sugar.");
        }
    }


 /*   public static void main(String[] args) {
        // Testing the basic tea
        System.out.println("\nTesting Basic Tea:");
        Tea tea = new Tea();
        tea.prepareTea();
        tea.addMilk();
        tea.addSugar();
        tea.serveTea();

        // Black Tea
        System.out.println("\nTesting Black Tea:");
        BlackTea blackTea = new BlackTea();
        blackTea.prepareTea();
        blackTea.addMilk();
        blackTea.addSugar();
        blackTea.serveTea();

        //  Green Tea
        System.out.println("\nTesting Green Tea:");
        GreenTea greenTea = new GreenTea();
        greenTea.prepareTea();
        greenTea.addMilk();
        greenTea.addSugar();
        greenTea.serveTea();

        //  Herbal Tea
        System.out.println("\nTesting Herbal Tea:");
        HerbalTea herbalTea = new HerbalTea();
        herbalTea.prepareTea();
        herbalTea.addMilk();
        herbalTea.addSugar();
        herbalTea.serveTea();*/


    public static void main(String[] args) {
        // Creating an array of Tea objects
        Tea[] teas = new Tea[3];
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();

        // Using polymorphism to call methods
        for (Tea tea : teas) {
            tea.prepareTea();
            tea.addMilk();
            tea.addSugar();
            tea.serveTea();
            System.out.println();
        }

    }
}
