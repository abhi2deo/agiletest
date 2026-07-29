public class pattern{
    public static void main(String args[]){
        
        int n = 5;
        int x = (2*n)/2;
        for (int i = 0; i<n; i++){
            int gap1 = n-i-1;
            int gap2 = n+i-1;
            if(i==n-1){
                for(int j = 0;j<2*n-1; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j = 0; j<2*n-1; j++){
                    if(j==gap1 || j ==gap2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}