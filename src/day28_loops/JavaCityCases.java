package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for (int day = 1; day <= 30; day++){
            //totalCases += day % 7 == 0 ? 500:200;
            if (day % 7 == 0){
                totalCases +=500;
                System.out.println("Day - " + day +" 500 cases");
            }else {
                totalCases +=200;
                System.out.println("Day - " + day +" 200 cases");
            }
        }
        System.out.println("Total cases - " + totalCases);

    }
}
