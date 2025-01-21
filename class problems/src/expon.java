public class expon {
    
    public static void main(String[] args) {
        
            System.out.println(printBinary(13));

        public class printBinary(int num){
            if (num == 0) {
                return 0;
            }
            else if (num == 1) {
                return 1;
            }
            else {
                int remainder = num % 2
                int num = num / 2;
                
                System.out.print(remainder);
                
                printBinary(num);


        }
    }
}
