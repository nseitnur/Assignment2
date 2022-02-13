package com.company;

import java.util.Arrays;

public class Validator {
    static User user1 = new User("Nursultan", "Seitnur", 23, "Mail", "22/10/2003","##343dsaFsad");

    private int count = 0;
    private int num = 0;
    private int lowerCase = 0;
    private int upperCase = 0;
    private int specialChar = 0;

    String a = user1.getPassword();
    String b = user1.getDateOfBirth();


    String checkAge() {
        if (user1.getAge() > 18) {

        } else {
            return "There is no 18 years";
        }
        return "there are 18 years ";
    }

     void  checkPass() {

        for (int i = 0; i < user1.getPassword().length(); i++) {
            char ascii = a.charAt(i);
            if (ascii >= 48 && ascii <= 57) {
                num++;
            } else if (ascii >= 65 && ascii <= 90) {
                upperCase++;
            } else if (ascii >= 97 && ascii <= 122) {
                lowerCase++;
            } else {
                specialChar++;
            }
        }

        if (num == 0 || upperCase == 0 || lowerCase == 0 || specialChar == 0) {
            System.out.println("Format of Password is incorrect");
        } else if (a.length() >= 8 && num >0 && upperCase > 0 && lowerCase > 1 && specialChar > 1) {
            System.out.println("Format of Password is correct");
        }

    }

    void checkData() {
        String[] c = b.split("/");

        Integer[] num = new Integer[3];


        for(int j=0;j<3;j++) {
             num[j] = Integer.parseInt(c[j]);
        }

        if(num[2] % 400 ==0 || num[2]% 4==0 && num[2]%100!=0 ) {
            if(num[0]>=1 && num[0]<=29 && num[1]==2) {
                System.out.println("Correct BirthData");
            }
        else if(num[0]>29 && num[1] == 2 ) {
                System.out.println("Incorrect BirthData");
            }
        else if(num[1]==1 || num[1]==3 || num[1]==5 || num[1]==7 || num[1]==8 || num[1]==10 || num[1]==12) {
            if(num[0]>=1 && num[0]<=31) {
                System.out.println("Correct BirthData");
            }
            else if(num[0]>31) {
                System.out.println("Incorrect BirthData");
            }
            }
        else if(num[1]==4||num[1]==6||num[1]==9||num[1]==11) {
            if (num[0]>=1 && num[0]<=30) {
                System.out.println("Correct BirthData");
            }
            else {
                System.out.println("Incorrect BirthData");
            }
            }
         }

        else {
            if(num[1]==1 || num[1]==3 || num[1]==5 || num[1]==7 || num[1]==8 || num[1]==10 || num[1]==12) {
                if(num[0]>=1 && num[0]<=31) {
                    System.out.println("Correct BirthData");
                }
                else if(num[0]>31) {
                    System.out.println("Incorrect BirthData");
                }
            }
            else if(num[1]==4||num[1]==6||num[1]==9||num[1]==11) {
                if (num[0]>=1 && num[0]<=30) {
                    System.out.println("Correct BirthData");
                }
                else {
                    System.out.println("Incorrect BirthData");
                }
            }
            else if(num[1]==2) {
                if(num[0]>28) {
                    System.out.println("Incorrect BirthData");
                }
                else {
                    System.out.println("Correct BirthData");
                }
            }
        }




    }


}




