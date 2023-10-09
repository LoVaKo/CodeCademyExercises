public class Droid {
    // This is a program that registers droids, their tasks and batterylevels
    // Practicing methods

    int batteryLevel = 100;
    String name;

    public String toString(){
        return "Hello, I'm the droid: " + name;
    }

    public Droid(String droidName){
        name = droidName;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport(){
        System.out.println(name + "'s batterylevel is "+ batteryLevel);
    }

    public void energyTransfer(Droid droidOne, Droid droidTwo){
        droidOne.batteryLevel = droidOne.batteryLevel - 10;
        droidTwo.batteryLevel = droidTwo.batteryLevel + 10;
        System.out.println(droidOne.name + " transferred 10% battery to " + droidTwo.name);
        System.out.println(droidOne.name + "'s batterylevel is now: " + droidOne.batteryLevel);
        System.out.println(droidTwo.name + "'s batterylevel is now: " + droidTwo.batteryLevel);
    }


    public static void main(String[] args) {

        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.performTask("dishwashing");

        Droid patrick = new Droid("Patrick");
        System.out.println(patrick);
        patrick.performTask("calculating calculations");
        patrick.performTask("making notes");
        patrick.performTask("watching darts");

        Droid isabella = new Droid("Isabella");
        System.out.println(isabella);
        isabella.performTask("househunting");
        System.out.println();

        isabella.energyReport();
        patrick.energyReport();

        isabella.energyTransfer(isabella, patrick);

        // Isabella is obviously Patrick's girlfriend, transferring energy like that.

    }
}