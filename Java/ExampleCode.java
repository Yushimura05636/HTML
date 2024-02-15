package Java;

public class ExampleCode {
    public static void main(String[] args) throws Exception { 
        //Code example
        String palworld = "palappt";
        String[] split = palworld.split("");

        int length = split.length;


        int flag=3;

        for(int i = 0; i <= palworld.length()-1; i++) {
            length--;
            if(split[i].equals(split[length]))
            {
                flag=1;
            }
            else
            {
                flag=0;
                break;
            }
        }

        //flag
        if(flag == 1)
        {
            System.out.println("is a palindrome");
        }
        else if(flag == 0){
            System.out.println("is not a palindrome");
        }
    }   
}
