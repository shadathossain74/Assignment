public class Main {
    public static void main(String[] args) {
        hello();

        int number = 10;
        System.out.println(addtion(number));

        System.out.println(multiplication(number));

        double money = 1000;
        double NewMoney1 = intrestPerYear(money);
        System.out.println(NewMoney1);
        double NewMoney2 = intrestPerYear(NewMoney1);
        System.out.println(NewMoney2);
        double NewMoney3 = intrestPerYear(NewMoney2);
        System.out.println(NewMoney3);

        fevarite();

    }

    static void hello(){
        System.out.println("কেমন আছো সবাই ?");
    }

    static int addtion(int number){
        int ans = 0;
        for( int index = 1; index <= number ; index++){
            ans = ans + index ;
        }
        return ans;
    }

    static int multiplication(int number){
        int ans = 1;
        for(int index = 1; index <=10; index++){
            ans = ans * index;
        } return ans;
    }

    static double intrestPerYear(double money){
        double interest = money * (5/(double)100);
        return interest + money ;
    }
    static void fevarite(){
        System.out.println("Rakib");
        System.out.println("Jasim");
        System.out.println("Sourav");

    }
}
