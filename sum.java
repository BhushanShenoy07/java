import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,sum=0;
        System.out.println("enter array length");
        n=sc.nextInt();
        int[] a=new int[100];
        for(i=0;i<n;i++){
         a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(i!=j && a[i]>a[j]){
                    sum+=1;
                }
            }
        }
        System.out.println(sum);
    }
}
