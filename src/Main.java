public class Main {
    public static void main(String[] args){
        System.out.println("Aceasta este tema 2 (deadline: 22/iulie/2022)");

        int[] cars = new int[]{1,2,3,4,5};
        int[] directions = new int[]{2,4,3,3,1};

        Intersection obj = new Intersection();
        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {

            }
        };
        //define the roads given the direction
        int[] roads = new int[5];
        for(int r=0; r<5; r++){
            if(directions[r]==1 || directions[r]==2)
                roads[r]=1;
            if(directions[r]==3 || directions[r]==4)
                roads[r]=2;
        }

        for(int i=0; i<5; i++){
            obj.carStatus(cars[i], directions[i], roads[i], r1, r2);
        }
        System.out.println();
    }
}
