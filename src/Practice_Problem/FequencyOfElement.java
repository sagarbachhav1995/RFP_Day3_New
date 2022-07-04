package Practice_Problem;

public class FequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//start array here  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
        //Array store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //for avoid counting same element /dont repeate  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
        
        //frequency of each element in array  
        System.out.println("---------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("---------------------");
	}

}
