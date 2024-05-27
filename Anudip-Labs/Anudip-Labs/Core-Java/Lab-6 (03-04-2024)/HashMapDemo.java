package com.threadpackage;

import java.util.HashMap;

public class HashMapDemo //main Class
{
    public static void main(String arg[]) //main Method
    {
        // Creating an empty HashMap
        HashMap<String, String> hashMap = new HashMap<>();

        // Checking if the HashMap is empty
        if(hashMap.isEmpty()) 
        {
            System.out.println("HashMap is empty.");
        }
        else 
        {
            System.out.println("HashMap is not empty.");
        }
    }
}

/*Output:HashMap is empty.*/