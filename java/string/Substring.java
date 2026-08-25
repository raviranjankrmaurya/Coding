package java.string;

import java.util.Scanner;

public class SubString {
    
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String words = sc.nextLine();
        char[] word = words.toCharArray();
        for(int i = 0; i < word.length; i++){
            for(int j = 0; j < word.length; j++){
                for(int k = i; k < j + 1 ; k++){
                    System.out.print(word[j]);
                }
                System.err.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

    

