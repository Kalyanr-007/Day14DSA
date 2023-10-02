package datastructures;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Data Structure Problems using Java Generics Project.");

        LinkedListGenerics<Integer> lgList = new LinkedListGenerics<Integer>();
        lgList.pushValue(70);
        lgList.pushValue(30);
        lgList.pushValue(56);

        lgList.displayList();
    }
}