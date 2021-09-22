package ru.geekbrains.java_core_homework_14;

public class SecondTask { // Класс проверки массива на наличие только четвёрок и единиц
    public static boolean isHereOneAndFour(int[] myArrTaskTwo) {
        int oneCount = 0;
        int fourCount = 0;
        for (int i : myArrTaskTwo) {
            if (i == 1) {
                oneCount++; // Счётчик единиц
            }
            if (i == 4) {
                fourCount++; // Счётчик четвёрок
            }
        }
        if (oneCount == 0 || fourCount == 0) return false;
        else return (oneCount + fourCount) == myArrTaskTwo.length;
    }
}