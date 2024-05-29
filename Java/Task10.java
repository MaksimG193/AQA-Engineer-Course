import java.util.Arrays;
//Task10
public static void arrChange(){
    int[] arr ={1,1,0,0,1,0,1,0,0,1};
    for(int a =0; a< arr.length;a++) {
        if (arr[a] == 0){
        arr[a] = 1;
    }else{ arr[a]=0;
        }
    }
}

public void main() {
    arrChange();
}
