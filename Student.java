/*Create a student class
	-create 5 student objects and store it in 
	a proper datastructure
- find the average marks of the students */
import java.util.*;

public class Student {
    private String name;
    private int mark;
    
    public Student(String name,int mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getmarks(){
        return this.mark;
    }

    public void setMarks(int mark){
        this.mark = mark;
    }

    
}
