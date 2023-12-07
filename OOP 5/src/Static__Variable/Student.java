/*
     * Non-static is Create Count Separate object
     * But Static is Common Count of Object.
 */


package Static__Variable;
//Class
public class Student {

    /*
    //This is Non-static VAriable
    int count=0;
     */
    //This is Static Variable
    static int count=0;

    //Constructor
     Student(){
        count++;
    }
    //print
    void Totaldisplay(){
        System.out.println("Student: "+count);
    }
}