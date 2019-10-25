public class LinearSearch {

        private int value;

        public  void search(int[] arr, int value)
        {  boolean isFound= false ;
            int counter=0 ;
            for(int i=0 ; i<arr.length;i++)
            { counter++;
                if(arr[i]==value)
                {
                    isFound=true;

                    break ;
                }
                else
                    isFound=false;
            }
            if(isFound==true)
            {
                System.out.println("The value is found in the array at:" + counter);
            }
            else
                System.out.println("The value is not found in the array");

        }
        public static void main(String[] args)
        {
            int[] arr={25,23,5,12,8,9,10,84,95,19};
            LinearSearch objectA= new LinearSearch();
            objectA.search(arr,10);

        }
    }

