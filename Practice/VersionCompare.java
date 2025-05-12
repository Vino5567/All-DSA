package Practice;

public class VersionCompare {
    public static void main(String[] args) {
        String version1 = "1.2", version2 = "1.10"; //version1 = "1.01", version2 = "1.001" || version1 = "1.0", version2 = "1.0.0.0"
        System.out.println(compareVersion(version1, version2));
    }

    public static int compareVersion(String version1, String version2) {
        int i = 0, j = 0;

        while (i < version1.length() || j < version2.length()) {
            int v1 = 0, v2 = 0;

            while (i < version1.length() && version1.charAt(i) != '.') {
                v1 = v1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            while (j < version2.length() && version2.charAt(j) != '.') {
                v2 = v2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if (v1 > v2) return 1;
            else if (v1 < v2) return -1;

            i++;
            j++;
        }

        return 0;
    }
}

