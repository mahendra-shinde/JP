package com.amit;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import static com.amit.IllegalCredentialsException.MAX_UserName;
import static com.amit.IllegalCredentialsException.MIN_UserName;

public class UserManager {

    String usernameM;
    String passwordM;
    String roleM;
    boolean activeM;

    //UserManager(String usernameM, String passwordM, String roleM, boolean activeM){
      //  super(usernameM,passwordM,roleM, activeM  );
    //}
    static ArrayList<userDetails> userList = new ArrayList<>();

    public void add(userDetails usr){

        userList.add(usr);

    }

    public List<userDetails> findByName(String uName) {
        List<userDetails> temp = null;

        if (!userList.isEmpty()){
            temp = new ArrayList<>();
            for(userDetails b : userList){

                if(b.getUserId().toLowerCase().contains(uName.toLowerCase())){
                    temp.add(b);
                }
            }

        }
        else{
            System.out.println("No Record found");

        }
        return temp;

    }

    public void ListAll() {

        try {

            for (userDetails e : userList) {

                System.out.println(e);
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    public String validateUserId(String vuserid) {
        String uFlag ="True";
        //String rruser = vuserid.getUserId();
        String rruser = vuserid;
        //System.out.println(rruser);
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
                //System.out.println("user id val");
                uFlag="False";
                for (userDetails e : userList) {
                    //System.out.println(e);
                        if (e.getUserId().equalsIgnoreCase(rruser)){

                            uFlag="True";
                         //System.out.println("user exist");
                        }

                }
               /* if (uFlag.equalsIgnoreCase("True")){
                    uFlag="False";
                }*/
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
                pFlag="False";

                for (userDetails e : userList) {
                    if (e.getPassword().equalsIgnoreCase(rpass)){
                        pFlag="True";
                        //System.out.println("pwd exist");
                    }


                }
                /*if (!pFlag.equalsIgnoreCase("true")){
                    pFlag="False";
                }*/
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return pFlag;
    }


}
