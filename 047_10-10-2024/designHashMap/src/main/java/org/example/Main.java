package org.example;

import org.example.model.MyHashMap;

public class Main {
    public static void main(String[] args) {
        //Your MyHashMap object will be instantiated and called as such:
        MyHashMap obj = new MyHashMap();
        obj.put(1, 1);
        int param_2 = obj.get(1);
        System.out.println("param_2 = " + param_2);
        obj.remove(1);
        System.out.println(obj.size());

        //Test01();
        //Test02();
    }

    private static void Test02() {
        MyHashMap map = new MyHashMap(); // -
        map.printMap();

        map.remove(27); // -

        map.put(65, 65); // -
        System.out.println("size = " + map.size()); // 1
        System.out.println("capacity = " + map.getCapacity());
        map.printMap();
        System.out.println();

        System.out.println("get 19 = " + map.get(19)); // -1
        map.remove(19); // -
        System.out.println("get 19 = " + map.get(19)); // -1
        System.out.println("size = " + map.size());// 1
        System.out.println();

        System.out.println("get 0 = " + map.get(0)); // -1
        map.remove(0); // -
        System.out.println("get 0 = " + map.get(0)); // -1
        System.out.println("size = " + map.size());// 1
        System.out.println();

        System.out.println("get 18 = " + map.get(18)); // -1
        System.out.println("size = " + map.size());// 1
        System.out.println();

        System.out.println("get 3 = " + map.get(3)); // -1
        map.remove(3); // -
        System.out.println("size = " + map.size());// 1
        System.out.println();

        map.put(42, 0); // -
        System.out.println("size = " + map.size()); // 2
        System.out.println("capacity = " + map.getCapacity()); // 16
        map.printMap();
        System.out.println();

        System.out.println("get 19 = " + map.get(19)); // -1
        System.out.println("size = " + map.size());// 2
        System.out.println();

        System.out.println("get 42 = " + map.get(42)); // 0
        System.out.println("size = " + map.size());// 2
        map.remove(42); // -
        System.out.println("get 42 = " + map.get(42)); // -1
        System.out.println("size = " + map.size());// 1
        System.out.println("capacity = " + map.getCapacity()); // 16
        map.printMap();
        System.out.println();

        map.put(17, 90); // -
        System.out.println("size = " + map.size()); // 2
        System.out.println("capacity = " + map.getCapacity()); // 16
        map.printMap();
        System.out.println();

        map.put(31, 36); // -
        System.out.println("size = " + map.size()); // 3
        System.out.println("capacity = " + map.getCapacity()); // 16
        map.printMap();
        System.out.println();

        map.put(48, 71); // -
        System.out.println("size = " + map.size()); // 4
        System.out.println("capacity = " + map.getCapacity()); // 16
        map.printMap();
        System.out.println();

        map.put(5, 50); // -
        System.out.println("size = " + map.size()); // 5
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(7, 68); // -
        System.out.println("size = " + map.size()); // 6
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(73, 74); // -
        System.out.println("size = " + map.size()); // 7
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(85, 18); // -
        System.out.println("size = " + map.size()); // 8
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(74, 95); // -
        System.out.println("size = " + map.size()); // 9
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(84, 82); // -
        System.out.println("size = " + map.size()); // 10
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(59, 29); // -
        System.out.println("size = " + map.size()); // 11
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(71, 71); // -
        System.out.println("size = " + map.size()); // 12
        System.out.println("capacity = " + map.getCapacity()); // 16
        map.printMap();
        System.out.println();

        System.out.println("get 42 = " + map.get(42)); // -1
        System.out.println("size = " + map.size());// 12
        map.remove(42); // -
        System.out.println("get 42 = " + map.get(42)); // -1
        System.out.println("size = " + map.size());// 12
        System.out.println("capacity = " + map.getCapacity()); // 16
        System.out.println();

        map.put(51, 40); // -
        System.out.println("size = " + map.size()); // 13
        System.out.println("capacity = " + map.getCapacity()); // 32
        //map.printMap();
        System.out.println();

        map.put(33, 76); // -
        System.out.println("size = " + map.size()); // 14
        System.out.println("capacity = " + map.getCapacity()); // 32
        map.printMap();
        System.out.println();

        System.out.println("get 17 = " + map.get(17)); // 90
        System.out.println("get 84 = " + map.get(84)); // 82

    }

    private static void Test01() {
        MyHashMap map = new MyHashMap();

        map.remove(27); // -

        map.put(65, 65);
        System.out.println("size = " + map.size()); // 1

        map.remove(19);// -

        map.remove(0); // -

        System.out.println(map.get(18)); // -1

        map.remove(3);

        map.put(42, 0);
        System.out.println("size = " + map.size()); // 2

        System.out.println(map.get(19));// -1

        System.out.println("get 42 = " + map.get(42));
        map.remove(42);
        System.out.println("get 42 = " + map.get(42));
        System.out.println("size = " + map.size());// 1

        map.put(17, 90);
        System.out.println("size = " + map.size()); // 2

        map.put(31, 76);
        System.out.println("size = " + map.size()); // 3

        map.put(48, 71);
        System.out.println("size = " + map.size()); // 4

        map.put(5, 50);
        System.out.println("size = " + map.size()); // 5

        map.put(7, 68);
        System.out.println("size = " + map.size()); // 6

        map.put(73, 74);
        System.out.println("size = " + map.size()); // 7

        map.put(85, 18);
        System.out.println("size = " + map.size()); // 8

        map.put(74, 95);
        System.out.println("size = " + map.size()); // 9

        map.put(84, 82);
        System.out.println("size = " + map.size()); // 10

        map.put(59, 29);
        System.out.println("size = " + map.size()); // 11

        map.put(71, 71);
        System.out.println("size = " + map.size()); // 12

        System.out.println("get 42 = " + map.get(42));
        map.remove(42);
        System.out.println("size = " + map.size()); // 12
        System.out.println("capacity = " + map.getCapacity());

        System.out.println("get 51 = " + map.get(51));
        map.put(51, 40);
        System.out.println("get 51 = " + map.get(51));
        System.out.println("size = " + map.size()); // 13

        map.put(33, 76);
        System.out.println("size = " + map.size()); // 14

        System.out.println("get 17 = " + map.get(17)); // 90

        map.put(89, 95);
        System.out.println("size = " + map.size()); // 15

        System.out.println("get 95 = " + map.get(95)); // -1

        map.put(30, 31);
        System.out.println("size = " + map.size()); // 16

        map.put(37, 99);
        System.out.println("size = " + map.size()); // 17

        System.out.println("get 51 = " + map.get(51)); // 40

        map.put(95, 35);
        System.out.println("size = " + map.size()); // 18

        System.out.println("get 65 = " + map.get(65)); // 65
        map.remove(65);
        System.out.println("size = " + map.size()); // 17
        System.out.println("get 65 = " + map.get(65)); // -1

        System.out.println("get 81 = " + map.get(81)); // -1
        map.remove(81);
        System.out.println("get 81 = " + map.get(81)); // -1

        System.out.println("get 61 = " + map.get(61)); // -1
        map.put(61, 46);
        System.out.println("size = " + map.size()); // 18

        System.out.println("get 50 = " + map.get(50)); // -1
        map.put(50, 33);
        System.out.println("size = " + map.size()); // 19

        System.out.println("get 59 = " + map.get(59)); // 29

        System.out.println("get 5 = " + map.get(5)); // 50
        map.remove(5);
        System.out.println("get 5 = " + map.get(5)); // -1
        System.out.println("size = " + map.size()); // 18

        System.out.println("get 75 = " + map.get(75)); // -1
        map.put(75, 89);
        System.out.println("get 75 = " + map.get(75)); // 89
        System.out.println("size = " + map.size()); // 19

        System.out.println("get 80 = " + map.get(80)); // -1
        map.put(80, 17);
        System.out.println("get 80 = " + map.get(80)); // 17
        System.out.println("size = " + map.size()); // 20

        System.out.println("capacity = " + map.getCapacity()); // 32
        System.out.println("get 35 = " + map.get(35)); // -1
        map.put(35, 94);
        System.out.println("get 35 = " + map.get(35)); // 94
        System.out.println("size = " + map.size()); // 21
        System.out.println("capacity = " + map.getCapacity()); // 32
    }

}
