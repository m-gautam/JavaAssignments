package gautam.assignment.data;

public class Initialization {
    int n;
    char c;

    public void printFields(){
        System.out.println(this.n);
        System.out.println(this.c);
    }


    /**
     * Error on printing the uninitialized local variables.
     * local variables must be initialized before accessing them.
     * member variables are initialized with 0/null value by default.
     **/
    public void printLocal(){
        int n=0;
        char c='o';

        System.out.println(n);
        System.out.println(c);
    }
}
