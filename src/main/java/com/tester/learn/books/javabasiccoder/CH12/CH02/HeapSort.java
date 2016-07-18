package com.tester.learn.books.javabasiccoder.CH12.CH02;

/**
 * Created by leosong on 16/7/18.
 */
public class HeapSort {

    public static void heapSort(DataWrap[] data)
    {

        System.out.println("start to sort: \n");
        int arrayLength = data.length;
        for (int i =0;i <arrayLength -1;i++) {
            buildMaxdHeap(data, arrayLength - 1 - i);
            swap(data, 0, arrayLength - 1 - i);
            System.out.println(java.util.Arrays.toString(data));

        }
    }

        private static void buildMaxdHeap(DataWrap[] data, int lastIndex)
        {
            for(int i =(lastIndex -1)/2; i>=0;i--)
            {
                int k = i;

                while(k*2 + 1 <= lastIndex)
                {
                    int biggerIndex = 2*k +1;
                    if(biggerIndex < lastIndex)
                    {
                        if(data[biggerIndex].compareTo(data[biggerIndex +1]) < 0)
                        {
                            biggerIndex++;
                        }
                    }


                    if(data[k].compareTo(data[biggerIndex]) < 0)
                    {
                        swap(data,k,biggerIndex);
                        k = biggerIndex;
                    }else
                    {
                        break;
                    }

                }

            }
        }


        private static void swap(DataWrap[] data,int i,int j)
        {
            DataWrap tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }

        public static void main(String[] args)
        {
            DataWrap[] data = {
                    new DataWrap(21,""),
                    new DataWrap(30,""),
                    new DataWrap(49,""),
                    new DataWrap(30,""),
                    new DataWrap(21,""),
                    new DataWrap(16,""),
                    new DataWrap(9,"")
            };

            System.out.println("before sort: " + java.util.Arrays.toString(data));
            heapSort(data);
            System.out.println("after sort:" + java.util.Arrays.toString(data));


        }

    }



