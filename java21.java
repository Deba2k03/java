package com.company;
import java.lang.*;
public class java21 extends Thread {
public void run(){
System.out.println("Inside run method");
}
public static void main(String[] args) {
Thread.currentThread().setPriority(6);
System.out.println("main thread priority : " + Thread.currentThread().getPriority());
java21 th1=new java21();
System.out.println("th1 thread priority : "+th1.getPriority());
}}
