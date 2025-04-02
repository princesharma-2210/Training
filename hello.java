public class acess{
        public String addBinary(String s1, String s2) {
            // code here
            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);
            int num1=0;
            int num2=0;
            int i=0;
            int total=0;
            while(n1==0){
                int rem=n1%10;
                num1+=rem*Math.pow(2,i);
                i++;
                n1/=10;
            }
            int j=0;
            while(n2==0){
                int remen=n2%10;
                num2+=remen*Math.pow(2,j);
                j++;
                n2/=10;
            }
            int sum= num1+num2;
            int k=0;
            while(sum==0){
                int re= sum%2;
                total+=re*Math.pow(10,k);
                k++;
                sum/=2;
            }
            String str1 = Integer.toString(total);
            return str1;
        }
    
    public static void main(String[] args){
           String s1= "111";
           String s2="01";
           System.out.print(addBinary(s1,s2));
    }
}

public class hello{
       
}