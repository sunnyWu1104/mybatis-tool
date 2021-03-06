package org.conan.tools.util.match;

import java.io.File;
import java.util.List;

/**
 *
 * @author Conan
 */
public class StringMatch {

    public static String point2Separator(String str) {
        return str.replace('.', File.separatorChar);
    }
    
    public static String point2left(String str) {
        return str.replace('.', '/');
    }

    public static String transfer2Separator(String str) {
        String tmp = str.replace('/', File.separatorChar);
        return tmp.replace('\\', File.separatorChar);
    }

    public static String first2Uppercase(String str) {
        String tmp = str.substring(0, 1).toUpperCase();
        return tmp + str.substring(1);
    }

    public static String first2Lowercase(String str) {
        String tmp = str.substring(0, 1).toLowerCase();
        return tmp + str.substring(1);
    }
    
    public static String stringLines(List<String> list){
        StringBuilder sb = new StringBuilder();
        for(String line:list){
            sb.append(","+line);
        }
        return sb.toString().substring(1);
    }
}
