package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {

    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        File directory = new File(root);
        File[] listFile = directory.listFiles();
        for (File f : listFile){
            if (f.isFile()){
                if (!list.contains(f)){
                    list.add(f.getAbsolutePath());
                }
            }
            else if (f.isDirectory()){
                list.addAll(getList(f));
            }
        }
        return list;

    }
    public static List<String> getList(File file){
        List<String> flist = new ArrayList<>();
        File[] listFile = file.listFiles();
        for (File f : listFile){
            if (f.isFile()){
                if (!flist.contains(f)){
                    flist.add(f.getAbsolutePath());
                }
            }
            else if (f.isDirectory()){
                flist.addAll(getList(f));
            }
        }
        return flist;
    }

    public static void main(String[] args) throws IOException {

    }
}
