public class SelectionSortJava {


    public static void SelectionSort(int[] ar)
    {
        int min;

        for (int i=0; i< ar.length-1; i++)
        {
            min = i;
            for (int j=i+1; j<ar.length; j++)
            {
                if (ar[j]  < ar[min]) min = j;
            }
            if (min != i) swap(ar,i,min);
        }
    }

    public static void swap(int[] ar, int left, int rihgt)
    {
        int temp = ar[left];
        ar[left] = ar[rihgt];
        ar[rihgt] = temp;
    }


    public static void main(String[] args) {

        int[] ar = {43,5,3,7,5,6,8,9,3,2,1};

        SelectionSort(ar);
        int[] sortedAr = ar;

        for (int i = 0; i< sortedAr.length; i++)
        {
            System.out.print(sortedAr[i] + " ");
        }

    }
}
