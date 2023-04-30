package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));
        //last comma
        System.out.println(technologies.lastIndexOf(","));
        // for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("indexOfJava = " + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("indexOfCss = " + indexOfCss);

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("idxOfCucumber = " + idxOfCucumber);

        int indexOfSql = technologies.indexOf("sql"); //not present
        System.out.println("indexOfSql = " + indexOfSql);

        // technologies contains "maven" ? 2 ways
        if (technologies.contains("maven")){
            System.out.println("maven is present");
        }else {
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven") > -1){ // or >= 0 or != -1
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

    }
}
