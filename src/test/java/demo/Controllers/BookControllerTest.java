//package demo.Controllers;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//interface A{
//    default void show(){
//        System.out.println("A");
//    }
//}
//
//interface B{
//    default void show2(){
//        System.out.println("A");
//    }
//}
//
//class V implements A, B {
//    public static void main(String[] args) {
//
//    }
//}
//
//
//class BookControllerTest {
//
//    @Test
//    void add() {
//        BookController bookController = new BookController();
//
//        assertEquals(12, bookController.add(2,10));
//    }
//}
//public class Store {
//    private Item item;
//    public Store(Item item) {
//        this.item = item;
//    }
//}package com.java2novice.loops;
//         
//public class SimpleForLoop {
// 
//            public static void main(String a[]){
//        //simple for loop to print from 1 to 10
//        /**
//                  * here int i=1; means at the beginning of the
//                  * loop, we are creating and initializing the variable
//                  * to value 1.
//                  *
//                  * 1<=10; means when i value reaches or above 10, the
//                  * control should come out of the loop.
//                  *
//                  * i++ means on each iteration, we are incrementing
//                  * i value by step 1.
//                  */
//        for(int i=1;i<=10;i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        /**
//                  * another example to increment by 2 steps
//                  */
//        for(int i=1;i<=10;i=i+2){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        /**
//                  * Below loop prints the numbers in reverse order
//                  */
//        for(int i=10;i>0;i--){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//    }
//}