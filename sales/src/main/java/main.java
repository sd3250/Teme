public class main {

    public static void main(String[] args) {

        //SalesRepresentative[] salesRep = {new SalesRepresentative("dan", 100, 100),new SalesRepresentative("john", 20, 300), new SalesRepresentative("bob", 1, 1) };
        //SalesRepresentative[] SortedReps = SortReps.sort(salesRep);
        // aici mi-am dat seama defapt de ce ai zis ca sort sa nu fie static :) initial am pus metoda sort in main :) that didn't worked out well

        SortReps sir = new SortReps();

        //System.out.println(sir.low().toString());
        //System.out.println(sir.high().toString());
        System.out.println("Sales guy " + sir.low().getName() + " has sales with a quota of " + sir.low().getQuota() + "$, he has achived woth of " + sir.low().getRevenue() + "$ worth of sale");
        System.out.println("Sales guy " + sir.high().getName() + " has sales with a quota of " + sir.high().getQuota() + "$, he has achived woth of " + sir.high().getRevenue() + "$ worth of sale");


    }
}
