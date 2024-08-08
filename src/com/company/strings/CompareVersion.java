package com.company.strings;

public class CompareVersion {
    public static String convert(String version) {
        String[] convertedVersion = version.split(".");
        StringBuilder result = new StringBuilder();

        for(String str : convertedVersion) {
            if (str.equals("0")) {
                continue;
            }

            result.append(str);
        }

        return result.toString();
    }
    public static int compareVersion(String version1, String version2) {
        String convertedVersion1 = convert(version1);
        String convertedVersion2 = convert(version2);

        if (Integer.valueOf(convertedVersion1) < Integer.valueOf(convertedVersion2)) {
            return -1;
        } else if (Integer.getInteger(convertedVersion1).equals(Integer.getInteger(convertedVersion2))) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        String version1 = "1.0.0";
        String version2 = "1.0.1";

        int result = compareVersion(version1, version2);
        System.out.println(result);
    }
}
