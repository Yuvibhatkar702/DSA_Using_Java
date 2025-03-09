
/*

    * Heap is a data Structer that create using Array or ArrayList
    * Heap is Provide a Priority Vise values
    * The Root is always be a smaller than any Aother Node in the three.
    

 * There are Three Propertys i Heaps
 * 
 *       1. Binary tree
 *              * At Most 2 Childern
 * 
 * 
 *         2. Complete Binary Tree
 *              * CBI is a BST in which all the levels are Completerly Filled excepts possibly the last one, Which
 *                  is failled from the left to right
 * 
 *        3. Heap Order Property
 * 
 *          Childern >= Parent ( minHeap );
 *          Childern <= Parent ( maxHrap );
 */     


 // Insert in Heap Data Stucture

import java.util.ArrayList;

public class Heaps {

    public class Heap{ // O(logn)

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){

            // Add Data at Last Index, Whean whare the data add in the Array, the data automatically add in last posion 

            arr.add(data);

            int childIndex = arr.size()-1; // child Index 

            int parentIndex = (childIndex-1)/2; // parent Index

            while (arr.get(childIndex) < arr.get(parentIndex)) {
                int temp = arr.get(childIndex);
                arr.set(childIndex, parentIndex);
                arr.set(parentIndex, temp);
            }

        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minInx = i;

            if(left < arr.size() && arr.get(minInx) > arr.get(left)){
                minInx = left;
            }

            if(right < arr.size() && arr.get(minInx) > arr.get(right)){
                minInx = right;
            }

            if (minInx != i) {
                // swap
                
                int temp = arr.get(i);
                arr.set(i, arr.get(minInx));
                arr.set(minInx, temp);

                heapify(0);
               
            }
        }
        public int remove(){

            int data = arr.get(0);

            //step 1 :- Swap first And Last
            int temp = arr.get(0);
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);

            // Step 2 :- remove Last Node 
            arr.remove(arr.size()-1);

            // Step 3 :- Heapfy
            heapify(0);
            return data;     

        }
    }
    public static void main(String args[]){

    }
 }