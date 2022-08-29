package com.javarush.task.task20.task2004;

import java.io.*;

/* 
Читаем и пишем в файл статики
*/

public class Solution {
    public static void main(String[] args) {
        try {
            File yourFile = File.createTempFile("t12", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;
            loadedObject.load(inputStream);
            if (classWithStatic.equals(loadedObject)){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter ps = new PrintWriter(outputStream);
            StringBuilder str = new StringBuilder();
            str.append(staticString);
            str.append('/');
            str.append(i);
            str.append('/');
            str.append(j);
            ps.println(str.toString());
            ps.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                String str = br.readLine();
                String[] xstr = str.split("/");
                staticString = xstr[0];
                i = Integer.parseInt(xstr[1]);
                j = Integer.parseInt(xstr[2]);
            br.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClassWithStatic that = (ClassWithStatic) o;
            if (i != that.i) return false;
            return j == that.j;
        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
