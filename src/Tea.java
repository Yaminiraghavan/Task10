public class Tea {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

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
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareTea();
        tea.addMilk();
        tea.addSugar();
        tea.serveTea();
    }
}
