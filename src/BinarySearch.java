public class BinarySearch {

        public int Search(int[] arr,int target ,int start ,int end)
        {
            int middle = (int)Math.floor(((start+end)/2));
            int value=arr[middle];
            if(target<value)
            {   System.out.println("target<value");
                return Search(arr,target,start,middle-1);

            }
            else if(target>value)
            {  System.out.println("target > value");
                return Search(arr,target,middle+1,end);
            }
            else
                System.out.println("The target is found at the middle");
            return middle;

        }

        public static void main(String[] args)
        {  int[] arr={2,6,8,10,18,26,27,84,92};
            BinarySearch objA= new BinarySearch();
            objA.Search(arr,10,0,arr.length);
            int index=objA.Search(arr,2,0,arr.length);
            System.out.println("Found at index:" + index);

        }

}
