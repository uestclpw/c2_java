package com.nowcoder;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    /**
     * 打印对象
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d}, %s", index, obj.toString()));
    }

    public static void demoOperation() {
        print(1, 5 / 2.0);
    }

    public static void demoControlFlow() {
        int score = 60;
        if (score > 80) {
            print(1, "A");
        } else if (score > 60) {
            print(2, "B");
        } else {
            print(3, "C");
        }

        String grade = "B";
        switch (grade) {
            case "A":
                print(4, "score>80");
                break;
            case "B":
                print(5, "score>60");
                break;
            default:
                print(6, "0-60");

        }

    }

    public static void demoString() {
        String str = "hello nowcoder";
        print(1, str.indexOf('e'));
        print(2, str.charAt(6));
        print(3, str.codePointAt(1));
        print(4, str.compareTo("hello mowcoder"));
        print(5, str.compareTo("hello powercoder"));
        print(6, str.compareToIgnoreCase("Hello nowcoder"));
        print(7, str.concat("!!"));
        print(8, str.contains("hello"));
        print(9, str.endsWith("xcoder"));
        print(10, str.lastIndexOf("e"));


    }

    public static void demoList() {
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 4; ++i) {
            strList.add(String.valueOf(i));
        }
        print(1, strList);
        Collections.sort(strList);
        print(6, strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(7, strList);
    }

    public static void demoSet() {
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < 3; ++i) {
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
    }

    public static void demoKV() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));

        }
        print(1, map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void demoException() {
        try {
            print(1, 1 / 0);
            String a = null;
            a.indexOf('a');

        } catch (NullPointerException npe) {
            print(3, "NEP");

        } catch (Exception e) {
            print(3, "E");

        } finally {
            print(2, "finally");
        }
    }

    public static void demoCommon() {
        //salt uuid
        Random random = new Random();
        random.setSeed(1);
        for (int i = 0; i < 4; i++) {
            print(1, random.nextInt(100));
        }
        List<Integer> array = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        print(3, array);
        Collections.shuffle(array);
        print(4, array);


        Date date = new Date();
        print(5, date);
        print(6, date.getTime());
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        print(7, df.format(date));
        print(8,DateFormat.getDateInstance(DateFormat.FULL).format(date));

        print(9,UUID.randomUUID());
        print(10,Math.max(1,3));
        print(11,Math.ceil(2.2));//向上取整
        print(12,Math.floor(2.5));//向下取整
        print(13,Math.log(2.71));
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("hello world!");
        demoOperation();
        demoControlFlow();
        demoString();
        demoList();
        demoSet();
        demoKV();
        demoException();
        demoCommon();
    }
}
