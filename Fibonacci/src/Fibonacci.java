/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Duc Dat
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("The 45 sequence Fibonacci: ");
        Fibonacci fb = new Fibonacci();
        fb.Fibo(45);
    }

    public void Fibo(int n) {
        int f0 = 0;
        int f1 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(f0 + " ");

            // compute the next term
            int f3 = f0 + f1;
            f0 = f1;
            f1 = f3;

        }
    }

//public static void main(String[] args) {
//
//    int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
//    System.out.println("Fibonacci Series till " + n + " terms:");
//
//    while (i <= n) {
//      System.out.print(firstTerm + ", ");
//
//      int nextTerm = firstTerm + secondTerm;
//      firstTerm = secondTerm;
//      secondTerm = nextTerm;
//
//      i++;
//    }
//  }
}
