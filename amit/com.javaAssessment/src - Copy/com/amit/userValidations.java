package com.amit;

import java.security.PublicKey;
import java.util.ArrayList;

import static com.amit.IllegalCredentialsException.MAX_UserName;
import static com.amit.IllegalCredentialsException.MIN_UserName;

public class userValidations implements User_Interface{

    static ArrayList<userDetails> userList = new ArrayList<>();;


    public void add(userDetails usr){

        userList.add(usr);

    }





    public String validateUserId(String vuserid) {
        String uFlag ="True";
        //String rruser = vuserid.getUserId();
        String rruser = vuserid;
        System.out.println(rruser);
            try {
                if ((rruser.length() < MIN_UserName) || (rruser.length() > MAX_UserName)) {

                    uFlag = "False";
                    throw new IllegalCredentialsException();
                }

                if (rruser.isEmpty()) {

                    uFlag = "False";
                    throw new IllegalCredentialsException();
                }

                if (uFlag.equalsIgnoreCase("True")){
                    System.out.println("user id val");
                    for (userDetails e : userList) {
                        System.out.println(e);
                        /*if (e.getUserId().equalsIgnoreCase(rruser)){

                            uFlag="True";
                            System.out.println("user exist");
                        }*/

                    }
                }


            }catch (Exception e){
                System.out.println(e.getMessage());
            }

          /*  for (int i=0; i<vuserid.userId.length();i++){

                if (vuserid.getUserId()(i){

                }
            }*/


            return uFlag;
    }

    public String validatePass(String vpass){

        String pFlag =  "True";
        //String rruser = vuserid.getUserId();
        String rpass = vpass;
        try {
            if ((rpass.length() < 8)) {

                pFlag = "False";
                throw new IllegalCredentialsException();
            }

            if (pFlag.equalsIgnoreCase("true")){

                for (userDetails e : userList) {
                    if (e.password.equalsIgnoreCase(rpass)){
                        pFlag="True";
                        System.out.println("pwd exist");
                    }

                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return pFlag;
    }
}
