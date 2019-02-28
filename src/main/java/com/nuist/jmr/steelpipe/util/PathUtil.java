package com.nuist.jmr.steelpipe.util;

public class PathUtil {
    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectdev/image";
        } else {
            basePath = "/Users/jinminrui/Desktop/Java/SteelImage";
        }
        basePath = basePath.replace("/", seperator);
        return basePath;
    }

    public static String getImagePath(int imgType) {
        String imagePath = "/upload/images/" + imgType + "/";
        return imagePath.replace("/", seperator);
    }
}
