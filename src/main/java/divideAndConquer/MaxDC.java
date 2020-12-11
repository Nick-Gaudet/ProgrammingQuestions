package divideAndConquer;

public class MaxDC {
    // YOUR CODE GOES HERE

    public static void sort(int [] list, int length){
        if (length < 2){return;}
        int mid = length / 2;

        int [] leftHalf = new int[mid];
        int [] rightHalf = new int[length - mid];

        for(int i = 0; i < mid; i++){
            leftHalf[i] = list[i];
        }
        for(int i = mid; i < length; i++){
            rightHalf[i - mid] = list[i];
        }
        sort(leftHalf, mid);
        sort(rightHalf, length - mid);
        merge(list, leftHalf, rightHalf,mid,length - mid);

        
    }
    public static void merge(int [] list, int [] leftList, int [] rightList, int lower, int upper){
        int x = 0, y = 0, z = 0;

        while(x < lower && y < upper){
            if(leftList[x] <= rightList[y]){
                list[z] = leftList[x];
                x++;
            }else{
                list[z] = rightList[y];
                y++;
            }
            z++;
        }
        while(x < lower){
            list[z] = leftList[x];
            x++;
            z++;
        }
        while(y < upper){
            list[z] = rightList[y];
            y++;
            z++;
        }
    }
    public static int maxDivideAndConquer(int [] list){
        sort(list,list.length);
        return list[list.length-1];
    }
}
