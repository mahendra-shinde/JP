package com.mahendra.logic;

public class Student {
        //Variable declared outside method but inside Class
        //That means its either class var or instance var
        //STATIC keyword means its class var
        private static int passingScore;

        static {
            //Some code to get value from FILE!!!
            passingScore = 35;
        }

        public static void setPassing(int newPassing){
            if(newPassing<50){
                Student.passingScore = newPassing;
            }
            else
                System.out.println("Passing score CANNOT be 50 or more!!");
        }

        // Instance Vars
        private int sub1, sub2, sub3;

    public Student(int sub1, int sub2, int sub3){
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
        }

        public String checkResult(){
            String result = "fail";
            //"this" not required becouse, no local var uses same name as instance vars
            if(sub1 >= passingScore && sub2 >= passingScore && sub3 >= passingScore ){
                result = "pass";
            }

            return result;
        }

    }
