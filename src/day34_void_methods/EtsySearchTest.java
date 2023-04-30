package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("--Starting ETSY Search Smoke Test--");
    openBrowser("chrome");
    navigateToEtsyUrl();
    searchForWoodenSpoon();
    verifyResultsAreDisplayed();
        System.out.println("--Etsy Search Smoke Test Completed - Pass -");
    }
    public static void openBrowser(String str){
        System.out.println("Launching " + str.toUpperCase() +" Browser...");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type 'wooden spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Search results are successfully displayed");
    }

}
