package vendingmachine.view;

public class OutputView {
    static String[] coinName = {"500","100","50","10"};
    public static void printVendingMachineCoins(int[] coins){
        System.out.println("자판기가 보유한 동전");
        for(int i = 0; i < 4; i++){
            System.out.printf("%s원 - %s개 \n",coinName[i],coins[i]);
        }
    }

    public static void printChangeCoins(int[] coins){
        System.out.println("잔돈");
        for(int i = 0; i < 4; i++){
            if(coins[i] == 0){
                continue;
            }
            System.out.printf("%s원 - %s개 \n",coinName[i],coins[i]);
        }
    }

}
