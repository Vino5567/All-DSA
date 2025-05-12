package ZohoLastYearQues;

public class Versioncompare {
    public static void main(String[] args) {
        String version1 = "1.0";
        String version2 = "1.0.0.0";
        System.out.println(compare(version1, version2));

    }

    public static int compare(String version1, String version2){
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int maxLen = Math.max(v1.length, v2.length);

        for (int i = 0; i < maxLen; i++) {
            int num1 = i < v1.length? Integer.parseInt(v1[i]) : 0; //note the length understand this strong
            int num2 = i < v2.length? Integer.parseInt(v2[i]) : 0;

            if(num1 < num2) return -1;
            else if(num1 > num2) return 1;
        }
        return 0;
    }
}
