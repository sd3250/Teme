public class SortReps {
    public SalesRepresentative[] array = {new SalesRepresentative("dan", 100, 1000),new SalesRepresentative("john", 20, 300), new SalesRepresentative("bob", 1, 1) };;

    public SalesRepresentative[] sort (SalesRepresentative [] array){

        SalesRepresentative temp = new SalesRepresentative("a",0,0);
        int lenght = array.length;

        for (int i = 0; i < lenght; i++ ){
            for (int j = 1; j < (lenght - i); j ++){
                if (array[j-1].getRevenue() > array[j].getRevenue()){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }

    public SalesRepresentative low (){
        SalesRepresentative[] temp = sort(this.array);
        return temp[0];

    }

    public SalesRepresentative high (){
        SalesRepresentative[] temp = sort(this.array);
        return temp[temp.length-1];
    }
}
