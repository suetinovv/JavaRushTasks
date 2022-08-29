package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
*/

public class Solution {
    public static void main(String[] args) {
        try {
            File your_file_name = File.createTempFile("d:\\", "t12.txt");
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();

            if (ivanov.equals(somePerson)){
                System.out.println("yes");
            }
        } catch (IOException e) {
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            outputStream.write((name + " ").getBytes());
            if (assets != null){
                outputStream.write("yes ".getBytes());
                for (Asset a: assets){
                    outputStream.write((a.getName() + " ").getBytes());
                    outputStream.write((String.valueOf(a.getPrice()) + " ").getBytes());
                }
            } else{
                outputStream.write("no ".getBytes());
            }

        }

        public void load(InputStream inputStream) throws Exception {
            String str1 = "";
            while (inputStream.available() > 0){
                str1 += (char) inputStream.read();
            }
            String[] str = str1.split(" ");
            name = str[0];
            String flag = str[1];
            if (flag.equals("yes")){
                for (int i = 2; i < str.length; i += 2) {
                    assets.add(new Asset(str[i], Double.parseDouble(str[i + 1])));
                }
            }
        }
    }
}
