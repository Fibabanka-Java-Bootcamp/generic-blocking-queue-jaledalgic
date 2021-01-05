package org.kodluyoruz;

public class Main {

    public static void main(String[] args)  {
        Queue<Integer> queue1=new Queue<>();
        queue1.add(1);
        queue1.add(2);
        System.out.println(queue1.peek());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());

        Queue<String> queue2=new Queue<>();
        queue2.add("merhaba");
        queue2.add("dünya");
        System.out.println(queue2.peek());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());

    }
}
