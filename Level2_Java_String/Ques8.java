import java.util.*;

class Voting {
    public static int[] ages(int n) {
        Random r=new Random();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=10+r.nextInt(90);
        return arr;
    }
    public static String[][] check(int[] arr) {
        String[][] res=new String[arr.length][2];
        for(int i=0;i<arr.length;i++) {
            res[i][0]=String.valueOf(arr[i]);
            if(arr[i]>=18) res[i][1]="Can Vote"; else res[i][1]="Cannot Vote";
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a=ages(10);
        String[][] data=check(a);
        for(String[] row:data) System.out.println("Age: "+row[0]+" "+row[1]);
    }
}
