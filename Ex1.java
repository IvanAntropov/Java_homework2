// найти длину макс последовательности

public class Ex1{

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d; ", arr[i]);
        }
    }

    //Надеюсь я правильно понял что такое макс последовательность
    //Записывает в строку максимальную последовательность из двух, возвращает строку
    static String sequence(int[] arr, int[] arr2){
        int j = 0;
        int i = 0;
        String sequence = "";
        while(i < arr.length && j < arr2.length) {
            if(arr[i] == arr2[j]) {
                sequence += arr[i] + " ";
                j++;
                i++;
            }else{
                j++;
                if (j >= arr2.length) {
                    j = i;
                    i++;
                }
            }
        }
        return sequence;
    }

    public static void main(String[] args){

        int[] originalSequence = new int[]{0,0,0,1,2,2,2,3,3,4,5,5,5,6,6,6,7,8,9,9};
        int[] changedSequence = new int[]{0,1,1,1,2,3,3,3,4,4,5,5,5,6,6,7,7,8,8,9};
        // 0 1 2 3 3 4 5 5 5 6 6 7 8 9

//        int[] originalSequence = new int[]{1,3,3,4,1,2,3,4}; // последовательности с семинара
//        int[] changedSequence = new int[]{1,3,4,4,1,2,3,7,8,9};
//        // 1 3 3 1 2 3


        System.out.println("OriginalSequence: ");
        printArr(originalSequence);

        System.out.println("\nchangedSequence: ");
        printArr(changedSequence);

        System.out.println();
        String[] maxSequence = sequence(originalSequence,changedSequence).split(" ");
        System.out.printf("Длина максимальной последовательности: %d\n", maxSequence.length);
        for (int i = 0; i < maxSequence.length; i++){
            System.out.printf("%s ", maxSequence[i]);
        }
    }
}