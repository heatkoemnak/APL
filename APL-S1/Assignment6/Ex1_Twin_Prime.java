public class Ex1_Twin_Prime {
    static void displayTwinPrime(){
        
        for(int i=0;i<1200;i++){
            if(is_prime(i)&&is_prime(i+2)){
                System.out.print("("+i+",");
                System.out.println(i+2+")");
            }
        }
    }
    public static boolean is_prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        displayTwinPrime();
        
    }
}
