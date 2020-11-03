package com.java.Assignment8;

class MyException extends Exception
{
    private String errorMessage;
    MyException(String str, int[] arr)
    {
        if(str.equals("")){
            this.errorMessage = "empty string exception";
        }
        // if variable is null and is used to access it.
        else if(arr == null){
            this.errorMessage = "null pointer exception";
        }
        else{
            int s = arr.length;
            if(s >= 10){
                this.errorMessage = "IndexOutOfBoundException";
            }
        }
    }
    public String toString()
    {
        return "Exception: " + errorMessage + ".";
    }
}

class Demo
{
    public void getException(String str,int [] arr) throws MyException
    {
        throw new MyException(str, arr);
    }

}