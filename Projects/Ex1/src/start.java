public class start {

    public static void main (String [] args){
        int n = 100;
        double [] array = new double[n];
        double xmin =10,xmax=0,xcenter=0;
            for (int i = 0;i < n; i++) {
                array[i] = Math.random();
                System.out.println("Array: "+ array[i]);
                    if (i == 0) {
                        xmin = array[0];
                        xmax = array[0];
                    }
                if (array [i] < xmin) {
                    xmin = array[i];
                } else if (array[i]> xmax){
                    xmax = array[i];
                }
                xcenter+=array[i];
            }
            xcenter /= n;
            System.out.println("Min: " + xmin);
            System.out.println("Max: " + xmax);
            System.out.println("Center: " + xcenter);



    }

}
