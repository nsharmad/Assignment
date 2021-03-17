package day11;

public class question36 {
    public static void main(String[] args) {
        Integer [] intArray = {10,20,20,30,40,50,60,60,70,80,90};
        for (int i=0;i<intArray.length;i++){
            for (int j=i+1;j<intArray.length;j++){
                if (intArray[i]==intArray[j]){

                    System.out.println("The Duplicate Element is: " +intArray[j]);

                }

            }
        }

    }


}
